package com.designpatterns.iterator;

import com.designpatterns.composite.MenuComponent;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n---------------");
        Iterator iterator = allMenus.createIterator();
        // Iterate through every elem of the composite structure and print only vegetarian items.
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            // We use try-catch here, so we have transparency, and we are treating
            // menus and menu items uniformly.
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                // Do nothing if MenuComponent does not support isVegetarian()
                // So continue to the next iteration.
            }
        }
    }
}
