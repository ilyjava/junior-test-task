package ru.buyanov.hunting;

import java.util.Iterator;

/**
 *  @author https://github.com/alex-on-java 03.02.2016
 */
public class IntIterable implements Iterable<Integer> {
    int[] backed;
    private int i = 0;

    public IntIterable(int[] backed) {
        this.backed = backed;
    }

    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {

        public boolean hasNext() {
        	return i < backed.length;
        }

        public Integer next() {
        	try {
        		return backed[i++];
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        	return null;
        }

        public void remove() {
            throw new IllegalStateException("Could not remove from array");
        }
    }
}
