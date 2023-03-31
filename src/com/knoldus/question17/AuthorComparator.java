package com.knoldus.question17;

import java.util.Comparator;

// comparator for sorting by author name.
public class AuthorComparator implements Comparator<Book>
{

    @Override
    public int compare(Book book1, Book book2) {
        return book1.author.compareTo(book2.author);
    }
}
