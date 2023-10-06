package com.designpatterns.iterator.menus;

import com.designpatterns.iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements MenuAggregate {

    // Hashtable supports the Iterator, so it's easy to fit into our system.
    Hashtable<String, MenuItem> menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        // We only need to return the values, not the keys.
        return menuItems.values().iterator();
    }
}
