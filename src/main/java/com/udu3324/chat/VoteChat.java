package com.udu3324.chat;

import com.udu3324.main.Variables;

public class VoteChat {
    public synchronized void run() {
        String chatVotes = ChatHook.getMcChat();
        if (chatVotes.contains("/vote -> ") && chatVotes.contains(": ")) {
            Variables.votes.sendMessage("```" + chatVotes + "```").queue(message -> message.crosspost().queue());
        }
    }
}
