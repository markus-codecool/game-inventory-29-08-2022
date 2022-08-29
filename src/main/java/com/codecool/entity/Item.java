package com.codecool.entity;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
        String test = "test";
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
