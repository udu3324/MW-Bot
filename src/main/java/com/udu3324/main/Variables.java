package com.udu3324.main;

import net.dv8tion.jda.api.entities.TextChannel;
import java.io.File;

public class Variables {
    /* Assets */
    public static String icon             = "/icon.png";
    public static String icon2            = "/icon2.png";
    //public static String nameOfEventSoonIcon =    "/nameOfEvent_soon_upscale.png";
    //public static String nameOfEventStartIcon =   "/nameOfEvent_Start.gif";
    //public static String nameOfEventEndIcon =     "/nameOfEvent_End.gif";
    public static String giantSoonIcon      = "/giant_soon_upscale.png";
    public static String giantStartIcon     = "/attack_Start.gif";
    public static String giantEndIcon       = "/attack_End.gif";
    public static String snowStartIcon      = "/snowvasion_Start.gif";
    public static String snowEndIcon        = "/snowvasion_End.gif";
    public static String abyssSoonIcon      = "/abyss_soon_upscale.png";
    public static String abyssStartIcon     = "/abyss_Start.gif";
    public static String abyssEndIcon       = "/abyss_End.gif";
    public static String foxSoonIcon        = "/fox_soon_upscale.png";
    public static String foxStartIcon       = "/fox_start_upscale.png";
    public static String foxChanSpawned     = "/fox_chanSpawn_upscale.png";
    public static String foxChanDied        = "/fox_chanDie_upscale.png";
    public static String foxEndIcon         = "/fox_end_upscale.png";
    public static String baitSoonIcon       = "/bait_soon_upscale.png";
    public static String baitStartIcon      = "/fish_Start.gif";
    public static String baitEndIcon        = "/fish_End.gif";
    public static String castleSoonIcon     = "/castle_soon_upscale.png";
    public static String castleStartIcon    = "/castle_start_upscale.png";
    public static String castleEndIcon      = "/castle_end_upscale.png";

    /* Apache Tailer */
    //31 - 1.16.5 - "[##:##:##] [main/INFO]: [CHAT] "
    //40 - 1.17.1 - "[##:##:##] [Render thread/INFO]: [CHAT] "
    public static Integer subString                = 40;

    /* Discord */
    //C:/Users/build/AppData/Roaming/.minecraft2/logs/latest.log
    //C:/Users/build/Desktop/MultiMC/instances/1.16.51/.minecraft/logs/latest.log
    //C:/Users/build/Desktop/MultiMC/instances/1.17.1/.minecraft/logs/latest.log
    public static File logFile = new File( "C:/Users/build/AppData/Roaming/.minecraft/logs/latest.log");
    public static Integer sessionMake              = 1;
    public static String activity                  = "play.minewind.net";
    public static String command                   = ">";
    public static String staffRoleID               = "863977201324785685";

    //public static String eventChannelNameOfEvent = "channelID";
    public static String eventChannelAttackOnGiant = "863975877648711691";
    public static String eventChannelSnow          = "863978973138124810";
    public static String eventChannelAbyss         = "863978950794805249";
    public static String eventChannelFox           = "863979026803458080";
    public static String eventChannelBait          = "863979084080873492";
    public static String eventChannelCastle        = "863979109898256395";
    public static String eventChannelBotLog        = "863979232699219978";
    public static String eventChannelRawAlert      = "863993133422084107";
    public static String eventChannelMarket        = "863979270380453898";
    public static String eventChannelSharpen       = "863979288763170817";
    public static String eventChannelVotes         = "870454989544386590";

    //public static String pingEvent = "";
    public static String pingAttack                = "<@&863991934988058624>";
    public static String pingSnow                  = "<@&863992054593093662>";
    public static String pingAbyss                 = "<@&863992157521707008>";
    public static String pingFox                   = "<@&863992277705162762>";
    public static String pingBait                  = "<@&863992343152689192>";
    public static String pingCastle                = "<@&863992408824086589>";

    //public static TextChannel nameOfEvent;
    public static TextChannel attack;
    public static TextChannel snow;
    public static TextChannel abyss;
    public static TextChannel fox;
    public static TextChannel bait;
    public static TextChannel castle;
    public static TextChannel botLog;
    public static TextChannel rawAlert;
    public static TextChannel market;
    public static TextChannel sharpen;
    public static TextChannel votes;
}
