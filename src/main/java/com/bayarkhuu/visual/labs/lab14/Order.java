package com.bayarkhuu.visual.labs.lab14;

public class Order {
    private int id;
    private String name;
    private int count;
    private double price;
    private String address;

    public Order() {

    }

    public Order(String name, int count, double price, String address) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
}
