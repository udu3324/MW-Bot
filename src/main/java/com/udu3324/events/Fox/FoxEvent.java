package com.udu3324.events.Fox;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Variables;

import java.util.Date;
import java.util.Objects;

public class FoxEvent {
    public synchronized void run() {
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 30 minutes.")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.fox30m.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 30m. " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 20 minutes.")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.fox20m.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 20m. " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 10 minutes.")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.fox10m.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 10m. " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 5 minutes.")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.fox5m.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 5m. " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 1 minute.")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.fox1m.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 1m. " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox hunt begins in 10 seconds.")) {
            FoxVar.fox10s.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.fox10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fox Hunt has begun!")) {
            Variables.fox.sendMessage("|| " + Variables.pingFox + " ||").queue();
            FoxVar.foxStart.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.foxStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxStartIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Fox Hunt has started! " + "`" + Variables.pingFox).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("dFox-chan spawned at ")) {
            FoxVar.foxChanSpawn.setDescription(ChatHook.getMwEvent());
            FoxVar.foxChanSpawn.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.foxChanSpawn.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxChanSpawned)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + ChatHook.getMwEvent() + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().contains(" has slain Fox-chan!")) {
            FoxVar.foxChanKilled.setDescription(ChatHook.getMwEvent());
            FoxVar.foxChanKilled.setTimestamp(new Date().toInstant());
            Variables.fox.sendMessage(FoxVar.foxChanKilled.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxChanDied)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + ChatHook.getMwEvent() + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains("foxes")) {
            if (ChatHook.getMcChat().contains("e1)")) {
                FoxVar.fox1stPlace = ChatHook.getMwEvent().substring(5);
            }
            if (ChatHook.getMcChat().contains("e2)")) {
                FoxVar.fox2ndPlace = ChatHook.getMwEvent().substring(5);
            }
            if (ChatHook.getMcChat().contains("e3)")) {
                FoxVar.fox3rdPlace = ChatHook.getMwEvent().substring(5);
                FoxVar.foxEnd.setDescription("Fox Hunt has ended.\n```" +
                        "1) " + FoxVar.fox1stPlace + "\n" +
                        "2) " + FoxVar.fox2ndPlace + "\n" +
                        "3) " + FoxVar.fox3rdPlace + "```");
                FoxVar.foxEnd.setTimestamp(new Date().toInstant());
                Variables.fox.sendMessage(FoxVar.foxEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.foxEndIcon)), "image.png")
                        .queue(message -> message.crosspost().queue());
                Variables.rawAlert.sendMessage("`" + "Fox Hunt has ended.\n" +
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
