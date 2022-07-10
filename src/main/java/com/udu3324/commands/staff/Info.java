package com.udu3324.commands.staff;

import com.udu3324.main.Data;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Info extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Member author = event.getMember();

        Message info = event.getMessage();
        //send a info embed
        if (info.getContentRaw().equals(Data.command + "info")) {
            if (info.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                assert author != null;
                String userRoles = String.valueOf(author.getRoles());
                if (userRoles.contains(Data.staffRoleID)) {
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
                    eb.addField("Staff", "Staff role represent the staff in the MW Events Server.", false);
                    eb.addField("Contributor", "Contributor role represent the people that contributed to help make the MW Events Server/Bot in some way.", false);
                    eb.addField("Server Booster", "Server Booster role represent the Server Boosters that boosted the server in the MW Events Server.", false);
                    channel.sendMessageEmbeds(eb.build()).queue();
                    info.delete().queueAfter(3, TimeUnit.SECONDS);
                } else {
                    channel.sendMessage("You do not have access to this command.").queue();
                }
            }
        }
    }
}
