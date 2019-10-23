package com.james;

import java.util.Arrays;

class MusicCD extends CD {
   private String[][] songs;


    MusicCD(int[] cdNo, String[] title, double[] cost, int[] stockLevel, String[][] songs) {
        super.cdNo = cdNo;
        super.title = title;
        super.cost = cost;
        super.stockLevel = stockLevel;
        this.songs = songs;
    }

    void displayMusicCD(){
        System.out.print("\n");
        System.out.print("Music CDs\n");
        System.out.print("================\n");
        System.out.print(cdNo[0] + ". " + title[0] + " songs on CD" + Arrays.toString(songs[0]) + " " + cost[0] + " " + stockLevel[0] + " CDs left.\n");
        System.out.print(cdNo[1] + ". " + title[1] + " songs on CD" + Arrays.toString(songs[1]) + " " + cost[1] + " " + stockLevel[1] + " CDs left.\n");
    }
}
