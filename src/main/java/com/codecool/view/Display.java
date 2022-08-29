package com.codecool.view;

import com.codecool.entity.Inventory;
import com.codecool.entity.Item;

import java.util.HashMap;
import java.util.Map;

public class Display {
    public void displayInventory(Inventory inventory) {
        Map<Item, Integer> countedItems = new HashMap<>();

        for (Item item : inventory.getItems()) {
            if (countedItems.containsKey(item)) {
                int count = countedItems.get(item) + 1;
                countedItems.put(item, count);
            } else {
                countedItems.put(item, 1);
            }
        }

        System.out.println(countedItems);
    }
}
