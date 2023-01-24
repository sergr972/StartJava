package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private static final int MAX_NUMBER = 10;
    public Book[] books = new Book[MAX_NUMBER];

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public Book find(String title) {
        int index = getIndex(title);
        if (index != -1) {
            return books[index];
        }
        return null;
    }

    public void delete(String title) {
        int index = getIndex(title);
        if (index != -1) {
            System.arraycopy(books, index + 1, books, index, countBooks - index);
            countBooks--;
        }
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

    private int getIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }
}
