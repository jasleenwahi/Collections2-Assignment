package com.knoldus.question1;

import java.util.HashMap;
import java.util.Map;

public class CreateHashmap
{
    public static void main(String[] args)
    {
        // creating hashmap and adding entries to it.
        HashMap<String, Integer> nameAndAges = new HashMap<>();
        nameAndAges.put("Riya", 23);
        nameAndAges.put("Sahil", 100);
        nameAndAges.put("Rahul", 56);
        nameAndAges.put("Jasleen", 18);
        nameAndAges.put("Anshika", 15);

        for (Map.Entry<String, Integer> entry: nameAndAges.entrySet())
        {
            System.out.println("name: "+entry.getKey()+", age: "+entry.getValue());
        }
    }
}
