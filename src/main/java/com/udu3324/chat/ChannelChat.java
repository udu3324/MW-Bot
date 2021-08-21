package com.udu3324.chat;

import com.udu3324.main.ChatHook;
import com.udu3324.main.Variables;

public class ChannelChat {
    public synchronized void run() {
        if (ChatHook.getMcChat().contains(": >")) {
            //send it with green text
            Variables.botLog.sendMessage("```diff\n+ " + ChatHook.getMcChat() + "\n```").queue();
        } else {
            if (ChatHook.getMcChat().contains(": <")) {
                //send it with red text
                Variables.botLog.sendMessage("```diff\n- " + ChatHook.getMcChat() + "\n```").queue();
            } else {
                if (ChatHook.getLine().contains(": [CHAT] * ")) {
                    //send it with blue text
                    Variables.botLog.sendMessage("```markdown\n# " + ChatHook.getMcChat() + "\n```").queue();
                } else {
                    //send it normally
                    Variables.botLog.sendMessage("```diff\n" + ChatHook.getMcChat() + "\n```").queue();
                }
            }
        }
    }
}
