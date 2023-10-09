package com.designpatterns.iterator.menus;

import com.designpatterns.composite.MenuComponent;
import com.designpatterns.iterator.iterators.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private Iterator iterator = null;
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    // We are not overriding isVegetarian() and getPrice() because they are not applicable to menus.

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // We are not calling print() on each menu item, because we want to print the whole menu.
        // We are calling print() on each menu component, which can be either a menu or a menu item.
        // (Let's use for loop here instead of iterator just for example.)
        for (MenuComponent menuComponent : menuComponents) {
            // This is polymorphism in action: both menus and menu items have print() method.
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }

        return iterator;
    }
}
