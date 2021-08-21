package com.udu3324.events.Bait;

import com.udu3324.main.ChatHook;
import com.udu3324.main.Variables;

import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class BaitEvent {
    public synchronized void run() {
        if (ChatHook.getMwEvent().equals("Fishing event begins in 30 minutes.")) {
            Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
            BaitVar.bait30m.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 30m. " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMwEvent().equals("Fishing event begins in 20 minutes.")) {
            Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
            BaitVar.bait20m.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 20m. " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMwEvent().equals("Fishing event begins in 10 minutes.")) {
            Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
            BaitVar.bait10m.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 10m. " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMwEvent().equals("Fishing event begins in 5 minutes.")) {
            Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
            BaitVar.bait5m.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 5m. " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fishing event begins in 1 minute.")) {
            Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
            BaitVar.bait1m.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 1m. " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMwEvent().equals("Fishing event begins in 10 seconds.")) {
            BaitVar.bait10s.setTimestamp(new Date().toInstant());
            Variables.bait.sendMessage(BaitVar.bait10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Variables.rawAlert.sendMessage("`" + "Bait begins in 10s. " + "`").queue(message -> message.crosspost().queue());

            //schedule begin msg
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Variables.bait.sendMessage("|| " + Variables.pingBait + " ||").queue();
                    BaitVar.baitStart.setTimestamp(new Date().toInstant());
                    Variables.bait.sendMessage(BaitVar.baitStart.build())
                            .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitStartIcon)), "image.gif")
                            .queue(message -> message.crosspost().queue());
                    Variables.rawAlert.sendMessage("`" + "Bait has started! " + "`" + Variables.pingBait).queue(message -> message.crosspost().queue());
                }
            };
            timer.schedule(task, 10000);
        }
        if (ChatHook.getMcChat().contains("fish")) {
            if (ChatHook.getMcChat().contains("e1)")) {
                BaitVar.bait1stPlace = ChatHook.getMwEvent().substring(5);
            }
            if (ChatHook.getMcChat().contains("e2)")) {
                BaitVar.bait2ndPlace = ChatHook.getMwEvent().substring(5);
            }
            if (ChatHook.getMcChat().contains("e3)")) {
                BaitVar.bait3rdPlace = ChatHook.getMwEvent().substring(5);
                BaitVar.baitEnd.setDescription("Bait has ended.\n```" +
                        "1) " + BaitVar.bait1stPlace + "\n" +
                        "2) " + BaitVar.bait2ndPlace + "\n" +
                        "3) " + BaitVar.bait3rdPlace + "```");
                BaitVar.baitEnd.setTimestamp(new Date().toInstant());
                Variables.bait.sendMessage(BaitVar.baitEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Variables.baitEndIcon)), "image.gif")
                        .queue(message -> message.crosspost().queue());
                Variables.rawAlert.sendMessage("`" + "Bait has ended.\n" +
                        "1) " + BaitVar.bait1stPlace + "\n" +
                        "2) " + BaitVar.bait2ndPlace + "\n" +
                        "3) " + BaitVar.bait3rdPlace + "`").queue(message -> message.crosspost().queue());
                BaitVar.bait1stPlace = "";
                BaitVar.bait2ndPlace = "";
                BaitVar.bait3rdPlace = "";
            }
        }
    }
}
