package com.knoldus.question17;

import com.knoldus.question16.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortBookList
{
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        System.out.println("Enter the number of books: ");
        Integer numberOfBooks = takeInput.nextInt();
        String titleOfBook;
        String authorOfBook;
        Double priceOfBook;
        for(Integer index = 0; index<numberOfBooks; index++){
            System.out.println("Enter the title: "+index);
            titleOfBook = takeInput.nextLine();
            titleOfBook = takeInput.nextLine();
            System.out.println("Enter the author"+index);
            authorOfBook = takeInput.nextLine();
            System.out.println("Enter the price"+index);
            priceOfBook = takeInput.nextDouble();
            Book book = new Book(titleOfBook, authorOfBook, priceOfBook);
            bookList.add(book);
        }

        System.out.println("Sorting the list by title");
        Collections.sort(bookList, new AuthorComparator());

        System.out.println(bookList);

        System.out.println("Sorting the list by price");
        Collections.sort(bookList, new PriceComparator());

        System.out.println(bookList);
    }
}
