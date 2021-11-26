package com.udu3324.chat;

import com.udu3324.events.abyss.AbyssalEvent;
import com.udu3324.events.bait.BaitEvent;
import com.udu3324.events.castle.CastleEvent;
import com.udu3324.events.fox.FoxHuntEvent;
import com.udu3324.events.giant.AttackOnGiantEvent;
import com.udu3324.events.snow.SnowvasionEvent;
import com.udu3324.main.Data;
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

    MarketChat market = new MarketChat();
    SharpenChat sharpen = new SharpenChat();
    VoteChat vote = new VoteChat();
    ChannelChat channel = new ChannelChat();

    AttackOnGiantEvent giant = new AttackOnGiantEvent();
    SnowvasionEvent snow = new SnowvasionEvent();
    AbyssalEvent abyss = new AbyssalEvent();
    FoxHuntEvent fox = new FoxHuntEvent();
    BaitEvent bait = new BaitEvent();
    CastleEvent castle = new CastleEvent();

    String tailerCmd;
    {
        if (System.getProperty("os.name").contains("Linux")) {
            tailerCmd = "todo command"; //todo, does not work
        } else if (System.getProperty("os.name").contains("Windows")) {
            tailerCmd = "powershell.exe Get-Content \"" + Data.logFile + "\" -Wait -Tail 1";
        }
    }

    public synchronized void run() {
        try {
            //run tailer command and read from it
            Runtime run = Runtime.getRuntime();
            Process process = run.exec(tailerCmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            //basically a while replacement as I hate while statements
            Runnable chatHook = () -> {
                try {
                    if (reader.ready()) {
                        line = reader.readLine();

                        // Make sure input line is not from messages and does not contain unwanted things from MCC
                        if (!line.contains(">> ") && !line.contains("Link: ") && !line.contains("### Log started at ")) {
                            chatLook(line);
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
    public synchronized void chatLook(String minecraftChat) {

        //check if chat contain these critical lines to then alert maintainer
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
                castle.run(); //good
            }
        }
    }
}