package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private static int maxLenBook;
    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];

    public static int getMaxLenBook() {
        return maxLenBook;
    }

    public void add(Book book) {
        books[countBooks] = book;
        countBooks++;
        if (book.getInfoLength() > maxLenBook) {
            maxLenBook = book.getInfoLength();
        }
    }

    public Book find(String title) {
        int index = findIndex(title);
        return ((index != -1) ? books[index] : null);
    }

    public boolean delete(String title) {
        int index = findIndex(title);
        if (index != -1) {
            int lenBook = books[index].getInfoLength();
            countBooks--;
            System.arraycopy(books, index + 1, books, index, countBooks - index);
            books[countBooks] = null;
            if (lenBook == maxLenBook) {
                calcLength();
            }
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        maxLenBook = 0;
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

    private int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    private void calcLength() {
        maxLenBook = 0;
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getInfoLength() > maxLenBook) {
                maxLenBook = books[i].getInfoLength();
            }
        }
    }
}
