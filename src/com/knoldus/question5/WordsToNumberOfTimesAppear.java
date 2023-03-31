package com.knoldus.question5;

import java.util.*;
public class WordsToNumberOfTimesAppear
{
        public static void countingFrequency(String[] wordCount){
            HashMap<String, Integer> map = new HashMap<>();

            //loop to find the frequency of each word in the given sentence
            for(int i=0; i<wordCount.length;i++){
                if(map.containsKey(wordCount[i])){
                    map.put(wordCount[i], map.get(wordCount[i]) + 1);
                }
                else{
                    map.put(wordCount[i], 1);
                }
            }
            System.out.println("Frequency of each word in the given sentence"  + map);

            //map conversion to list
            List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

            //sorting the list using comparator
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2) {
                    return object2.getValue().compareTo(object1.getValue());
                }
            });

            //Printing the top 10 words with highest occurrence
            System.out.println("Printing the top 10 words with highest occurrence:");
            for(int i=0; i<10; i++){
                Map.Entry<String,Integer> entry = list.get(i);
//            System.out.println(entry);
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }

        public static void main(String[] args) {
            //words as keys and frequency as values

            String sentence = "This is the most the wonderful time the time of the learning time the time most most the time and the we should we make the most of it";
            String[] wordCount = sentence.split(" ");
            WordsToNumberOfTimesAppear.countingFrequency(wordCount);
        }
}

