package com.udu3324.chat;

import com.udu3324.main.Data;
import org.apache.commons.lang3.StringUtils;

public class ChannelChat {
    private static void send(String message) {
        int count = StringUtils.countMatches(message, ":");
        if (count >= 1 || message.contains("*")) {
            Data.chat.sendMessage(message).queue();
        }
    }

    public synchronized void run() {
        if (ChatHook.getMcChat().contains(": >")) {
            //send it with green text
            send("```diff\n+ " + ChatHook.getMcChat() + "\n```");
        } else {
            if (ChatHook.getMcChat().contains(": <")) {
                //send it with red text
                send("```diff\n- " + ChatHook.getMcChat() + "\n```");
            } else {
                if (ChatHook.getMcChat().charAt(0) == '*' && ChatHook.getMcChat().charAt(1) == ' ') {
                    //send it with blue text
                    send("```markdown\n# " + ChatHook.getMcChat() + "\n```");
                } else {
                    //send it normally
                    send("```diff\n" + ChatHook.getMcChat() + "\n```");
                }
            }
        }
    }
}
