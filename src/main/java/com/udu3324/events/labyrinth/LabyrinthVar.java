package com.udu3324.events.labyrinth;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class LabyrinthVar {
    //Attack On Giant
    protected static final EmbedBuilder labyrinth1hr = new EmbedBuilder();
    protected static final EmbedBuilder labyrinth30m = new EmbedBuilder();
    protected static final EmbedBuilder labyrinth20m = new EmbedBuilder();
    protected static final EmbedBuilder labyrinth10m = new EmbedBuilder();
    protected static final EmbedBuilder labyrinth5m = new EmbedBuilder();
    protected static final EmbedBuilder labyrinth1m = new EmbedBuilder();
    protected static final EmbedBuilder labyrinthStarting = new EmbedBuilder();
    protected static final EmbedBuilder labyrinthStart = new EmbedBuilder();
    protected static final EmbedBuilder labyrinthEnd = new EmbedBuilder();

    static {
        labyrinth1hr.setDescription("Labyrinth Event begins in 1 hour.");
        labyrinth1hr.setColor(new Color(0xb9b9b9));
        labyrinth1hr.setAuthor("Labyrinth", null, null);
        //labyrinth1hr.setImage("attachment://image.png");

        labyrinth30m.setDescription("Labyrinth Event begins in 30 minutes.");
        labyrinth30m.setColor(new Color(0xb9b9b9));
        labyrinth30m.setAuthor("Labyrinth", null, null);
        //labyrinth30m.setImage("attachment://image.png");

        labyrinth20m.setDescription("Labyrinth Event begins in 20 minutes.");
        labyrinth20m.setColor(new Color(0xb9b9b9));
        labyrinth20m.setAuthor("Labyrinth", null, null);
        //labyrinth20m.setImage("attachment://image.png");

        labyrinth10m.setDescription("Labyrinth Event begins in 10 minutes.");
        labyrinth10m.setColor(new Color(0xb9b9b9));
        labyrinth10m.setAuthor("Labyrinth", null, null);
        //labyrinth10m.setImage("attachment://image.png");

        labyrinth5m.setDescription("Labyrinth Event begins in 5 minutes.");
        labyrinth5m.setColor(new Color(0xb9b9b9));
        labyrinth5m.setAuthor("Labyrinth", null, null);
        //labyrinth5m.setImage("attachment://image.png");

        labyrinth1m.setDescription("Labyrinth Event begins in 1 minute.");
        labyrinth1m.setColor(new Color(0xb9b9b9));
        labyrinth1m.setAuthor("Labyrinth", null, null);
        //labyrinth1m.setImage("attachment://image.png");

        labyrinthStarting.setDescription("Labyrinth event is starting...");
        labyrinthStarting.setColor(new Color(0xb9b9b9));
        labyrinthStarting.setAuthor("Labyrinth", null, null);
        //labyrinthStarting.setImage("attachment://image.png");

        labyrinthStart.setDescription("Labyrinth Event has started!");
        labyrinthStart.setColor(new Color(0xb9b9b9));
        labyrinthStart.setAuthor("Labyrinth", null, null);
        labyrinthStart.setImage("attachment://image.gif");

        labyrinthEnd.setDescription("Labyrinth Event has ended.");
        labyrinthEnd.setColor(new Color(0xb9b9b9));
        labyrinthEnd.setAuthor("Labyrinth", null, null);
        labyrinthEnd.setImage("attachment://image.gif");
    }
}
