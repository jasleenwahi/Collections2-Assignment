package com.knoldus.question15;

import java.util.Comparator;

// comparator for sorting age.
public class AgeComparator implements Comparator<Person>
{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age-person2.age;
    }
}
