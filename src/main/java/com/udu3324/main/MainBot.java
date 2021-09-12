package com.udu3324.main;

import com.udu3324.chat.ChatHook;
import com.udu3324.commands.member.Credits;
import com.udu3324.commands.member.Help;
import com.udu3324.commands.member.Ping;
import com.udu3324.commands.member.PlayerList;
import com.udu3324.commands.staff.Info;
import com.udu3324.commands.staff.Rules;
import com.udu3324.commands.staff.Session;
import com.udu3324.ui.BotUI;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class MainBot extends ListenerAdapter {
    static {
        ChatHook object = new ChatHook();
        object.run();
    }

    public static void main(String[] args) throws LoginException {
        // Discord Bot Builder
        JDABuilder
                .createLight(Token.token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
                .addEventListeners(new Session(), new Info(), new Rules(), new PlayerList(), new Ping(), new Credits(), new Help())
                .setActivity(Activity.playing(Data.activity))
                .build();

        // Create UI
        new BotUI();
    }

}
