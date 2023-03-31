package com.knoldus.question7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SortStringsInDescendingOrder
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        HashSet<String> nameSet = new HashSet<>();
        System.out.println("Enter number of entries");
        Integer numberOfEntries = takeInput.nextInt();
        System.out.println("Enter the names one by one");
        for(Integer index = 0; index<=numberOfEntries; index++)
        {
            String name = takeInput.nextLine();
            nameSet.add(name);
        }

        ArrayList<String> list = new ArrayList<>(nameSet);
        // sorting list of names in descending order.
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("List in descending order : " + list);

    }
}

