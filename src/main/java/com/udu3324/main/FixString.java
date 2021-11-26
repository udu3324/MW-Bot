package com.udu3324.main;

public class FixString {
    //basically takes a string and adds a \ to make the _ character not format in discord.
    public static String fix(String str) {
        StringBuilder strFix = new StringBuilder(str);
        if (str.contains("_")) {
            int underscores = str.length() - str.replace("_", "").length(); //int of how many _ in str
            int underscoreIndex = strFix.indexOf("_"); //int of _ index
            if (underscores > 1) {
                int count = 0;
                do { //replace _ with \_ on each _ in str
                    strFix.insert(underscoreIndex, "\\");
                    underscoreIndex = strFix.indexOf("_", underscoreIndex + 2);
                    count++;
                } while (count != underscores);
            } else {  //replace _ with \_ in str
                strFix.insert(underscoreIndex, "\\");
            }
        }
        return strFix.toString();
    }
}
