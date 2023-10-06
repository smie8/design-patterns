package com.designpatterns.iterator.iterators;

import com.designpatterns.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

// Not used anymore. We can just use the ArrayList's built-in iterator.
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem next = items.get(position);
        position++;
        return next;
    }
}
