package com.designpatterns.iterator.iterators;

import com.designpatterns.composite.MenuComponent;
import com.designpatterns.iterator.menus.Menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    // This is example of external iterator (vs internal that we had in MenuComponent).

    Stack stack = new Stack();

    // The iterator of the top-level menu is passed in.
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public Object next() {
        // If there is a next element, return it.
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            // If the next element is a menu, push its iterator to the stack.
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            // If next element is a menu item, return it.
            return component;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        // If the stack is empty, there are no more elements to iterate over.
        if (stack.empty()) {
            return false;
        }
        // Otherwise, look at the iterator on top of the stack.
        Iterator iterator = (Iterator) stack.peek();
        // If the iterator has no more elements, pop it off the stack and call hasNext() recursively.
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        // If the iterator has more elements, return true.
        return true;
    }

    @Override
    public void remove() {
        // We are not supporting remove, only traversal.
        throw new UnsupportedOperationException();
    }
}
