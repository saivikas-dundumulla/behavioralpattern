package com.saivikas.iterator;


import java.util.Iterator;

public class BikeRepository<T> implements Iterable<T> {
    private T[] bikes;
    private int index;
    public BikeRepository(){
        bikes = (T[]) new Object[10];
        index = 0;
    }
    public void addBike(T bike) {
        if (index == bikes.length) {
            Object[] largerBikes = new Object[bikes.length+ bikes.length/2 + 1];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = (T[]) largerBikes;
        }
        bikes[index++] = bike;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = 0;
            @Override
            public boolean hasNext() {
                return current < bikes.length && bikes[current] != null;
            }

            @Override
            public T next() {
                return bikes[current++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
