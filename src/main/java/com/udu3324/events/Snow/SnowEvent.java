package com.udu3324.events.Snow;

import com.udu3324.main.ChatHook;
import com.udu3324.main.Variables;

import java.util.Date;
import java.util.Objects;

public class SnowEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Snowmen invade the spawn!")) {
            Variables.snow.sendMessage("|| " + Variables.pingSnow + " ||").queue();
            SnowVar.snowStart.setTimestamp(new Date().toInstant());
            Variables.snow.sendMessage(SnowVar.snowStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.snowStartIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Snowvasion has started! " + "`" + Variables.pingSnow).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Snowmen melt away!")) {
            SnowVar.snowEnd.setTimestamp(new Date().toInstant());
            Variables.snow.sendMessage(SnowVar.snowEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.snowEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Snowvasion has ended. " + "`").queue(message -> message.crosspost().queue());
        }
    }
}
