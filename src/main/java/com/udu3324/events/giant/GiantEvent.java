package com.udu3324.events.giant;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;

import java.util.Date;
import java.util.Objects;

public class GiantEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 30 minutes.")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attack30m.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 30m. " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 20 minutes.")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attack20m.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 20m. " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 10 minutes.")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attack10m.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 10m. " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 5 minutes.")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attack5m.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 5m. " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 1 minute.")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attack1m.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 1m. " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant begins in 10 seconds.")) {
            GiantVar.attack10s.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attack10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant has begun!")) {
            Data.attack.sendMessage("|| " + Data.pingAttack + " ||").queue();
            GiantVar.attackStart.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attackStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantStartIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant has started! " + "`" + Data.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Attack on Giant ends!")) {
            GiantVar.attackEnd.setTimestamp(new Date().toInstant());
            Data.attack.sendMessage(GiantVar.attackEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.giantEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Attack on Giant has ended. " + "`").queue(message -> message.crosspost().queue());
        }
    }
}
