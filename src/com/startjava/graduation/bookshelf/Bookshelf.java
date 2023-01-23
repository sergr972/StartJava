package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public int countBooks;
    private final static int MAX_NUMBER = 10;
    public Book[] books = new Book[MAX_NUMBER];

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public Book find(String title) {
        for (Book book : books) {
            if (title.equalsIgnoreCase(book.getTitle())) {
                return book;
            }
        }
        throw new RuntimeException();
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                return;
            }
        }
        throw new RuntimeException();
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getNumberBooks() {
        return countBooks;
    }

    public int getFreeShelves() {
        return (MAX_NUMBER - countBooks);
    }
}
