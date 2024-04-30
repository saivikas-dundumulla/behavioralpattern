package com.saivikas.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how");
        list.add("are");
        list.add("you");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }
        System.out.println(list.size());

        BikeRepository<String> repository = new BikeRepository<>();
        repository.addBike("Bullet");
        repository.addBike("Splendor");
        repository.addBike("activa");

        for (String s : repository) {
            System.out.println(s);
        }

        BikeRepository<Integer> costRepository = new BikeRepository<>();
        costRepository.addBike(1);
        costRepository.addBike(2);
        costRepository.addBike(3);

        for (Integer item : costRepository) {
            System.out.println(item);
        }
    }
}
