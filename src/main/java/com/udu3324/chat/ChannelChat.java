package com.udu3324.chat;

import com.udu3324.main.Data;

public class ChannelChat {
    public synchronized void run() {
        if (ChatHook.getMcChat().contains(": >")) {
            //send it with green text
            Data.botLog.sendMessage("```diff\n+ " + ChatHook.getMcChat() + "\n```").queue();
        } else {
            if (ChatHook.getMcChat().contains(": <")) {
                //send it with red text
                Data.botLog.sendMessage("```diff\n- " + ChatHook.getMcChat() + "\n```").queue();
            } else {
                if (ChatHook.getLine().contains(": [CHAT] * ")) {
                    //send it with blue text
                    Data.botLog.sendMessage("```markdown\n# " + ChatHook.getMcChat() + "\n```").queue();
                } else {
                    //send it normally
                    Data.botLog.sendMessage("```diff\n" + ChatHook.getMcChat() + "\n```").queue();
                }
            }
        }
    }
}
