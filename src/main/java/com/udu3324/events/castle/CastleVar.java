package com.udu3324.events.castle;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class CastleVar {
    //Castle
    public static final EmbedBuilder castle1hr = new EmbedBuilder();
    public static final EmbedBuilder castle30m = new EmbedBuilder();
    public static final EmbedBuilder castle20m = new EmbedBuilder();
    public static final EmbedBuilder castle10m = new EmbedBuilder();
    public static final EmbedBuilder castle5m = new EmbedBuilder();
    public static final EmbedBuilder castle1m = new EmbedBuilder();
    public static final EmbedBuilder castle10s = new EmbedBuilder();
    public static final EmbedBuilder castleStart = new EmbedBuilder();
    public static final EmbedBuilder castleEnd = new EmbedBuilder();

    static {
        castle1hr.setDescription("Battle for Minewind begins in 1 hour.");
        castle1hr.setColor(new Color(0x555555));
        castle1hr.setAuthor("Castle", null, null);
        castle1hr.setImage("attachment://image.png");

        castle30m.setDescription("Battle for Minewind begins in 30 minutes.");
        castle30m.setColor(new Color(0x555555));
        castle30m.setAuthor("Castle", null, null);
        castle30m.setImage("attachment://image.png");

        castle20m.setDescription("Battle for Minewind begins in 20 minutes.");
        castle20m.setColor(new Color(0x555555));
        castle20m.setAuthor("Castle", null, null);
        castle20m.setImage("attachment://image.png");

        castle10m.setDescription("Battle for Minewind begins in 10 minutes.");
        castle10m.setColor(new Color(0x555555));
        castle10m.setAuthor("Castle", null, null);
        castle10m.setImage("attachment://image.png");

        castle5m.setDescription("Battle for Minewind begins in 5 minutes.");
        castle5m.setColor(new Color(0x555555));
        castle5m.setAuthor("Castle", null, null);
        castle5m.setImage("attachment://image.png");

        castle1m.setDescription("Battle for Minewind begins in 1 minute.");
        castle1m.setColor(new Color(0x555555));
        castle1m.setAuthor("Castle", null, null);
        castle1m.setImage("attachment://image.png");

        castle10s.setDescription("Battle for Minewind begins in 10 seconds.");
        castle10s.setColor(new Color(0x555555));
        castle10s.setAuthor("Castle", null, null);
        castle10s.setImage("attachment://image.png");

        castleStart.setDescription("Battle for Minewind has started!");
        castleStart.setColor(new Color(0x555555));
        castleStart.setAuthor("Castle", null, null);
        castleStart.setImage("attachment://image.png");

        castleEnd.setColor(new Color(0x555555));
        castleEnd.setAuthor("Castle", null, null);
        castleEnd.setImage("attachment://image.png");
    }
}
