package com.udu3324.chat;

import com.udu3324.main.Data;

import java.util.Arrays;
import java.util.Collections;

public class MarketChat {
    public String market;
    public String scan;

    public synchronized void run() {
        market = ChatHook.getMcChat();
        scan = market.toLowerCase();
        if (!scan.contains("*") && !scan.contains("irl") && !scan.contains("trader")) {
            if (scan.contains("sell")) { //sell, selling, sellers
                filter();
            } else if (scan.contains("buy")) { //buy, buying, buyers
                filter();
            } else if (scan.contains("offer")) { //offer, offering, offers
                filter();
            }
        }
    }
    public synchronized void filter() {
        //todo spam filter (does not work)
        String temp = Arrays.toString(ChatVariables.spamFilter);
        if (!ChatHook.getMcChat().contains(temp)) {
            send();
            Collections.rotate(Arrays.asList(ChatVariables.spamFilter), 1);
            ChatVariables.spamFilter[0] = ChatHook.getMcChat();
        }
    }
    public synchronized void send() {
        if (ChatHook.getMcChat().contains(": >")) {
            //send it with green text
            Data.market.sendMessage("```diff\n+ " + market + "\n```").queue(message -> message.crosspost().queue());
        } else {
            if (ChatHook.getMcChat().contains(": <")) {
                //send it with red text
                Data.market.sendMessage("```diff\n- " + market + "\n```").queue(message -> message.crosspost().queue());
            } else {
                if (ChatHook.getLine().contains(": [CHAT] * ")) {
                    //send it with blue text
                    Data.market.sendMessage("```markdown\n# " + market + "\n```").queue(message -> message.crosspost().queue());
                } else {
                    //send it normally
                    Data.market.sendMessage("```diff\n" + market + "\n```").queue(message -> message.crosspost().queue());
                }
            }
        }
    }
}
