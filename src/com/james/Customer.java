package com.james;

// Create a Customer class
public class Customer {
    // Create a class attribute
    String[] name;
    String order;
    double orderCost;
    String telephone;

    public void setCustomer(
            String[] name,
            String order,
            double orderCost,
            String telephone) {
        this.name = name;
        this.order = order;
        this.orderCost = orderCost;
        this.telephone = telephone;
    }
}
