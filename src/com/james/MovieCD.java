package com.james;

class MovieCD extends CD {
    private String[] duration;

    MovieCD(int[] cdNo, String[] title, double[] cost, int[] stockLevel, String[] duration){
        super.cdNo = cdNo;
        super.title = title;
        super.cost = cost;
        super.stockLevel = stockLevel;
        this.duration = duration;
    }

    // Display method
    void displayMovieCD(){
        System.out.print("\n");
        System.out.print("Movie CDs\n");
        System.out.print("================\n");
        System.out.print(cdNo[0] + ". " + title[0] + " " + duration[0] + " " + cost[0] + " " + stockLevel[0] + " CDs left.\n");
        System.out.print(cdNo[1] + ". " + title[1] + " " + duration[1] + " " + cost[1] + " " + stockLevel[1] + " CDs left.\n");
        System.out.print(cdNo[2] + ". " + title[2] + " " + duration[2] + " " + cost[2] + " " + stockLevel[2] + " CDs left.\n");
    }
}
