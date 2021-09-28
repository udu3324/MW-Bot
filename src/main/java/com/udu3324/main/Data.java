package com.udu3324.main;

import net.dv8tion.jda.api.entities.TextChannel;

import java.io.File;

public class Data {
    /* Assets */
    public static final String icon = "/icon.png";
    public static final String icon2 = "/icon2.png";
    public static final String giantSoonIcon = "/giant_soon_upscale.png";
    public static final String giantStartIcon = "/attack_Start.gif";
    public static final String giantEndIcon = "/attack_End.gif";
    public static final String snowStartIcon = "/snowvasion_Start.gif";
    public static final String snowEndIcon = "/snowvasion_End.gif";
    public static final String abyssSoonIcon = "/abyss_soon_upscale.png"; //deprecate soon
    public static final String abyssStartIcon = "/abyss_Start.gif"; //deprecate soon
    public static final String abyssEndIcon = "/abyss_End.gif"; //deprecate soon
    public static final String foxSoonIcon = "/fox_soon_upscale.png";
    public static final String foxStartIcon = "/fox_start_upscale.png";
    public static final String foxChanSpawned = "/fox_chanSpawn_upscale.png";
    public static final String foxChanDied = "/fox_chanDie_upscale.png";
    public static final String foxEndIcon = "/fox_end_upscale.png";
    public static final String baitSoonIcon = "/bait_soon_upscale.png";
    public static final String baitStartIcon = "/fish_Start.gif";
    public static final String baitEndIcon = "/fish_End.gif";
    public static final String castleSoonIcon = "/castle_soon_upscale.png";
    public static final String castleStartIcon = "/castle_start_upscale.png";
    public static final String castleEndIcon = "/castle_end_upscale.png";

    /* Substring */
    //31 - 1.16.5 - "[##:##:##] [main/INFO]: [CHAT] "
    //40 - 1.17.1 - "[##:##:##] [Render thread/INFO]: [CHAT] "
    public static final Integer subString = 40;

    /* Discord */
    //C:/Users/build/AppData/Roaming/.minecraft2/logs/latest.log
    //C:/Users/build/Desktop/MultiMC/instances/1.16.51/.minecraft/logs/latest.log
    //C:/Users/build/Desktop/MultiMC/instances/1.17.1/.minecraft/logs/latest.log
    public static final File logFile = new File("C:/Users/build/AppData/Roaming/.minecraft/logs/latest.log");
    public static final String activity = "play.minewind.net";
    public static final String command = ">";
    public static final String staffRoleID = "863977201324785685";
    //public static String eventChannelNameOfEvent = "channelID";
    public static final String eventChannelAttackOnGiant = "863975877648711691";
    public static final String eventChannelSnow = "863978973138124810";
    public static final String eventChannelAbyss = "863978950794805249"; //removed from mw (keep just in case)
    public static final String eventChannelFox = "863979026803458080";
    public static final String eventChannelBait = "863979084080873492";
    public static final String eventChannelCastle = "863979109898256395";
    public static final String eventChannelBotLog = "863979232699219978";
    public static final String eventChannelRawAlert = "863993133422084107";
    public static final String eventChannelMarket = "863979270380453898";
    public static final String eventChannelSharpen = "863979288763170817";
    public static final String eventChannelVotes = "870454989544386590";
    //public static String pingEvent = "";
    public static final String pingAttack = "<@&863991934988058624>";
    public static final String pingSnow = "<@&863992054593093662>";
    public static final String pingAbyss = "<@&863992157521707008>"; //removed from mw (keep just in case)
    public static final String pingFox = "<@&863992277705162762>";
    public static final String pingBait = "<@&863992343152689192>";
    public static final String pingCastle = "<@&863992408824086589>";
    public static final String pingMaintainer = "<@395649963415306242>";
    public static Integer sessionMake = 1;
    //public static TextChannel nameOfEvent;
    public static TextChannel attack;
    public static TextChannel snow;
    public static TextChannel abyss; //removed from mw (keep just in case)
    public static TextChannel fox;
    public static TextChannel bait;
    public static TextChannel castle;
    public static TextChannel chat;
    public static TextChannel rawAlert;
    public static TextChannel market;
    public static TextChannel sharpen;
    public static TextChannel votes;
}
