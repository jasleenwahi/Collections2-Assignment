package com.knoldus.question9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class sortLinkedListOfNumber
{
    public static void main(String[] args) {
        // Create a LinkedList of custom objects.
        LinkedList<Person> listOfPerson = new LinkedList<Person>();
        listOfPerson.add(new Person("Bhavesh"));
        listOfPerson.add(new Person("Avinash"));
        listOfPerson.add(new Person("Chirag"));

        // Sort the LinkedList by the "name" field.
        Collections.sort(listOfPerson, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });

        // Print the sorted LinkedList.
        System.out.println("Sorted list is as follows");
        for (Person person : listOfPerson) {
            System.out.println(person.getName());
        }
    }
}
