package com.iamtrk.designpatterns.vendingmachine;

public enum  Item {
    COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45);

    private String name;
    private int price;
    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
