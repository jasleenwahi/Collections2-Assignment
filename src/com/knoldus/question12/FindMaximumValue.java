package com.knoldus.question12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMaximumValue
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        Integer number;
        System.out.println("Enter the number of entries");
        Integer numberOfEntries = takeInput.nextInt();
        for(Integer index=0; index<numberOfEntries; index++)
        {
            System.out.println("Enter the number");
            number = takeInput.nextInt();
            listOfNumbers.add(number);
        }
        // finding maximum value.
        Integer maximum = Collections.max(listOfNumbers);
        System.out.println("Maximum number in the list is " + maximum);
    }
}


