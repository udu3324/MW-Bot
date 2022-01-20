package com.udu3324.events.bait;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;
import com.udu3324.main.FixString;

import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class BaitEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Fishing event begins in 1 hour.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait1hr.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait1hr.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 1hr. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 30 minutes.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait30m.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 30m. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 20 minutes.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait20m.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 20m. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 10 minutes.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait10m.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 10m. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue()); //send raw
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 5 minutes.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait5m.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 5m. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 1 minute.")) {
            Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
            BaitVar.bait1m.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 1m. " + "`" + Data.pingBait).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Fishing event begins in 10 seconds.")) {
            BaitVar.bait10s.setTimestamp(new Date().toInstant());
            Data.bait.sendMessageEmbeds(BaitVar.bait10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Bait begins in 10s. " + "`").queue(message -> message.crosspost().queue());

            //schedule begin msg
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Data.bait.sendMessage("|| " + Data.pingBait + " ||").queue();
                    BaitVar.baitStart.setTimestamp(new Date().toInstant());
                    Data.bait.sendMessageEmbeds(BaitVar.baitStart.build())
                            .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitStartIcon)), "image.gif")
                            .queue(message -> message.crosspost().queue());
                    Data.rawAlert.sendMessage("`" + "Bait has started! " + "`" + Data.pingBait).queue(message -> message.crosspost().queue());
                }
            };
            timer.schedule(task, 10000);
        }
        if (ChatHook.getMcChat().contains("fish")) {
            if (ChatHook.getMcChat().contains("1)")) {
                BaitVar.bait1stPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                BaitVar.bait1stPlaceRaw = ChatHook.getMcChat().substring(3);
            }
            if (ChatHook.getMcChat().contains("2)")) {
                BaitVar.bait2ndPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                BaitVar.bait2ndPlaceRaw = ChatHook.getMcChat().substring(3);
            }
            if (ChatHook.getMcChat().contains("3)")) {
                BaitVar.bait3rdPlace = FixString.fix(ChatHook.getMcChat()).substring(3);
                BaitVar.bait3rdPlaceRaw = ChatHook.getMcChat().substring(3);
                BaitVar.baitEnd.setDescription("Bait has ended.\n" +
                        "1) " + BaitVar.bait1stPlace + "\n" +
                        "2) " + BaitVar.bait2ndPlace + "\n" +
                        "3) " + BaitVar.bait3rdPlace);
                BaitVar.baitEnd.setTimestamp(new Date().toInstant());
                Data.bait.sendMessageEmbeds(BaitVar.baitEnd.build())
                        .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.baitEndIcon)), "image.gif")
                        .queue(message -> message.crosspost().queue());
                Data.rawAlert.sendMessage("`" + "Bait has ended.\n" +
                        "1) " + BaitVar.bait1stPlaceRaw + "\n" +
                        "2) " + BaitVar.bait2ndPlaceRaw + "\n" +
                        "3) " + BaitVar.bait3rdPlaceRaw + "`").queue(message -> message.crosspost().queue());
                BaitVar.bait1stPlace = "";
                BaitVar.bait2ndPlace = "";
                BaitVar.bait3rdPlace = "";
                BaitVar.bait1stPlaceRaw = "";
                BaitVar.bait2ndPlaceRaw = "";
                BaitVar.bait3rdPlaceRaw = "";
            }
        }
    }
}
