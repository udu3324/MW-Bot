package com.udu3324.main;

import com.udu3324.ui.MWBotUI;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiscordBot extends ListenerAdapter {
    // TailerListener To Scan Chat
    static {
        ChatHook object = new ChatHook();
        object.run();
    }

    public static void main(String[] args) throws LoginException {
        // Discord Bot Builder
        JDABuilder
                .createLight(Token.token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
                .addEventListeners(new DiscordBot())
                .setActivity(Activity.playing(Variables.activity))
                .build();

        // Create UI
        new MWBotUI();
    }

    // Bot Commands
    public void onMessageReceived(MessageReceivedEvent event) {
        Member author = event.getMember();

        /*Normal Commands Below*/
        Message help = event.getMessage();
        if (help.getContentRaw().equals(Variables.command + "help")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Help");
            eb.setDescription("Minewind Event Bot is a bot to alert events that will happen in Minewind. All commands are only usable for either staff or normal people in the discord.");
            eb.setColor(new Color(9507588));
            eb.setTimestamp(new Date().toInstant());
            eb.setAuthor("MW Event Bot", null, "https://i.imgur.com/5hL08HS.png");
            eb.addField("Prefix", "The current prefix set is **" + Variables.command + "**", false);

            eb.addField("Member Commands",
                    Variables.command + "**help** - shows help embed\n" +
                            Variables.command + "**player-list** - shows the estimation of players online (measuring chat)\n" +
                            Variables.command + "**ping** - shows time delay between you and the bot\n" +
                            Variables.command + "**credits** - shows credits of the bot and the server", false);

            eb.addField("Staff Commands",
                    Variables.command + "**rules** - shows rules embed\n" +
                            Variables.command + "**info** - shows information embed\n" +
                            Variables.command + "**session** - creates a new session for the bot to work", false);
            MessageChannel channel = event.getChannel();
            channel.sendMessage(eb.build()).queue();
        }

        Message credits = event.getMessage();
        if (credits.getContentRaw().equals(Variables.command + "credits")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Credits");
            eb.setDescription("<@395649963415306242>  - Coder and made castle assets and old bait assets\n" +
                    "<@568165536811188224> - Big advertiser and secretly lexi\n" +
                    "<@311988970777083904> - Big advertiser and asset maker\n" +
                    "<@217806943765528577> - Assists in helping fix issues and code\n" +
                    "<@368811112629665802> - Helped optimise code n stuff\n" +
                    "<@434768343057039372> - Beta tester and bug finder\n" +
                    "<@406265562549977088> - Bug finder\n" +
                    "<@589579149191151637> - Created assets for #abyssal\n" +
                    "<@628722298072858624> - Created assets for #fox, #bait, and #snowvasion\n" +
                    "<@252257930122887168> - Created assets for #fox and made the server icon\n" +
                    "<@725412711495762001> - Created end fox asset");
            eb.setColor(new Color(0x33CC43));
            eb.setTimestamp(new Date().toInstant());
            eb.setFooter("Bot by NintendoOS | https://discord.gg/WWEvMGUKhY", null);
            eb.setAuthor("MW Event Bot", null, "https://i.imgur.com/5hL08HS.png");
            MessageChannel channel = event.getChannel();
            channel.sendMessage(eb.build()).queue();
        }

        Message ping = event.getMessage();
        if (ping.getContentRaw().equals(Variables.command + "ping")) {
            if (ping.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                long time = System.currentTimeMillis();
                channel.sendMessage("Pong!")
                        .queue(response -> response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue());
            }
        }

        Message playerList = event.getMessage();
        if (playerList.getContentRaw().equals(Variables.command + "player-list")) {
            long sT = System.currentTimeMillis(); //start time
            SimpleDateFormat df = new SimpleDateFormat("mm:ss");
            MessageChannel channel = event.getChannel();
            try {
                EmbedBuilder eb = new EmbedBuilder();
                eb.setDescription("**Players Online**\n" +
                        "The number of players online is calculated by storing data of the last msg sent by a player " +
                        "in chat. This means that the list below will not show all players online. (only the ones that are using " +
                        "chat) The time format is minute:seconds."); //change this
                eb.setColor(new Color(0xFF0000)); //change this
                eb.setTimestamp(new Date().toInstant());
                eb.setAuthor("MW Event Bot", null, null); //change this
                channel.sendMessage(eb.build()).queue(); //change this
                channel.sendMessage("```" +
                        "+++ These people in this block are definitely online. +++" +
                        "\n1, " + PlyrLstMsr.getPlyrDat(0) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(1))) + " seconds." +
                        "\n2, " + PlyrLstMsr.getPlyrDat(2) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(3))) + " seconds." +
                        "\n3, " + PlyrLstMsr.getPlyrDat(4) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(5))) + " seconds." +
                        "\n4, " + PlyrLstMsr.getPlyrDat(6) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(7))) + " seconds." +
                        "\n5, " + PlyrLstMsr.getPlyrDat(8) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(9))) + " seconds." +
                        "\n6, " + PlyrLstMsr.getPlyrDat(10) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(11))) + " seconds." +
                        "\n7, " + PlyrLstMsr.getPlyrDat(12) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(13))) + " seconds." +
                        "\n8, " + PlyrLstMsr.getPlyrDat(14) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(15))) + " seconds." +
                        "\n9, " + PlyrLstMsr.getPlyrDat(16) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(17))) + " seconds." +
                        "\n10, " + PlyrLstMsr.getPlyrDat(18) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(19))) + " seconds." +
                        "```").queue();
                channel.sendMessage("```" +
                        "++ These people in this block are probably online. ++" +
                        "\n11, " + PlyrLstMsr.getPlyrDat(20) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(21))) + " seconds." +
                        "\n12, " + PlyrLstMsr.getPlyrDat(22) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(23))) + " seconds." +
                        "\n13, " + PlyrLstMsr.getPlyrDat(24) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(25))) + " seconds." +
                        "\n14, " + PlyrLstMsr.getPlyrDat(26) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(27))) + " seconds." +
                        "\n15, " + PlyrLstMsr.getPlyrDat(28) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(29))) + " seconds." +
                        "\n16, " + PlyrLstMsr.getPlyrDat(30) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(31))) + " seconds." +
                        "\n17, " + PlyrLstMsr.getPlyrDat(32) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(33))) + " seconds." +
                        "\n18, " + PlyrLstMsr.getPlyrDat(34) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(35))) + " seconds." +
                        "\n19, " + PlyrLstMsr.getPlyrDat(36) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(37))) + " seconds." +
                        "\n20, " + PlyrLstMsr.getPlyrDat(38) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(39))) + " seconds." +
                        "```").queue();
                channel.sendMessage("```" +
                        "? These people in this block are probably afk. ?" +
                        "\n21, " + PlyrLstMsr.getPlyrDat(40) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(41))) + " seconds." +
                        "\n22, " + PlyrLstMsr.getPlyrDat(42) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(43))) + " seconds." +
                        "\n23, " + PlyrLstMsr.getPlyrDat(44) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(45))) + " seconds." +
                        "\n24, " + PlyrLstMsr.getPlyrDat(46) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(47))) + " seconds." +
                        "\n25, " + PlyrLstMsr.getPlyrDat(48) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(49))) + " seconds." +
                        "\n26, " + PlyrLstMsr.getPlyrDat(50) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(51))) + " seconds." +
                        "\n27, " + PlyrLstMsr.getPlyrDat(52) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(53))) + " seconds." +
                        "\n28, " + PlyrLstMsr.getPlyrDat(54) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(55))) + " seconds." +
                        "\n29, " + PlyrLstMsr.getPlyrDat(56) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(57))) + " seconds." +
                        "\n30, " + PlyrLstMsr.getPlyrDat(58) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(59))) + " seconds." +
                        "```").queue();
                channel.sendMessage("```" +
                        "-- These people in this block are probably offline. --" +
                        "\n31, " + PlyrLstMsr.getPlyrDat(60) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(61))) + " seconds." +
                        "\n32, " + PlyrLstMsr.getPlyrDat(62) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(63))) + " seconds." +
                        "\n33, " + PlyrLstMsr.getPlyrDat(64) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(65))) + " seconds." +
                        "\n34, " + PlyrLstMsr.getPlyrDat(66) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(67))) + " seconds." +
                        "\n35, " + PlyrLstMsr.getPlyrDat(68) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(69))) + " seconds." +
                        "\n36, " + PlyrLstMsr.getPlyrDat(70) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(71))) + " seconds." +
                        "\n37, " + PlyrLstMsr.getPlyrDat(72) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(73))) + " seconds." +
                        "\n38, " + PlyrLstMsr.getPlyrDat(74) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(75))) + " seconds." +
                        "\n39, " + PlyrLstMsr.getPlyrDat(76) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(77))) + " seconds." +
                        "\n40, " + PlyrLstMsr.getPlyrDat(78) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(79))) + " seconds." +
                        "```").queue();
                channel.sendMessage("```" +
                        "--- These people in this block are definitely offline. ---" +
                        "\n41, " + PlyrLstMsr.getPlyrDat(80) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(81))) + " seconds." +
                        "\n42, " + PlyrLstMsr.getPlyrDat(82) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(83))) + " seconds." +
                        "\n43, " + PlyrLstMsr.getPlyrDat(84) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(85))) + " seconds." +
                        "\n44, " + PlyrLstMsr.getPlyrDat(86) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(87))) + " seconds." +
                        "\n45, " + PlyrLstMsr.getPlyrDat(88) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(89))) + " seconds." +
                        "\n46, " + PlyrLstMsr.getPlyrDat(90) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(91))) + " seconds." +
                        "\n47, " + PlyrLstMsr.getPlyrDat(92) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(93))) + " seconds." +
                        "\n48, " + PlyrLstMsr.getPlyrDat(94) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(95))) + " seconds." +
                        "\n49, " + PlyrLstMsr.getPlyrDat(96) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(97))) + " seconds." +
                        "\n50, " + PlyrLstMsr.getPlyrDat(98) + " sent a msg in the last " + df.format(sT - Long.parseLong(PlyrLstMsr.getPlyrDat(99))) + " seconds." +
                        "```").queue();
            } catch (NumberFormatException e) {
                System.out.println("Uh oh! " + e);
            }
        }

        /*Staff Commands Below*/
        Message rules = event.getMessage();
        if (rules.getContentRaw().equals(Variables.command + "rules")) {
            if (rules.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                assert author != null;
                String userRoles = String.valueOf(author.getRoles());
                if (userRoles.contains(Variables.staffRoleID)) {
                    EmbedBuilder eb = new EmbedBuilder();
                    eb.setTitle("Rules");
                    eb.setDescription("There are four simple server rules below. Make sure to follow them.\r" +
                            "**1,** Follow the discord [TOS](https://discord.com/terms) and [Guidelines](https://discord.com/guidelines).\n" +
                            "**2,** Use common sense.\n" +
                            "**3,** Advertising discord servers is not allowed. This includes advertising in dms, channels, and more. (unless if its one of the major minewind servers)\n" +
                            "**4,** Spamming, using channels for the wrong purpose, and sending inappropriate messages/content in channels or dms is not allowed.\n" +
                            "**Punishments**\nFailing to follow any rule listed will result in punishments based on how severely you broken the rule. NintendoOS reserves the power to do anything and what is needed.");
                    eb.setColor(new Color(9507588));
                    eb.setTimestamp(new Date().toInstant());
                    eb.setAuthor("MW Event Bot", null, "https://i.imgur.com/5hL08HS.png");
                    channel.sendMessage(eb.build()).queue();
                } else {
                    channel.sendMessage("You do not have access to this command.").queue();
                }
            }
        }

        Message info = event.getMessage();
        if (info.getContentRaw().equals(Variables.command + "info")) {
            if (info.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                assert author != null;
                String userRoles = String.valueOf(author.getRoles());
                if (userRoles.contains(Variables.staffRoleID)) {
                    EmbedBuilder eb = new EmbedBuilder();
                    eb.setTitle("Info");
                    eb.setDescription("Below is information about roles, how the server works, and more.");
                    eb.setColor(new Color(0x4BFFE5));
                    eb.setTimestamp(new Date().toInstant());
                    eb.setFooter("Bot by NintendoOS", null);
                    eb.addField("What is this server for?", "This server is for automatically sending alerts for " +
                            "events happening on play.minewind.com. To get pings for events, go to <#836783519979143208> to get " +
                            "roles and get pinged for a event. This server is only for receiving alerts, not chatting or voice calling. " +
                            "Go to other servers like [Minewind Discord](https://discord.gg/minewind), [Minewind Moon](https://discord.gg/cjWxFFy), " +
                            "and [Minewind Mapart](https://discord.gg/zPJgcMq).", false);
                    eb.addField("What are the roles for in this server?", "The roles in this server are for pinging purposes, and admiring purposes.", false);
                    eb.addField("Staff", "Staff role represent the staff in the MW Events Server.", false);
                    eb.addField("Contributor", "Contributor role represent the people that contributed to help make the MW Events Server/Bot in some way.", false);
                    eb.addField("Server Booster", "Server Booster role represent the Server Boosters that boosted the server in the MW Events Server.", false);
                    eb.addField("Member", "Members role represent the members in the MW Events Server.", false);
                    channel.sendMessage(eb.build()).queue();
                } else {
                    channel.sendMessage("You do not have access to this command.").queue();
                }
            }
        }

        Message session = event.getMessage();
        if (session.getContentRaw().equals(Variables.command + "session")) {
            if (ping.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                assert author != null;
                String userRoles = String.valueOf(author.getRoles());
                if (userRoles.contains(Variables.staffRoleID)) {
                    channel.sendMessage("Created a new session for the bot.").queue();
                    Variables.attack = event.getGuild().getTextChannelById(Variables.eventChannelAttackOnGiant);
                    Variables.snow = event.getGuild().getTextChannelById(Variables.eventChannelSnow);
                    Variables.abyss = event.getGuild().getTextChannelById(Variables.eventChannelAbyss);
                    Variables.fox = event.getGuild().getTextChannelById(Variables.eventChannelFox);
                    Variables.bait = event.getGuild().getTextChannelById(Variables.eventChannelBait);
                    Variables.castle = event.getGuild().getTextChannelById(Variables.eventChannelCastle);
                    Variables.botLog = event.getGuild().getTextChannelById(Variables.eventChannelBotLog);
                    Variables.rawAlert = event.getGuild().getTextChannelById(Variables.eventChannelRawAlert);
                    Variables.market = event.getGuild().getTextChannelById(Variables.eventChannelMarket);
                    Variables.sharpen = event.getGuild().getTextChannelById(Variables.eventChannelSharpen);
                    Variables.votes = event.getGuild().getTextChannelById(Variables.eventChannelVotes);
                    System.out.println(Variables.attack);
                    System.out.println(Variables.snow);
                    System.out.println(Variables.abyss);
                    System.out.println(Variables.fox);
                    System.out.println(Variables.bait);
                    System.out.println(Variables.castle);
                    System.out.println(Variables.botLog);
                    System.out.println(Variables.rawAlert);
                    System.out.println(Variables.market);
                    System.out.println(Variables.sharpen);
                    System.out.println(Variables.votes);
                    Variables.sessionMake = 0; //true
                    Variables.botLog.sendMessage("Bot has a new session.").queue();
                } else {
                    channel.sendMessage("You do not have access to this command.").queue();
                }
            }
        }
    }
}
