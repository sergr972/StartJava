package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private static final int CAPACITY = 10;
    public Book[] books = new Book[CAPACITY];

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
    }

    public Book find(String title) {
        int index = searchBook(title);
        return ((index != -1)? books[index] : null);
    }

    public boolean delete(String title) {
        int index = searchBook(title);
        if (index != -1) {
            System.arraycopy(books, index + 1, books, index, countBooks - index - 1);
            books[countBooks - 1] = null;
            countBooks--;
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getNumberBooks() {
        return countBooks;
    }

    public int getFreeShelves() {
        return (CAPACITY - countBooks);
    }

    private int searchBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }
}
