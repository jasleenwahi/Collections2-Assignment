package com.knoldus.question15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortPerson
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        System.out.println("Enter the number of persons: ");
        Integer numberOfPerson = takeInput.nextInt();
        String nameOfPerson;
        Integer ageOfPerson;
        for(Integer index = 0; index<numberOfPerson; index++){
            System.out.println("Enter the name: "+index);
            nameOfPerson = takeInput.nextLine();
            nameOfPerson = takeInput.nextLine();
            System.out.println("Enter the age"+index);
            ageOfPerson = takeInput.nextInt();
            Person person = new Person(nameOfPerson, ageOfPerson);
            personList.add(person);
        }
        // sorting list.
        Collections.sort(personList, new AgeComparator());
        System.out.println(personList);

    }

}
