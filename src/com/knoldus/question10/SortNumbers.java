package com.knoldus.question10;

import java.util.*;

public class SortNumbers
{
    public static void main(String[] args) {
        // creating and adding values to priority queue.
        Queue<Integer> numbers = new PriorityQueue<>();
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the number of entries to enter in queue: ");
        Integer numberOfEntries = takeInput.nextInt();
        for(Integer index=0; index<numberOfEntries; index++)
        {
            System.out.println("Enter a number");
            Integer number = takeInput.nextInt();
            numbers.add(number);
        }

        List<Integer> numberList = new ArrayList<>(numbers);
        //sorting priority queue in descending order.
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println(numberList);
    }
}
