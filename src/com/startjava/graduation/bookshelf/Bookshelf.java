package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int countBooks;
    private static final int CAPACITY = 10;
    private static final Book[] BOOKS = new Book[CAPACITY];

    static int maxSize;
    static String maxLenBook;

    public void add(Book book) {
        BOOKS[countBooks] = book;
        countBooks++;
        if (book.getInfoLength() > maxSize) {
            maxSize = book.getInfoLength();
            maxLenBook = book.getTitle();
        }
    }

    public Book find(String title) {
        int index = findIndex(title);
        return ((index != -1) ? BOOKS[index] : null);
    }

    public boolean delete(String title) {
        int index = findIndex(title);
        if (index != -1) {
            System.arraycopy(BOOKS, index + 1, BOOKS, index, countBooks - index - 1);
            BOOKS[countBooks - 1] = null;
            countBooks--;
            if (title.equals(maxLenBook)) {
                maxSize();
            }
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(BOOKS, 0, countBooks, null);
        countBooks = 0;
        maxSize = 0;
    }

    public Book[] getAll() {
        return Arrays.copyOf(BOOKS, countBooks);
    }

    public int getNumberBooks() {
        return countBooks;
    }

    public int getFreeShelves() {
        return (CAPACITY - countBooks);
    }

    private int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (title.equalsIgnoreCase(BOOKS[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    private static void maxSize() {
        maxSize = 0;
        for (Book book : BOOKS) {
            if (book != null) {
                if (book.getInfoLength() > maxSize) {
                    maxSize = book.getInfoLength();
                    maxLenBook = book.getTitle();
                }
            }
        }
    }
}
