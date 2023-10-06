package com.designpatterns.iterator.menus;

import java.util.Iterator;

// This is the aggregate interface.
// Common interface for your aggregates is handy for clients.
// It decouples the client from the implementation of your collection of objects (= aggregates).
public interface Menu {

    Iterator createIterator();
}
