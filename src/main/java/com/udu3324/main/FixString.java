package com.udu3324.main;

public class FixString {
    //basically takes a string and adds a \ to make the _ character not format in discord.
    public static String fix(String str) {
        //check if string contains it
        if (str.contains("_")) {
            StringBuilder stringFix = new StringBuilder(str);
            int underscoreIndex;
            int underscores;
            //find the number of underscores
            underscores = str.length() - str.replace("_", "").length();
            underscoreIndex = stringFix.indexOf("_");
            if (underscores > 1) {
                int count = 0;
                do {
                    //on each underscore index given, insert a \
                    stringFix.insert(underscoreIndex, "\\");
                    underscoreIndex = stringFix.indexOf("_", underscoreIndex + 2);
                    count++;
                } while (count != underscores);
            } else {
                stringFix.insert(underscoreIndex, "\\");
            }
            str = stringFix.toString();
        }
        return str;
    }
}
