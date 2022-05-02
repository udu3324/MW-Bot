package com.udu3324.events.labyrinth;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;

import java.util.Date;
import java.util.Objects;

public class LabyrinthEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 1 hour.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth1hr.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth1hr.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 1hr. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 30 minutes.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth30m.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth30m.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 30m. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 20 minutes.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth20m.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth20m.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 20m. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 10 minutes.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth10m.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth10m.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 10m. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 5 minutes.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth5m.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth5m.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 5m. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth Event begins in 1 minute.")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinth1m.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinth1m.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth Event begins in 1m. " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth event is starting...")) {
            LabyrinthVar.labyrinthStarting.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinthStarting.build())
                    //.addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth event is starting... " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth event has started!")) {
            Data.labyrinth.sendMessage("|| " + Data.pingLabyrinth + " ||").queue();
            LabyrinthVar.labyrinthStart.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinthStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthStartIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth has started! " + "`" + Data.pingLabyrinth).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Labyrinth event has ended!")) {
            LabyrinthVar.labyrinthEnd.setTimestamp(new Date().toInstant());
            Data.labyrinth.sendMessageEmbeds(LabyrinthVar.labyrinthEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.labyrinthEndIcon)), "image.gif")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Labyrinth has ended. " + "`").queue(message -> message.crosspost().queue());
        }
    }
}

