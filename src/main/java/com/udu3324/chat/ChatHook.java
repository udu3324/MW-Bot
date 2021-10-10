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

import java.io.IOException;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ChatHook extends TimerTask {
    public static String line;
    public static String minecraftChat;
    public static Integer count;
    public static String mwEvent;
    public static String IGNString;

    public static String getLine() {
        return line;
    }

    public static String getMcChat() {
        return minecraftChat;
    }

    public static Integer getCount() {
        return count;
    }

    public static String getChatIGN() {
        return IGNString;
    }

    public static String getMwEvent() {
        return mwEvent;
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
            Scanner scan = new Scanner(process.getInputStream());

            Runnable chatHook = () -> {
                if (scan.hasNextLine()) {
                    line = scan.nextLine();

                    // Make sure line is shown in chat
                    if (line.contains("[CHAT]")) {

                        // Make sure line is not from msg
                        if (!line.contains(" >> ")) {

                            /* Raw Chat String Converter */
                            minecraftChat = line.substring(Data.subString);

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

                            market.run();
                            sharpen.run();
                            vote.run();
                            list.run();
                            channel.run();

                            /* MW Event Chat Searcher/Filter */
                            System.out.println("c" + count + " | " + minecraftChat);
                            if (!minecraftChat.contains("*")) {
                                if (count > 0) {
                                    if (count == 1 && minecraftChat.contains("7\\nLearn more: minewind.com/battle")) {
                                        castle.run();
                                    }
                                } else {
                                    if (line.contains("Queued as")) {
                                        Data.chat.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                                    }
                                    if (line.contains("Queue=")) {
                                        Data.chat.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                                    }
                                    if (line.contains("Reconnecting...")) {
                                        Data.chat.sendMessage(Data.pingMaintainer + ", the bot is reconnecting into the server.").queue();
                                    }

                                    /* Remove Starting Color Code */
                                    mwEvent = minecraftChat.substring(2);

                                    giant.run();
                                    snow.run();
                                    abyss.run();
                                    fox.run();
                                    bait.run();
                                    castle.run();
                                }
                            }
                        }
                    } else {
                        if (line.contains("lastServerEntry: Minecraft Server, attempt:")) {
                            Data.chat.sendMessage("<@395649963415306242>, the bot is attempting to join back into the server.").queue();
                        }
                        if (line.contains("Connecting to play.minewind.net, 25565")) {
                            Data.chat.sendMessage("<@395649963415306242>, the bot is back online/tried to join the server.").queue();
                        }
                    }
                }
            };

            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
            executor.scheduleAtFixedRate(chatHook, 0, 1, TimeUnit.NANOSECONDS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}