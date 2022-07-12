package com.udu3324.events.bait;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BaitVar {
    //Bait
    protected static final EmbedBuilder bait1hr = new EmbedBuilder();
    protected static final EmbedBuilder bait30m = new EmbedBuilder();
    protected static final EmbedBuilder bait20m = new EmbedBuilder();
    protected static final EmbedBuilder bait10m = new EmbedBuilder();
    protected static final EmbedBuilder bait5m = new EmbedBuilder();
    protected static final EmbedBuilder bait1m = new EmbedBuilder();
    protected static final EmbedBuilder bait10s = new EmbedBuilder();
    protected static final EmbedBuilder baitStart = new EmbedBuilder();
    protected static final EmbedBuilder baitEnd = new EmbedBuilder();
    protected static String bait1stPlace;
    protected static String bait2ndPlace;
    protected static String bait3rdPlace;
    protected static String bait1stPlaceRaw;
    protected static String bait2ndPlaceRaw;
    protected static String bait3rdPlaceRaw;

    static {
        bait1hr.setDescription("Bait Event begins in 1 hour.");
        bait1hr.setColor(new Color(0x001E9A));
        bait1hr.setAuthor("Bait", null, null);
        bait1hr.setImage("attachment://image.png");

        bait30m.setDescription("Bait Event begins in 30 minutes.");
        bait30m.setColor(new Color(0x001E9A));
        bait30m.setAuthor("Bait", null, null);
        bait30m.setImage("attachment://image.png");

        bait20m.setDescription("Bait Event begins in 20 minutes.");
        bait20m.setColor(new Color(0x001E9A));
        bait20m.setAuthor("Bait", null, null);
        bait20m.setImage("attachment://image.png");

        bait10m.setDescription("Bait Event begins in 10 minutes.");
        bait10m.setColor(new Color(0x001E9A));
        bait10m.setAuthor("Bait", null, null);
        bait10m.setImage("attachment://image.png");

        bait5m.setDescription("Bait Event begins in 5 minutes.");
        bait5m.setColor(new Color(0x001E9A));
        bait5m.setAuthor("Bait", null, null);
        bait5m.setImage("attachment://image.png");

        bait1m.setDescription("Bait Event begins in 1 minute.");
        bait1m.setColor(new Color(0x001E9A));
        bait1m.setAuthor("Bait", null, null);
        bait1m.setImage("attachment://image.png");

        bait10s.setDescription("Bait Event begins in 10 seconds.");
        bait10s.setColor(new Color(0x001E9A));
        bait10s.setAuthor("Bait", null, null);
        bait10s.setImage("attachment://image.png");

        baitStart.setDescription("Bait Event has started!");
        baitStart.setColor(new Color(0x001E9A));
        baitStart.setAuthor("Bait", null, null);
        baitStart.setImage("attachment://image.gif");

        baitEnd.setDescription("Bait Event has ended.");
        baitEnd.setColor(new Color(0x001E9A));
        baitEnd.setAuthor("Bait", null, null);
        baitEnd.setImage("attachment://image.gif");
    }
}
