package com.udu3324.chat;

import com.udu3324.main.Variables;

public class SharpenChat {
    public synchronized void run() {
        String chatSharpen = ChatHook.getMcChat();
        if (ChatHook.getCount() == 0) {
            if (!chatSharpen.contains("*")) {
                if (chatSharpen.contains("e")) {
                    if (chatSharpen.contains(" sharpened ")) {
                        if (chatSharpen.contains(" to +")) {
                            if (chatSharpen.contains("!")) {
                                StringBuilder str = new StringBuilder(chatSharpen);
                                //remove �e at the end of item names
                                int remove = str.indexOf("e to +");
                                str.deleteCharAt(remove).deleteCharAt(remove - 1);

                                //remove color codes
                                int remove2 = str.indexOf(" sharpened ");
                                remove2 = remove2 + 12;
                                if (str.charAt(remove2) == 'c') {
                                    str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                    if (str.charAt(remove2) == 'l') {
                                        str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                    }
                                }
                                if (str.charAt(remove2) == '2') {
                                    str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                    if (str.charAt(remove2) == 'k') {
                                        str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                    }
                                }
                                if (str.charAt(remove2) == 'f') {
                                    str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                }
                                if (str.charAt(remove2) == 'a' && str.charAt(remove2 + 1) != 'c' && str.charAt(remove2 + 1) != 'j') {
                                    str.deleteCharAt(remove2).deleteCharAt(remove2 - 1);
                                }

                                //final, also removes �e
                                Variables.sharpen.sendMessage("```" + str.substring(2) + "```").queue(message -> message.crosspost().queue());
                            }
                        }
                    }
                }
            }
        }
    }
}
