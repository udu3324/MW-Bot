package com.udu3324.events.snow;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class SnowVar {
    //Snowvasion
    protected static final EmbedBuilder snowStart = new EmbedBuilder();
    protected static final EmbedBuilder snowEnd = new EmbedBuilder();

    static {
        snowStart.setDescription("Snowmen invade the spawn!");
        snowStart.setColor(new Color(223, 223, 223));
        snowStart.setAuthor("Snowvasion", null, null);
        snowStart.setImage("attachment://image.gif");

        snowEnd.setDescription("Snowmen melt away.");
        snowEnd.setColor(new Color(223, 223, 223));
        snowEnd.setAuthor("Snowvasion", null, null);
        snowEnd.setImage("attachment://image.gif");
    }
}
