package com.designpatterns.composite;

public abstract class MenuComponent {

    // We need common interface for both menus and menu items (leaf nodes and composite nodes)
    // so we can treat them uniformly.

    // Methods for menus (composite nodes):
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // Methods for MenuItems (leaf nodes):
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    // Common methods:
    public void print() {
        throw new UnsupportedOperationException();
    }
}
