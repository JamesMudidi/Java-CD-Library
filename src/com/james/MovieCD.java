package com.james;

class MovieCD extends CD {
    private String duration;

    MovieCD(int cdNo, String title, double cost, int stockLevel, String duration){
        super.cdNo = cdNo;
        super.title = title;
        super.cost = cost;
        super.stockLevel = stockLevel;
        this.duration = duration;
    }

    void displayMovieCD(){
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Movie CDs\n");
        System.out.print("================\n");
        System.out.print(cdNo + ". " + title + " " + duration + " " + cost + " " + stockLevel + " CDs left.\n");
    }
}
