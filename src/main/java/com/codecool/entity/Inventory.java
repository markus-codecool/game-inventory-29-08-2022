package com.codecool.entity;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Item[] myArray = {
            new Item("axe"),
            new Item("sword")
    };
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }
}
