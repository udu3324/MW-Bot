package com.udu3324.chat;

import com.udu3324.events.Abyss.AbyssEvent;
import com.udu3324.events.Bait.BaitEvent;
import com.udu3324.events.Castle.CastleEvent;
import com.udu3324.events.Fox.FoxEvent;
import com.udu3324.events.Giant.GiantEvent;
import com.udu3324.events.Snow.SnowEvent;
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

    public synchronized void run() {
        try {
            Runtime run = Runtime.getRuntime();
            Process process = run.exec("powershell.exe Get-Content \"" + Data.logFile + "\" -Wait -Tail 1");
            Scanner scan = new Scanner(process.getInputStream());

            Runnable chatHook = () -> {
                if (scan.hasNextLine()) {
                    line = scan.nextLine();

                    // Stop NullPointerException in channel variables
                    if (Data.sessionMake == 0) {

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

                                MarketChat market = new MarketChat();
                                market.run();

                                SharpenChat sharpen = new SharpenChat();
                                sharpen.run();

                                VoteChat vote = new VoteChat();
                                vote.run();

                                PlyrLstMsr list = new PlyrLstMsr();
                                list.run();

                                //todo add back when global death message are removed
                                //ChannelChat channel = new ChannelChat();
                                //channel.run();

                                /* MW Event Chat Searcher/Filter */
                                if (!minecraftChat.contains("*")) {
                                    System.out.println("c" + count + " | " + minecraftChat);
                                    if (count > 0) {
                                        if (count == 1 && minecraftChat.contains("7\\nLearn more: minewind.com/battle")) {
                                            CastleEvent castle = new CastleEvent();
                                            castle.run();
                                        }
                                    } else {
                                        if (line.contains("Queued as")) {
                                            Data.botLog.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                                        }
                                        if (line.contains("Queue=")) {
                                            Data.botLog.sendMessage(Data.pingMaintainer + ", the bot is currently in queue on the server to rejoin. " + minecraftChat).queue();
                                        }
                                        if (line.contains("Reconnecting...")) {
                                            Data.botLog.sendMessage(Data.pingMaintainer + ", the bot is reconnecting into the server.").queue();
                                        }

                                        /* Remove Starting Color Code */
                                        mwEvent = minecraftChat.substring(2);

                                        GiantEvent giant = new GiantEvent();
                                        giant.run();

                                        SnowEvent snow = new SnowEvent();
                                        snow.run();

                                        AbyssEvent abyss = new AbyssEvent();
                                        abyss.run();

                                        FoxEvent fox = new FoxEvent();
                                        fox.run();

                                        BaitEvent bait = new BaitEvent();
                                        bait.run();

                                        CastleEvent castle = new CastleEvent();
                                        castle.run();
                                    }
                                }

                            }
                        } else {
                            if (line.contains("lastServerEntry: Minecraft Server, attempt:")) {
                                Data.botLog.sendMessage("<@395649963415306242>, the bot is attempting to join back into the server.").queue();
                            }
                            if (line.contains("Connecting to play.minewind.net, 25565")) {
                                Data.botLog.sendMessage("<@395649963415306242>, the bot is back online/tried to join the server.").queue();
                            }
                        }
                    } else {
                        System.out.println(" <!> Create a session! <!> " + line);
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