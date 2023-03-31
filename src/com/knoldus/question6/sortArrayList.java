package com.knoldus.question6;

import java.util.ArrayList;
import java.util.Collections;


public class sortArrayList
{
    public static void main(String[] args) {
        // creating and adding values to the list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);

        //sorting the list.
        Collections.sort(numbers);
        System.out.println("Printing sorted list: ");
        for(Integer number: numbers)
        {
            System.out.println(number);
        }
    }
}
