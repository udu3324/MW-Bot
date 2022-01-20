package com.udu3324.events.beef;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;

import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeefEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Beef Event begins in 1 hour.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef1hr.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef1hr.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 1hr. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 30 minutes.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef30m.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 30m. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 20 minutes.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef20m.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 20m. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 10 minutes.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef10m.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 10m. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 5 minutes.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef5m.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 5m. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 1 minute.")) {
            Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
            BeefVar.beef1m.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 1m. " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Beef Event begins in 10 seconds.")) {
            BeefVar.beef10s.setTimestamp(new Date().toInstant());
            Data.beef.sendMessageEmbeds(BeefVar.beef10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Beef begins in 10s. " + "`").queue(message -> message.crosspost().queue());

            //schedule begin msg
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
                    BeefVar.beefStart.setTimestamp(new Date().toInstant());
                    Data.beef.sendMessageEmbeds(BeefVar.beefStart.build())
                            .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefStartIcon)), "image.png")
                            .queue(message -> message.crosspost().queue());
                    Data.rawAlert.sendMessage("`" + "Beef has started! " + "`" + Data.pingBeef).queue(message -> message.crosspost().queue());
                }
            };
            timer.schedule(task, 10000);
        }
        //end msg
        if (ChatHook.getMcChat().contains(" wins the beef event!")) {
            Pattern pattern = Pattern.compile("^Team ");
            Matcher matcher = pattern.matcher(ChatHook.getMcChat());
            boolean matchFound = matcher.find();

            if (matchFound) {
                Data.beef.sendMessage("|| " + Data.pingBeef + " ||").queue();
                BeefVar.beefEnd.setTimestamp(new Date().toInstant());
                BeefVar.beefEnd.setDescription(ChatHook.getMcChat());
                Data.beef.sendMessageEmbeds(BeefVar.beefEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.beefEndIcon)), "image.png")
                        .queue(message -> message.crosspost().queue());
                Data.rawAlert.sendMessage("`" + ChatHook.getMcChat() + "`" + Data.pingBeef).queue(message -> message.crosspost().queue());
            }
        }
    }
}
