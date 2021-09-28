package com.udu3324.events.bait;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BaitVar {
    //Bait
    public static final EmbedBuilder bait30m = new EmbedBuilder();
    public static final EmbedBuilder bait20m = new EmbedBuilder();
    public static final EmbedBuilder bait10m = new EmbedBuilder();
    public static final EmbedBuilder bait5m = new EmbedBuilder();
    public static final EmbedBuilder bait1m = new EmbedBuilder();
    public static final EmbedBuilder bait10s = new EmbedBuilder();
    public static final EmbedBuilder baitStart = new EmbedBuilder();
    public static final EmbedBuilder baitEnd = new EmbedBuilder();
    public static String bait1stPlace;
    public static String bait2ndPlace;
    public static String bait3rdPlace;

    static {
        bait30m.setDescription("Fishing event begins in 30 minutes.");
        bait30m.setColor(new Color(0x001E9A));
        bait30m.setAuthor("Bait", null, null);
        bait30m.setImage("attachment://image.png");

        bait20m.setDescription("Fishing event begins in 20 minutes.");
        bait20m.setColor(new Color(0x001E9A));
        bait20m.setAuthor("Bait", null, null);
        bait20m.setImage("attachment://image.png");

        bait10m.setDescription("Fishing event begins in 10 minutes.");
        bait10m.setColor(new Color(0x001E9A));
        bait10m.setAuthor("Bait", null, null);
        bait10m.setImage("attachment://image.png");

        bait5m.setDescription("Fishing event begins in 5 minutes.");
        bait5m.setColor(new Color(0x001E9A));
        bait5m.setAuthor("Bait", null, null);
        bait5m.setImage("attachment://image.png");

        bait1m.setDescription("Fishing event begins in 1 minute.");
        bait1m.setColor(new Color(0x001E9A));
        bait1m.setAuthor("Bait", null, null);
        bait1m.setImage("attachment://image.png");

        bait10s.setDescription("Fishing event begins in 10 seconds.");
        bait10s.setColor(new Color(0x001E9A));
        bait10s.setAuthor("Bait", null, null);
        bait10s.setImage("attachment://image.png");

        baitStart.setDescription("Fishing event has started!");
        baitStart.setColor(new Color(0x001E9A));
        baitStart.setAuthor("Bait", null, null);
        baitStart.setImage("attachment://image.gif");

        baitEnd.setDescription("Fishing event has ended.");
        baitEnd.setColor(new Color(0x001E9A));
        baitEnd.setAuthor("Bait", null, null);
        baitEnd.setImage("attachment://image.gif");
    }
}
