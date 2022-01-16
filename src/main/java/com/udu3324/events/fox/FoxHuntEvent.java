package com.udu3324.events.fox;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;
import com.udu3324.main.FixString;

import java.util.Date;
import java.util.Objects;

public class FoxHuntEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Fox hunt begins in 30 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox30m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 30m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox hunt begins in 20 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox20m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 20m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox hunt begins in 10 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox10m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 10m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox hunt begins in 5 minutes.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox5m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 5m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox hunt begins in 1 minute.")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.fox1m.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 1m. " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox hunt begins in 10 seconds.")) {
            FoxVar.fox10s.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.fox10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fox Hunt has begun!")) {
            Data.fox.sendMessage("|| " + Data.pingFox + " ||").queue();
            FoxVar.foxStart.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.foxStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxStartIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Fox Hunt has started! " + "`" + Data.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("Fox-chan spawned at ")) {
            FoxVar.foxChanSpawn.setDescription(FixString.fix(ChatHook.getMcChat()));
            FoxVar.foxChanSpawn.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.foxChanSpawn.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxChanSpawned)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + FixString.fix(ChatHook.getMcChat()) + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains(" has slain Fox-chan!")) {
            FoxVar.foxChanKilled.setDescription(FixString.fix(ChatHook.getMcChat()));
            FoxVar.foxChanKilled.setTimestamp(new Date().toInstant());
            Data.fox.sendMessageEmbeds(FoxVar.foxChanKilled.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxChanDied)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + FixString.fix(ChatHook.getMcChat()) + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("foxes")) {
            if (ChatHook.getMcChat().contains("1)")) {
                FoxVar.fox1stPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                FoxVar.fox1stPlaceRaw = ChatHook.getMcChat().substring(3);
            }
            if (ChatHook.getMcChat().contains("2)")) {
                FoxVar.fox2ndPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                FoxVar.fox2ndPlaceRaw = ChatHook.getMcChat().substring(3);
            }
            if (ChatHook.getMcChat().contains("3)")) {
                FoxVar.fox3rdPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                FoxVar.fox3rdPlaceRaw = ChatHook.getMcChat().substring(3);
                FoxVar.foxEnd.setDescription("Fox Hunt has ended.\n" +
                        "1) " + FoxVar.fox1stPlace + "\n" +
                        "2) " + FoxVar.fox2ndPlace + "\n" +
                        "3) " + FoxVar.fox3rdPlace);
                FoxVar.foxEnd.setTimestamp(new Date().toInstant());
                Data.fox.sendMessageEmbeds(FoxVar.foxEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.foxEndIcon)), "image.png")
                        .queue(message -> message.crosspost().queue());
                Data.rawAlert.sendMessage("`" + "Fox Hunt has ended.\n" +
                        "1) " + FoxVar.fox1stPlaceRaw + "\n" +
                        "2) " + FoxVar.fox2ndPlaceRaw + "\n" +
                        "3) " + FoxVar.fox3rdPlaceRaw + "`").queue(message -> message.crosspost().queue());
                FoxVar.fox1stPlace = "";
                FoxVar.fox2ndPlace = "";
                FoxVar.fox3rdPlace = "";
                FoxVar.fox1stPlaceRaw = "";
                FoxVar.fox2ndPlaceRaw = "";
                FoxVar.fox3rdPlaceRaw = "";

            }
        }
    }
}
