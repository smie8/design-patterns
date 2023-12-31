package com.designpatterns.iterator.menus;

import com.designpatterns.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

// This is a concrete aggregate.
public class PancakeHouseMenu implements MenuAggregate {

    // PancakeHouseMenu is implemented using an ArrayList, vs DinerMenu is implemented using an array
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
