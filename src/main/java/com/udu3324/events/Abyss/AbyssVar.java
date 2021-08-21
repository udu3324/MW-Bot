package com.udu3324.events.Abyss;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class AbyssVar {
    //Abyssal
    public static EmbedBuilder abyss30m = new EmbedBuilder();
    public static EmbedBuilder abyss20m = new EmbedBuilder();
    public static EmbedBuilder abyss10m = new EmbedBuilder();
    public static EmbedBuilder abyss5m = new EmbedBuilder();
    public static EmbedBuilder abyss1m = new EmbedBuilder();
    public static EmbedBuilder abyss10s = new EmbedBuilder();
    public static EmbedBuilder abyssStart = new EmbedBuilder();
    public static EmbedBuilder abyssEnd = new EmbedBuilder();

    static {
        abyss30m.setDescription("Abyssal event begins in 30 minutes.");
        abyss30m.setColor(new Color(0x0537D6));
        abyss30m.setAuthor("Abyssal", null, null);
        abyss30m.setImage("attachment://image.png");

        abyss20m.setDescription("Abyssal event begins in 20 minutes.");
        abyss20m.setColor(new Color(0x0537D6));
        abyss20m.setAuthor("Abyssal", null, null);
        abyss20m.setImage("attachment://image.png");

        abyss10m.setDescription("Abyssal event begins in 10 minutes.");
        abyss10m.setColor(new Color(0x0537D6));
        abyss10m.setAuthor("Abyssal", null, null);
        abyss10m.setImage("attachment://image.png");

        abyss5m.setDescription("Abyssal event begins in 5 minutes.");
        abyss5m.setColor(new Color(0x0537D6));
        abyss5m.setAuthor("Abyssal", null, null);
        abyss5m.setImage("attachment://image.png");

        abyss1m.setDescription("Abyssal event begins in 1 minute.");
        abyss1m.setColor(new Color(0x0537D6));
        abyss1m.setAuthor("Abyssal", null, null);
        abyss1m.setImage("attachment://image.png");

        abyss10s.setDescription("Abyssal event begins in 10 seconds.");
        abyss10s.setColor(new Color(0x0537D6));
        abyss10s.setAuthor("Abyssal", null, null);
        abyss10s.setImage("attachment://image.png");

        abyssStart.setDescription("Abyssal event has started!");
        abyssStart.setColor(new Color(0x0537D6));
        abyssStart.setAuthor("Abyssal", null, null);
        abyssStart.setImage("attachment://image.gif");

        abyssEnd.setColor(new Color(0x0537D6));
        abyssEnd.setAuthor("Abyssal", null, null);
        abyssEnd.setImage("attachment://image.gif");
    }
}
