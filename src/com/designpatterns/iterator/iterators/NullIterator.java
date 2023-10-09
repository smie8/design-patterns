package com.designpatterns.iterator.iterators;

import java.util.Iterator;

public class NullIterator implements Iterator {

    // Using this the client does not have to check for nulls.

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
