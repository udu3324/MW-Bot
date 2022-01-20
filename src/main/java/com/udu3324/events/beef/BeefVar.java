package com.udu3324.events.beef;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BeefVar {
    //beef
    protected static final EmbedBuilder beef1hr = new EmbedBuilder();
    protected static final EmbedBuilder beef30m = new EmbedBuilder();
    protected static final EmbedBuilder beef20m = new EmbedBuilder();
    protected static final EmbedBuilder beef10m = new EmbedBuilder();
    protected static final EmbedBuilder beef5m = new EmbedBuilder();
    protected static final EmbedBuilder beef1m = new EmbedBuilder();
    protected static final EmbedBuilder beef10s = new EmbedBuilder();
    protected static final EmbedBuilder beefStart = new EmbedBuilder();
    protected static final EmbedBuilder beefEnd = new EmbedBuilder();

    static {
        beef1hr.setDescription("Beef Event begins in 1 hour.");
        beef1hr.setColor(new Color(0x673728));
        beef1hr.setAuthor("Beef", null, null);
        beef1hr.setImage("attachment://image.png");

        beef30m.setDescription("Beef Event begins in 30 minutes.");
        beef30m.setColor(new Color(0x673728));
        beef30m.setAuthor("Beef", null, null);
        beef30m.setImage("attachment://image.png");

        beef20m.setDescription("Beef Event begins in 20 minutes.");
        beef20m.setColor(new Color(0x673728));
        beef20m.setAuthor("Beef", null, null);
        beef20m.setImage("attachment://image.png");

        beef10m.setDescription("Beef Event begins in 10 minutes.");
        beef10m.setColor(new Color(0x673728));
        beef10m.setAuthor("Beef", null, null);
        beef10m.setImage("attachment://image.png");

        beef5m.setDescription("Beef Event begins in 5 minutes.");
        beef5m.setColor(new Color(0x673728));
        beef5m.setAuthor("Beef", null, null);
        beef5m.setImage("attachment://image.png");

        beef1m.setDescription("Beef Event begins in 1 minute.");
        beef1m.setColor(new Color(0x673728));
        beef1m.setAuthor("Beef", null, null);
        beef1m.setImage("attachment://image.png");

        beef10s.setDescription("Beef Event begins in 10 seconds.");
        beef10s.setColor(new Color(0x673728));
        beef10s.setAuthor("Beef", null, null);
        beef10s.setImage("attachment://image.png");

        beefStart.setDescription("Beef Event has started!");
        beefStart.setColor(new Color(0x673728));
        beefStart.setAuthor("Beef", null, null);
        beefStart.setImage("attachment://image.png");

        beefEnd.setColor(new Color(0x673728));
        beefEnd.setAuthor("Beef", null, null);
        beefEnd.setImage("attachment://image.png");
    }
}
