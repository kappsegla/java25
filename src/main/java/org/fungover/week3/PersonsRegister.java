package org.fungover.week3;

import java.util.Arrays;
import java.util.Comparator;

public class PersonsRegister {

    public static void main(String[] args) {

        Person person = new Person("Tjorven", 10);

        Person[] persons = new Person[5];
        persons[0] = person;
        persons[1] = new Person("Olle", 11);
        persons[2] = new Person("Stina", 3);
        persons[3] = new Person("Melker", 65);
        persons[4] = new Person("Båtsman", 20);

        System.out.println(person.name());
        System.out.println(persons[0].name());

        //Since we have a complex datatype, we must tell the sorting algorithm
        //what should be compared, in this case the age() on each person.
        Arrays.sort(persons, Comparator.comparingInt(Person::age));
        System.out.println(Arrays.toString(persons));
    }
}

record Person(String name, int age) {
}