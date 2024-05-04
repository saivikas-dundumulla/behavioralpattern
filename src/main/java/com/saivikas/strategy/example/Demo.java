package com.saivikas.strategy.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Sai Vikas", 25, 1234567890L);
        Person person2 = new Person("Pankaj", 35, 493774983L);
        Person person3 = new Person("Dhruv", 40, 283746509L);
        Person person4 = new Person("virat", 32, 1234567890L);

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        System.out.println("Before sorting: ");
        persons.forEach(System.out::println);

        persons.sort(Comparator.comparing(Person::age));
        System.out.println("After sorting by age: ");
        persons.forEach(System.out::println);
    }
}
