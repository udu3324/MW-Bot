package com.udu3324.events.castle;

import com.udu3324.chat.ChatHook;
import com.udu3324.main.Data;

import java.util.Date;
import java.util.Objects;

public class CastleEvent {
    public synchronized void run() {
        if (ChatHook.getMcChat().contains("1 hour")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle1hr.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle1hr.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 1hr. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 30 minutes.")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle30m.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle30m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 30m. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 20 minutes.")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle20m.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle20m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 20m. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 10 minutes.")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle10m.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle10m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 10m. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 5 minutes.")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle5m.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle5m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 5m. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 1 minute.")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castle1m.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle1m.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 1m. " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind begins in 10 seconds.")) {
            CastleVar.castle10s.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castle10s.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleSoonIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle begins in 10s. " + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().equals("Battle for Minewind has begun!")) {
            Data.castle.sendMessage("|| " + Data.pingCastle + " ||").queue();
            CastleVar.castleStart.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castleStart.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleStartIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + "Castle has started! " + "`" + Data.pingCastle).queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains(") hold the Minewind City!")) {
            CastleVar.castleEnd.setDescription(ChatHook.getMcChat());
            CastleVar.castleEnd.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castleEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleEndIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + ChatHook.getMcChat() + "`").queue(message -> message.crosspost().queue());
        }
        if (ChatHook.getMcChat().contains(") take the Minewind City from ")) {
            StringBuilder string = new StringBuilder(ChatHook.getMcChat());
            int removeChar = string.indexOf("\\n");
            int nextLineIndex = removeChar + 1;
            string.replace(removeChar, removeChar + 4, " ");
            string.insert(nextLineIndex, "\n");
            string.append(".");

            CastleVar.castleEnd.setDescription(string);
            CastleVar.castleEnd.setTimestamp(new Date().toInstant());
            Data.castle.sendMessage(CastleVar.castleEnd.build())
                    .addFile(Objects.requireNonNull(this.getClass().getResourceAsStream(Data.castleEndIcon)), "image.png")
                    .queue(message -> message.crosspost().queue());
            Data.rawAlert.sendMessage("`" + string + "`").queue(message -> message.crosspost().queue());
        }
    }
}
