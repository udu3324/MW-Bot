package com.udu3324.commands.member;

import com.udu3324.main.Data;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Date;

public class Help extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Message help = event.getMessage();
        //send the help embed
        if (help.getContentRaw().equals(Data.command + "help")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Help");
            eb.setDescription("Minewind Event Bot is a bot to alert events that will happen in Minewind. All commands are only usable for either staff or normal people in the discord.");
            eb.setColor(new Color(9507588));
            eb.setTimestamp(new Date().toInstant());
            eb.setAuthor("MW Event Bot", null, "https://i.imgur.com/5hL08HS.png");
            eb.addField("Prefix", "The current prefix set is **" + Data.command + "**", false);

            eb.addField("Member Commands",
                    Data.command + "**help** - shows help embed\n" +
                            Data.command + "**ping** - shows time delay between you and the bot\n" +
                            Data.command + "**credits** - shows credits of the bot and the server", false);

            eb.addField("Staff Commands",
                    Data.command + "**rules** - shows rules embed\n" +
                            Data.command + "**info** - shows information embed", false);
            MessageChannel channel = event.getChannel();
            channel.sendMessage(eb.build()).queue();
        }
    }
}
