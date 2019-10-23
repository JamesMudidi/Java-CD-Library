package com.james;

public class CD {
    int cdNo;
    String title;
    double cost;
    int stockLevel;

    public void setCD(
            int cdNo,
            String title,
            double cost,
            int stockLevel) {
        this.cdNo = cdNo;
        this.title = title;
        this.cost = cost;
        this.stockLevel = stockLevel;
    }
}
