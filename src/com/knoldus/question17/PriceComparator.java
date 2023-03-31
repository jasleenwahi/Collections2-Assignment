package com.knoldus.question17;

import java.util.Comparator;

// comparator for sorting by book price.
public class PriceComparator implements Comparator<Book>
{

    @Override
    public int compare(Book book1, Book book2) {
        return (int) (book2.price - book1.price);
    }
}
