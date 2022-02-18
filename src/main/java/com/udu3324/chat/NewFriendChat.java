package com.udu3324.chat;

import com.udu3324.main.Data;
import org.apache.commons.lang3.StringUtils;

public class NewFriendChat {
    public synchronized void run() {
        String chatFriends = ChatHook.getMcChat();
        int count = StringUtils.countMatches(chatFriends, ":");
        //if chat contains a vote, send it
        if (chatFriends.contains("Welcome newfriend ") && count == 0 && chatFriends.length() < 36) {
            Data.newFriend.sendMessage("```" + chatFriends + "```").queue(message -> message.crosspost().queue());
        }
    }
}
