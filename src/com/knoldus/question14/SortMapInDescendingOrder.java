package com.knoldus.question14;
import java.util.*;
public class SortMapInDescendingOrder
{
    public static void main(String[] args) {

        // creating and adding values to hashmap.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Product1", 500);
        map.put("Product2", 600);
        map.put("Product3", 700);
        map.put("Product4", 800);

        ArrayList<Integer> integersList = new ArrayList<>();

        // Loop to put the values of map in list.
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            integersList.add(entry.getValue());
        }
        // sorting the list using comparator.
        Collections.sort(integersList, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer next) {
                return next.compareTo(integer);
            }
        });
        System.out.println(integersList);
        LinkedHashMap<String, Integer> descending_Map = new LinkedHashMap<>();
        for(Integer number : integersList){
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue().equals(number))
                    descending_Map.put(entry.getKey(), number);
            }
        }
        System.out.println(descending_Map);

    }
}

