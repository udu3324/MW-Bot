package com.udu3324.events.snow;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;

import java.util.Date;
import java.util.Objects;

public class SnowvasionEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Snowmen invade the spawn!")) {
            Data.snow.sendMessage("|| " + Data.pingSnow + " ||").queue();
            SnowVar.snowStart.setTimestamp(new Date().toInstant());
            Data.snow.sendMessageEmbeds(SnowVar.snowStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.snowStartIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Snowvasion has started! " + "`" + Data.pingSnow).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Snowmen melt away!")) {
            SnowVar.snowEnd.setTimestamp(new Date().toInstant());
            Data.snow.sendMessageEmbeds(SnowVar.snowEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.snowEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Snowvasion has ended. " + "`").queue(message -> message.crosspost().queue());
        }
    }
}
