package com.udu3324.main;

import com.udu3324.chat.ChatHook;
import com.udu3324.ui.BotUI;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

class ReadyListener extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent ev) {
        JDA jda = ev.getJDA(); // This JDA instance is fully built, so do more stuff with this JDA instance

        // Set Channels
        Data.beef = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelBeef);
        Data.attack = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelAttackOnGiant);
        Data.snow = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelSnowvasion);
        Data.abyss = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelAbyssal);
        Data.fox = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelFoxHunt);
        Data.bait = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelBait);
        Data.castle = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelCastle);
        Data.chat = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelChatOrBotLog);
        Data.rawAlert = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelRawAlerts);
        Data.market = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelMarket);
        Data.sharpen = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelSharpen);
        Data.votes = Objects.requireNonNull(jda.getGuildById(Data.guildID)).getTextChannelById(Data.channelVotes);

        // Create UI
        new BotUI();

        // Create ChatHook
        ChatHook object = new ChatHook();

        // Create Thread
        Thread logHook = new Thread(object, "ChatHook that hooks onto mc chat");
        logHook.setDaemon(true);
        logHook.start();
    }
}
