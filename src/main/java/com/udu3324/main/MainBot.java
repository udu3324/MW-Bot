package com.udu3324.main;

import com.udu3324.commands.member.*;
import com.udu3324.commands.staff.*;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class MainBot {
    public static void main(String[] args) throws LoginException {
        System.out.println("+------------------------------------------+\n" +
                           "|           MW Bot is by udu3324           |\n" +
                           "+------------------------------------------+\n" +
                           "| Hey! Thank you for looking at my code.   |\n" +
                           "| Check out more of my projects on Github! |\n" +
                           "| -----> https://github.com/udu3324 <----- |\n" +
                           "|                                          |\n" +
                           "| MW Bot attaches onto MC by reading its   |\n" +
                           "| latest.log lines and parsing it. It pa-  |\n" +
                           "| rses the lines into things like events   |\n" +
                           "| happening on the server, votes, sharpe-  |\n" +
                           "| ning alerts, and more.                   |\n" +
                           "+------------------------------------------+");
        // Discord Bot Builder
        JDABuilder
                .createLight(Token.token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.DIRECT_MESSAGES)
                .addEventListeners(new ReadyListener(), new Info(), new Rules(), new Ping(), new Credits(), new Help())
                .setActivity(Activity.playing(Data.activity))
                .build();
    }
}
