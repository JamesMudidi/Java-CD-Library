package com.james;

class MusicCD extends CD {
   private String songs;

    MusicCD(int cdNo, String title, double cost, int stockLevel, String songs) {
        super.cdNo = cdNo;
        super.title = title;
        super.cost = cost;
        super.stockLevel = stockLevel;
        this.songs = songs;
    }

    void displayMusicCD(){
        System.out.print("Music CDs\n");
        System.out.print("================\n");
        System.out.print(cdNo + ". " + title + " songs on CD " + songs + " " + cost + " " + stockLevel + " CDs left.\n");
    }
}
