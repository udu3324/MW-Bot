package com.udu3324.commands.member;

import com.udu3324.main.Data;
import com.udu3324.main.PlyrLstMsr;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayerList extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        //really in-efficient code that does stuff that I should probably burn because no one uses it
        Message playerList = event.getMessage();
        if (playerList.getContentRaw().equals(Data.command + "player-list")) {
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
    }
}
