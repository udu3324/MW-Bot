package com.udu3324.chat;

import com.udu3324.main.Data;

public class SharpenChat {
    public synchronized void run() {
        String chatSharpen = ChatHook.getMcChat();
        if (ChatHook.getCount() == 0 && !chatSharpen.contains("*") && chatSharpen.contains(" sharpened ") && chatSharpen.contains(" to +") && chatSharpen.contains("!")) {
            Data.sharpen.sendMessage("```" + chatSharpen + "```").queue(message -> message.crosspost().queue());
        }
    }
}
