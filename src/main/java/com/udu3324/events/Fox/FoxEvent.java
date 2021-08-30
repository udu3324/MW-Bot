package com.udu3324.events.Fox;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;
import com.udu3324.main.FixString;

import java.util.Date;
import java.util.Objects;

public class FoxEvent {
    public synchronized void run() {
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 30 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox30m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 30m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 20 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox20m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 20m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 10 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox10m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 10m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 5 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox5m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 5m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 1 minute.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox1m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 1m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 10 seconds.")) {
            FoxVar.fox10s.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.fox10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox Hunt has begun!")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.foxStart.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.foxStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxStartIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt has started! " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("dFox-chan spawned at ")) {
            FoxVar.foxChanSpawn.setDescription(FixString.fix(ChatHook.getMwEvent()));
            FoxVar.foxChanSpawn.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.foxChanSpawn.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxChanSpawned)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + FixString.fix(ChatHook.getMwEvent()) + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().contains(" has slain Fox-chan!")) {
            FoxVar.foxChanKilled.setDescription(FixString.fix(ChatHook.getMwEvent()));
            FoxVar.foxChanKilled.setTimestamp(new Date().toInstant());
            Data.fox.sendMessage(FoxVar.foxChanKilled.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxChanDied)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + FixString.fix(ChatHook.getMwEvent()) + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("foxes")) {
            if (ChatHook.getMcChat().contains("e1)")) {
                FoxVar.fox1stPlace = FixString.fix(ChatHook.getMwEvent()).substring(5);
            }
            if (ChatHook.getMcChat().contains("e2)")) {
                FoxVar.fox2ndPlace = FixString.fix(ChatHook.getMwEvent()).substring(5);
            }
            if (ChatHook.getMcChat().contains("e3)")) {
                FoxVar.fox3rdPlace = FixString.fix(ChatHook.getMwEvent()).substring(5);
                FoxVar.foxEnd.setDescription("Fox Hunt has ended.\n" +
                        "1) " + FoxVar.fox1stPlace + "\n" +
                        "2) " + FoxVar.fox2ndPlace + "\n" +
                        "3) " + FoxVar.fox3rdPlace);
                FoxVar.foxEnd.setTimestamp(new Date().toInstant());
                Data.fox.sendMessage(FoxVar.foxEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxEndIcon)), "image.png")
                        .queue(message -> message.crosspost().queue());
                Data.rawAlert.sendMessage("`" + "Fox Hunt has ended.\n" +
                        "1) " + FoxVar.fox1stPlace + "\n" +
                        "2) " + FoxVar.fox2ndPlace + "\n" +
                        "3) " + FoxVar.fox3rdPlace + "`").queue(message -> message.crosspost().queue());
                FoxVar.fox1stPlace = "";
                FoxVar.fox2ndPlace = "";
                FoxVar.fox3rdPlace = "";
            }
        }
    }
}
