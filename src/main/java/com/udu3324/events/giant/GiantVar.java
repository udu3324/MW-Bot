package com.udu3324.events.giant;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class GiantVar {
    //Attack On Giant
    protected static final EmbedBuilder attack1hr = new EmbedBuilder();
    protected static final EmbedBuilder attack30m = new EmbedBuilder();
    protected static final EmbedBuilder attack20m = new EmbedBuilder();
    protected static final EmbedBuilder attack10m = new EmbedBuilder();
    protected static final EmbedBuilder attack5m = new EmbedBuilder();
    protected static final EmbedBuilder attack1m = new EmbedBuilder();
    protected static final EmbedBuilder attack10s = new EmbedBuilder();
    protected static final EmbedBuilder attackStart = new EmbedBuilder();
    protected static final EmbedBuilder attackEnd = new EmbedBuilder();

    static {
        attack1hr.setDescription("Attack on Giant begins in 1 hour.");
        attack1hr.setColor(new Color(80, 134, 42));
        attack1hr.setAuthor("Attack on Giant", null, null);
        attack1hr.setImage("attachment://image.png");

        attack30m.setDescription("Attack on Giant begins in 30 minutes.");
        attack30m.setColor(new Color(80, 134, 42));
        attack30m.setAuthor("Attack on Giant", null, null);
        attack30m.setImage("attachment://image.png");

        attack20m.setDescription("Attack on Giant begins in 20 minutes.");
        attack20m.setColor(new Color(80, 134, 42));
        attack20m.setAuthor("Attack on Giant", null, null);
        attack20m.setImage("attachment://image.png");

        attack10m.setDescription("Attack on Giant begins in 10 minutes.");
        attack10m.setColor(new Color(80, 134, 42));
        attack10m.setAuthor("Attack on Giant", null, null);
        attack10m.setImage("attachment://image.png");

        attack5m.setDescription("Attack on Giant begins in 5 minutes.");
        attack5m.setColor(new Color(80, 134, 42));
        attack5m.setAuthor("Attack on Giant", null, null);
        attack5m.setImage("attachment://image.png");

        attack1m.setDescription("Attack on Giant begins in 1 minute.");
        attack1m.setColor(new Color(80, 134, 42));
        attack1m.setAuthor("Attack on Giant", null, null);
        attack1m.setImage("attachment://image.png");

        attack10s.setDescription("Attack on Giant begins in 10 seconds.");
        attack10s.setColor(new Color(80, 134, 42));
        attack10s.setAuthor("Attack on Giant", null, null);
        attack10s.setImage("attachment://image.png");

        attackStart.setDescription("Attack on Giant has started!");
        attackStart.setColor(new Color(80, 134, 42));
        attackStart.setAuthor("Attack on Giant", null, null);
        attackStart.setImage("attachment://image.gif");

        attackEnd.setDescription("Attack on Giant has ended.");
        attackEnd.setColor(new Color(80, 134, 42));
        attackEnd.setAuthor("Attack on Giant", null, null);
        attackEnd.setImage("attachment://image.gif");
    }
}
