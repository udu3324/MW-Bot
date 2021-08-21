package com.udu3324.events.Giant;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Variables;

import java.util.Date;
import java.util.Objects;

public class GiantEvent {
    public synchronized void run() {
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 30 minutes.")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attack30m.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 30m. " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 20 minutes.")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attack20m.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 20m. " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 10 minutes.")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attack10m.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 10m. " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 5 minutes.")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attack5m.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 5m. " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 1 minute.")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attack1m.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 1m. " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant begins in 10 seconds.")) {
            GiantVar.attack10s.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attack10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant has begun!")) {
            Variables.attack.sendMessage("|| " + Variables.pingAttack + " ||").queue();
            GiantVar.attackStart.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attackStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantStartIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant has started! " + "`" + Variables.pingAttack).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Attack on Giant ends!")) {
            GiantVar.attackEnd.setTimestamp(new Date().toInstant());
            Variables.attack.sendMessage(GiantVar.attackEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.giantEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Attack on Giant has ended. " + "`").queue(message -> message.crosspost().queue());
        }
    }
}
