package com.udu3324.commands.member;

import com.udu3324.main.Data;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.util.Date;

public class Credits extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        Message credits = event.getMessage();
        //send the credits msg :)
        if (credits.getContentRaw().equals(Data.command + "credits")) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("Credits");
            eb.setDescription("<@395649963415306242> - Coder and made castle assets and old bait assets\n" +
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
    }
}
