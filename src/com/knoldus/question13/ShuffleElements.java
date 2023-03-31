package com.knoldus.question13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ShuffleElements
{
    public static void main(String[] args) {
        List<Integer> listOfElements = new ArrayList<>();
        listOfElements.add(5);
        listOfElements.add(10);
        listOfElements.add(20);
        listOfElements.add(30);
        listOfElements.add(60);

        System.out.println("List before shuffling: " + listOfElements);
        // shuffling list of numbers.
        Collections.shuffle(listOfElements);
        System.out.println("List after shuffling" + listOfElements);
    }
}
