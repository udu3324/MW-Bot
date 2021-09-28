package com.udu3324.commands.staff;

import com.udu3324.main.Data;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Session extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Member author = event.getMember();

        Message session = event.getMessage();
        if (session.getContentRaw().equals(Data.command + "session")) {
            if (session.isFromType(ChannelType.TEXT)) {
                MessageChannel channel = event.getChannel();
                assert author != null;
                String userRoles = String.valueOf(author.getRoles());
                if (userRoles.contains(Data.staffRoleID)) {
                    channel.sendMessage("Created a new session for the bot.").queue();
                    Data.attack = event.getGuild().getTextChannelById(Data.eventChannelAttackOnGiant);
                    Data.snow = event.getGuild().getTextChannelById(Data.eventChannelSnow);
                    Data.abyss = event.getGuild().getTextChannelById(Data.eventChannelAbyss);
                    Data.fox = event.getGuild().getTextChannelById(Data.eventChannelFox);
                    Data.bait = event.getGuild().getTextChannelById(Data.eventChannelBait);
                    Data.castle = event.getGuild().getTextChannelById(Data.eventChannelCastle);
                    Data.chat = event.getGuild().getTextChannelById(Data.eventChannelBotLog);
                    Data.rawAlert = event.getGuild().getTextChannelById(Data.eventChannelRawAlert);
                    Data.market = event.getGuild().getTextChannelById(Data.eventChannelMarket);
                    Data.sharpen = event.getGuild().getTextChannelById(Data.eventChannelSharpen);
                    Data.votes = event.getGuild().getTextChannelById(Data.eventChannelVotes);
                    System.out.println(Data.attack);
                    System.out.println(Data.snow);
                    System.out.println(Data.abyss);
                    System.out.println(Data.fox);
                    System.out.println(Data.bait);
                    System.out.println(Data.castle);
                    System.out.println(Data.chat);
                    System.out.println(Data.rawAlert);
                    System.out.println(Data.market);
                    System.out.println(Data.sharpen);
                    System.out.println(Data.votes);
                    Data.sessionMake = 0; //true
                    Data.chat.sendMessage("Bot has a new session.").queue();
                } else {
                    channel.sendMessage("You do not have access to this command.").queue();
                }
            }
        }
    }
}
