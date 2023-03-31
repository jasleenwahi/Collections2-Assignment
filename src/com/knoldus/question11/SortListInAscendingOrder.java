package com.knoldus.question11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SortListInAscendingOrder
{
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList ");
        int size = input.nextInt();
        System.out.println("Enter the names to be sorted in ascending order : ");
        for(int i=0; i<size;i++){
            String name = input.next();
            nameList.add(name);
        }

        // sorting list of names.
        Collections.sort(nameList);
        System.out.println("List of names in ascending order is : " + nameList);
    }
}



