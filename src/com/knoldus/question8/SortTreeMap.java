package com.knoldus.question8;

import java.util.*;

public class SortTreeMap
{
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        // creating and adding values to a map.
        Map<String, Integer> numberStringMap = new TreeMap<>();
        System.out.println("Enter the number of entries to enter in the map");
        Integer numberOfEntries = takeInput.nextInt();
        String string;
        Integer number;
        for(Integer index=0; index<numberOfEntries; index++){
            System.out.println("Enter a string: ");
            string = takeInput.nextLine();
            string = takeInput.nextLine();
            System.out.println("Enter a number: ");
            number = takeInput.nextInt();
            numberStringMap.put(string, number);
        }

        // creating a list to add numbers to and to sort numbers.
        List<Integer> sortedData = new ArrayList<>();
        for(Map.Entry<String, Integer> integerEntry: numberStringMap.entrySet()){
                    sortedData.add(integerEntry.getValue());
        }
        Collections.sort(sortedData, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1.compareTo(integer);
            }
        });

        // adding sorted values to linked hashmap.
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        for (Integer integer: sortedData) {
            for (Map.Entry<String, Integer> integerEntry : numberStringMap.entrySet()) {
                if(integerEntry.getValue().equals(integer)){
                    linkedHashMap.put(integerEntry.getKey(), integer);
                }
            }
        }

        System.out.println(linkedHashMap);
    }
}