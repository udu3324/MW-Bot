package com.udu3324.chat;

import com.udu3324.events.abyss.AbyssEvent;
import com.udu3324.events.bait.BaitEvent;
import com.udu3324.events.castle.CastleEvent;
import com.udu3324.events.fox.FoxEvent;
import com.udu3324.events.giant.GiantEvent;
import com.udu3324.events.snow.SnowEvent;
import com.udu3324.main.Data;
import com.udu3324.main.PlyrLstMsr;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ChatHook extends TimerTask {
    public static String line;
    public static String minecraftChat;
    public static Integer count;
    public static String IGNString;
    public static String getMcChat() {
        return minecraftChat;
    }
    public static Integer getCount() {
        return count;
    }
    public static String getChatIGN() {
        return IGNString;
    }

    MarketChat market = new MarketChat();
    SharpenChat sharpen = new SharpenChat();
    VoteChat vote = new VoteChat();
    PlyrLstMsr list = new PlyrLstMsr();
    ChannelChat channel = new ChannelChat();

    GiantEvent giant = new GiantEvent();
    SnowEvent snow = new SnowEvent();
    AbyssEvent abyss = new AbyssEvent();
    FoxEvent fox = new FoxEvent();
    BaitEvent bait = new BaitEvent();
    CastleEvent castle = new CastleEvent();

    String tailerCmd;
    {
        if (System.getProperty("os.name").contains("Linux")) {
            tailerCmd = "powershell.exe Get-Content \"" + Data.logFile + "\" -Wait -Tail 1"; //todo, does not work
        } else if (System.getProperty("os.name").contains("Windows")) {
            tailerCmd = "powershell.exe Get-Content \"" + Data.logFile + "\" -Wait -Tail 1";
        }
    }

    public synchronized void run() {
        try {
            Runtime run = Runtime.getRuntime();
            Process process = run.exec(tailerCmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            Runnable chatHook = () -> {
                try {
                    if (reader.ready()) {
                        line = reader.readLine();

                        // Make sure line is not from msg
                        if (!line.contains(">> ") && !line.contains("Link: ") && !line.contains("### Log started at ")) {
                            chatLook();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };

            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            executor.scheduleAtFixedRate(chatHook, 0, 1, TimeUnit.NANOSECONDS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public synchronized void chatLook() {
        minecraftChat = line;
        if (minecraftChat.contains("Connection has been lost.")) {
            Data.chat.sendMessage("Bot has lost connection to the server. " + Data.pingMaintainer).queue();
        } else if (minecraftChat.contains("Logging in...")) {
            Data.chat.sendMessage("Bot is currently logging into the server. " + Data.pingMaintainer).queue();
        } else if (minecraftChat.contains("Server was successfully joined.")) {
            Data.chat.sendMessage("Bot has successfully joined the server. " + Data.pingMaintainer).queue();
        } else if (minecraftChat.contains("Disconnected by Server :")) {
            Data.chat.sendMessage("Bot has lost connection to the server. " + Data.pingMaintainer).queue();
        }

        /* Discord Syntax Injection Patch */
        minecraftChat = minecraftChat.replaceAll("`", "");

        /* Counter For ":" */
        count = StringUtils.countMatches(minecraftChat, ":");

        /* IGN String Finder */
        String chatIGN = minecraftChat;
        if (chatIGN.contains(": ") && !chatIGN.contains("*") && !chatIGN.contains("/vote -> ")) {
            int positionOfColon = chatIGN.indexOf(":");
            String IGNStringClan = chatIGN.substring(0, positionOfColon);
            int positionOfPeriod = IGNStringClan.indexOf(".");
            IGNString = IGNStringClan.substring(positionOfPeriod + 1);
        }

        market.run(); //add market chat filter
        sharpen.run(); //add sharpen chat filter
        vote.run(); //add vote chat filter
        list.run(); //add player-list command
        channel.run(); //send message to chat channel

        /* MW Event Chat Searcher/Filter */
        System.out.println("c" + count + " | " + minecraftChat);
        if (!minecraftChat.contains("*")) {
            if (count <= 0) {
                if (minecraftChat.contains("Queued as")) {
                    Data.chat.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                }
                if (minecraftChat.contains("Queue=")) {
                    Data.chat.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                }
                if (minecraftChat.contains("Reconnecting...")) {
                    Data.chat.sendMessage(Data.pingMaintainer + ", the bot is reconnecting into the server.").queue();
                }

                giant.run(); //good
                snow.run(); //good
                abyss.run(); //good
                fox.run(); //good
                bait.run(); //good
                castle.run();
            }
        }
    }
}