package com.udu3324.chat;

import com.udu3324.main.Data;

import java.util.Random;

public class MarketChat {
    public String market;
    public String scan;

    private static void send(String message) {
        Random rd = new Random();
        if (rd.nextBoolean()) {
            Data.market.sendMessage(message).queue();
        }
    }

    public synchronized void run() {
        market = ChatHook.getMcChat();
        scan = market.toLowerCase();
        if (!scan.contains("*") && !scan.contains("irl") && !scan.contains("trader")) {
            if (scan.contains("sell")) { //sell, selling, sellers
                colorMessage();
            } else if (scan.contains("buy")) { //buy, buying, buyers
                colorMessage();
            } else if (scan.contains("offer")) { //offer, offering, offers
                colorMessage();
            }
        }
    }

    private synchronized void colorMessage() {
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
