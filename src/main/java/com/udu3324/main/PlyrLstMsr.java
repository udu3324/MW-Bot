package com.udu3324.main;

import com.udu3324.chat.ChatHook;

import java.util.Arrays;

public class PlyrLstMsr {
    public static final String[] playerData = {"Empty0", "1", "Empty1", "1", "Empty2", "1", "Empty3", "1", "Empty4", "1", "Empty5", "1",
            "Empty6", "1", "Empty7", "1", "Empty8", "1", "Empty9", "1", "Empty10", "1", "Empty11", "1", "Empty12", "1",
            "Empty13", "1", "Empty14", "1", "Empty15", "1", "Empty16", "1", "Empty17", "1", "Empty18", "1", "Empty19", "1",
            "Empty20", "1", "Empty21", "1", "Empty22", "1", "Empty23", "1", "Empty24", "1", "Empty25", "1", "Empty26", "1",
            "Empty27", "1", "Empty28", "1", "Empty29", "1", "Empty30", "1", "Empty31", "1", "Empty32", "1", "Empty33", "1",
            "Empty34", "1", "Empty35", "1", "Empty36", "1", "Empty37", "1", "Empty38", "1", "Empty39", "1", "Empty40", "1",
            "Empty41", "1", "Empty42", "1", "Empty43", "1", "Empty44", "1", "Empty45", "1", "Empty46", "1", "Empty47", "1",
            "Empty48", "1", "Empty49", "1"};
    public long IGNTime;

    public static String getPlyrDat(int integer) {
        return playerData[integer];
    }

    public synchronized void run() {
        if (ChatHook.getMcChat().contains(": ") && !ChatHook.getChatIGN().contains("*")) {
            IGNTime = System.currentTimeMillis();
            if (Arrays.asList(playerData).contains(ChatHook.getChatIGN())) {
                int dupeLocation1 = Arrays.asList(playerData).indexOf(ChatHook.getChatIGN());
                int dupeLocation2 = dupeLocation1 + 1;
                while (dupeLocation1 != 98) {
                    playerData[dupeLocation1] = playerData[dupeLocation1 + 2];
                    playerData[dupeLocation2] = playerData[dupeLocation2 + 2];
                    dupeLocation1 = dupeLocation1 + 2;
                    dupeLocation2 = dupeLocation2 + 2;
                    if (dupeLocation1 >= 98) {
                        break;
                    }
                }
            }
            playerData[98] = playerData[96];
            playerData[96] = playerData[94];
            playerData[94] = playerData[92];
            playerData[92] = playerData[90];
            playerData[90] = playerData[88];
            playerData[88] = playerData[86];
            playerData[86] = playerData[84];
            playerData[84] = playerData[82];
            playerData[82] = playerData[80];
            playerData[80] = playerData[78];
            playerData[78] = playerData[76];
            playerData[76] = playerData[74];
            playerData[74] = playerData[72];
            playerData[72] = playerData[70];
            playerData[70] = playerData[68];
            playerData[68] = playerData[66];
            playerData[66] = playerData[64];
            playerData[64] = playerData[62];
            playerData[62] = playerData[60];
            playerData[60] = playerData[58];
            playerData[58] = playerData[56];
            playerData[56] = playerData[54];
            playerData[54] = playerData[52];
            playerData[52] = playerData[50];
            playerData[50] = playerData[48];
            playerData[48] = playerData[46];
            playerData[46] = playerData[44];
            playerData[44] = playerData[42];
            playerData[42] = playerData[40];
            playerData[40] = playerData[38];
            playerData[38] = playerData[36];
            playerData[36] = playerData[34];
            playerData[34] = playerData[32];
            playerData[32] = playerData[30];
            playerData[30] = playerData[28];
            playerData[28] = playerData[26];
            playerData[26] = playerData[24];
            playerData[24] = playerData[22];
            playerData[22] = playerData[20];
            playerData[20] = playerData[18];
            playerData[18] = playerData[16];
            playerData[16] = playerData[14];
            playerData[14] = playerData[12];
            playerData[12] = playerData[10];
            playerData[10] = playerData[8];
            playerData[8] = playerData[6];
            playerData[6] = playerData[4];
            playerData[4] = playerData[2];
            playerData[2] = playerData[0];
            playerData[99] = playerData[97];
            playerData[97] = playerData[95];
            playerData[95] = playerData[93];
            playerData[93] = playerData[91];
            playerData[91] = playerData[89];
            playerData[89] = playerData[87];
            playerData[87] = playerData[85];
            playerData[85] = playerData[83];
            playerData[83] = playerData[81];
            playerData[81] = playerData[79];
            playerData[79] = playerData[77];
            playerData[77] = playerData[75];
            playerData[75] = playerData[73];
            playerData[73] = playerData[71];
            playerData[71] = playerData[69];
            playerData[69] = playerData[67];
            playerData[67] = playerData[65];
            playerData[65] = playerData[63];
            playerData[63] = playerData[61];
            playerData[61] = playerData[59];
            playerData[59] = playerData[57];
            playerData[57] = playerData[55];
            playerData[55] = playerData[53];
            playerData[53] = playerData[51];
            playerData[51] = playerData[49];
            playerData[49] = playerData[47];
            playerData[47] = playerData[45];
            playerData[45] = playerData[43];
            playerData[43] = playerData[41];
            playerData[41] = playerData[39];
            playerData[39] = playerData[37];
            playerData[37] = playerData[35];
            playerData[35] = playerData[33];
            playerData[33] = playerData[31];
            playerData[31] = playerData[29];
            playerData[29] = playerData[27];
            playerData[27] = playerData[25];
            playerData[25] = playerData[23];
            playerData[23] = playerData[21];
            playerData[21] = playerData[19];
            playerData[19] = playerData[17];
            playerData[17] = playerData[15];
            playerData[15] = playerData[13];
            playerData[13] = playerData[11];
            playerData[11] = playerData[9];
            playerData[9] = playerData[7];
            playerData[7] = playerData[5];
            playerData[5] = playerData[3];
            playerData[3] = playerData[1];

            playerData[0] = ChatHook.getChatIGN();
            playerData[1] = "" + IGNTime;
        }
    }
}
