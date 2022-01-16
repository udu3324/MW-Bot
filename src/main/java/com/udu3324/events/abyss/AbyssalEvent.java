package com.udu3324.events.abyss;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;
import com.udu3324.main.FixString;

import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class AbyssalEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Abyssal event begins in 30 minutes.")) {
            Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
            AbyssVar.abyss30m.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 30m. " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Abyssal event begins in 20 minutes.")) {
            Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
            AbyssVar.abyss20m.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 20m. " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Abyssal event begins in 10 minutes.")) {
            Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
            AbyssVar.abyss10m.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 10m. " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Abyssal event begins in 5 minutes.")) {
            Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
            AbyssVar.abyss5m.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 5m. " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Abyssal event begins in 1 minute.")) {
            Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
            AbyssVar.abyss1m.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 1m. " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Abyssal event begins in 10 seconds.")) {
            AbyssVar.abyss10s.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyss10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Abyssal begins in 10s. " + "`").queue(message -> message.crosspost().queue());

            //schedule begin msg
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Data.abyss.sendMessage("|| " + Data.pingAbyss + " ||").queue();
                    AbyssVar.abyssStart.setTimestamp(new Date().toInstant());
                    Data.abyss.sendMessageEmbeds(AbyssVar.abyssStart.build())
                            .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssStartIcon)), "image.gif")
                            .queue(message -> message.crosspost().queue());
                    Data.rawAlert.sendMessage("`" + "Abyssal has started! " + "`" + Data.pingAbyss).queue(message -> message.crosspost().queue());
                }
            };
            timer.schedule(task, 10000);
        }
        if (ChatHook.getMcChat().contains(" wins the abyssal event! Poseidon is pleased!")) {
            String fixed = FixString.fix(ChatHook.getMcChat());
            AbyssVar.abyssEnd.setDescription(fixed);
            AbyssVar.abyssEnd.setTimestamp(new Date().toInstant());
            Data.abyss.sendMessageEmbeds(AbyssVar.abyssEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.abyssEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + ChatHook.getMcChat() + "`").queue(message -> message.crosspost().queue());
        }
    }
}
