package com.udu3324.events.Abyss;

import com.udu3324.main.ChatHook;
import com.udu3324.main.Variables;

import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class AbyssEvent {
    public synchronized void run() {
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 30 minutes.")) {
            Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
            AbyssVar.abyss30m.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 30m. " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 20 minutes.")) {
            Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
            AbyssVar.abyss20m.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 20m. " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 10 minutes.")) {
            Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
            AbyssVar.abyss10m.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 10m. " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 5 minutes.")) {
            Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
            AbyssVar.abyss5m.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 5m. " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 1 minute.")) {
            Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
            AbyssVar.abyss1m.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 1m. " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Abyssal event begins in 10 seconds.")) {
            AbyssVar.abyss10s.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyss10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Abyssal begins in 10s. " + "`").queue(message -> message.crosspost().queue());

            //schedule begin msg
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Variables.abyss.sendMessage("|| " + Variables.pingAbyss + " ||").queue();
                    AbyssVar.abyssStart.setTimestamp(new Date().toInstant());
                    Variables.abyss.sendMessage(AbyssVar.abyssStart.build())
                            .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssStartIcon)), "image.gif")
                            .queue(message -> message.crosspost().queue());
                    Variables.rawAlert.sendMessage("`" + "Abyssal has started! " + "`" + Variables.pingAbyss).queue(message -> message.crosspost().queue());
                }
            };
            timer.schedule(task, 10000);
        }
        if (ChatHook.getMwEvent().contains(" wins the abyssal event! Poseidon is pleased!")) {
            AbyssVar.abyssEnd.setDescription(ChatHook.getMwEvent());
            AbyssVar.abyssEnd.setTimestamp(new Date().toInstant());
            Variables.abyss.sendMessage(AbyssVar.abyssEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.abyssEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + ChatHook.getMwEvent() + "`").queue(message -> message.crosspost().queue());
        }
    }
}
