package com.codecool;

import com.codecool.entity.Inventory;
import com.codecool.entity.Item;
import com.codecool.view.Display;

public class Main {
    public static void main(String[] args) {
        Item axe = new Item("axe");
        Inventory inventory = new Inventory();
        inventory.addItem(axe);

        Display display = new Display();
        display.displayInventory(inventory);
    }
}
