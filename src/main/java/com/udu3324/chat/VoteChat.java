package com.udu3324.chat;

import com.udu3324.main.Data;
import org.apache.commons.lang3.StringUtils;

public class VoteChat {
    public synchronized void run() {
        String chatVotes = ChatHook.getMcChat();
        int count = StringUtils.countMatches(chatVotes, ":");
        if (chatVotes.contains("/vote -> ") && count == 1 && !chatVotes.contains("*")) {
            Data.votes.sendMessage("```" + chatVotes + "```").queue(message -> message.crosspost().queue());
        }
    }
}
