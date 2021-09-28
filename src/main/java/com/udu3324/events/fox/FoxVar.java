package com.udu3324.events.fox;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class FoxVar {
    //Fox
    public static final EmbedBuilder fox30m = new EmbedBuilder();
    public static final EmbedBuilder fox20m = new EmbedBuilder();
    public static final EmbedBuilder fox10m = new EmbedBuilder();
    public static final EmbedBuilder fox5m = new EmbedBuilder();
    public static final EmbedBuilder fox1m = new EmbedBuilder();
    public static final EmbedBuilder fox10s = new EmbedBuilder();
    public static final EmbedBuilder foxStart = new EmbedBuilder();
    public static final EmbedBuilder foxChanSpawn = new EmbedBuilder();
    public static final EmbedBuilder foxChanKilled = new EmbedBuilder();
    public static final EmbedBuilder foxEnd = new EmbedBuilder();
    public static String fox1stPlace;
    public static String fox2ndPlace;
    public static String fox3rdPlace;

    static {
        fox30m.setDescription("Fox hunt begins in 30 minutes.");
        fox30m.setColor(new Color(0xF5E78F));
        fox30m.setAuthor("Fox Hunt", null, null);
        fox30m.setImage("attachment://image.png");

        fox20m.setDescription("Fox hunt begins in 20 minutes.");
        fox20m.setColor(new Color(0xF5E78F));
        fox20m.setAuthor("Fox Hunt", null, null);
        fox20m.setImage("attachment://image.png");

        fox10m.setDescription("Fox hunt begins in 10 minutes.");
        fox10m.setColor(new Color(0xF5E78F));
        fox10m.setAuthor("Fox Hunt", null, null);
        fox10m.setImage("attachment://image.png");

        fox5m.setDescription("Fox hunt begins in 5 minutes.");
        fox5m.setColor(new Color(0xF5E78F));
        fox5m.setAuthor("Fox Hunt", null, null);
        fox5m.setImage("attachment://image.png");

        fox1m.setDescription("Fox hunt begins in 1 minute.");
        fox1m.setColor(new Color(0xF5E78F));
        fox1m.setAuthor("Fox Hunt", null, null);
        fox1m.setImage("attachment://image.png");

        fox10s.setDescription("Fox hunt begins in 10 seconds.");
        fox10s.setColor(new Color(0xF5E78F));
        fox10s.setAuthor("Fox Hunt", null, null);
        fox10s.setImage("attachment://image.png");

        foxStart.setDescription("Fox Hunt has started!");
        foxStart.setColor(new Color(0xF5E78F));
        foxStart.setAuthor("Fox Hunt", null, null);
        foxStart.setImage("attachment://image.png");

        foxChanSpawn.setColor(new Color(0xF5E78F));
        foxChanSpawn.setAuthor("Fox Hunt", null, null);
        foxChanSpawn.setImage("attachment://image.png");

        foxChanKilled.setColor(new Color(0xF5E78F));
        foxChanKilled.setAuthor("Fox Hunt", null, null);
        foxChanKilled.setImage("attachment://image.png");

        foxEnd.setColor(new Color(0xF5E78F));
        foxEnd.setAuthor("Fox Hunt", null, null);
        foxEnd.setImage("attachment://image.png");
    }
}
