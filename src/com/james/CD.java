package com.james;

import java.util.Arrays;

// Create a CD class
public abstract class CD {
    // Create a CD class attribute
    int[] cdNo;
    String[] title;
    double[] cost;
    int[] stockLevel;

    // Create a CD setter method
    public void setCD(
            int[] cdNo,
            String[] title,
            double[] cost,
            int[] stockLevel) {
        this.cdNo = cdNo;
        this.title = title;
        this.cost = cost;
        this.stockLevel = stockLevel;
    }
    String borrow(String[] title, int[] stockLevel) {
        if (stockLevel[0] > 2 || stockLevel[1] > 2) {
            System.out.println("Can borrow CD:" + title);
        } else {
            System.out.println("Cannot borrow CD:" + title);
        }
        return null;
    }

    void returnCD(String[] title, int stockLevel) {
        if (title == title) {}
        System.out.println("“Returned CD:" + Arrays.toString(title));
    }

    void buy(){}
}
