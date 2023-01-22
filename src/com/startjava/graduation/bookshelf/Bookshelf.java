package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int currentNumber;
    public static final int MAX_NUMBER = 10;
    private final Book[] books = new Book[MAX_NUMBER];

    public void add(Book book) {
        books[currentNumber] = book;
        currentNumber++;
    }

    public Book find(String bookName) {
        for (Book book : books) {
            if (bookName.equalsIgnoreCase(book.getTitle())) {
                return book;
            }
        }
        throw new RuntimeException();
    }

    public void delete(String bookName) {
        for (int i = 0; i < currentNumber; i++) {
            if (bookName.equalsIgnoreCase(books[i].getTitle())) {
                currentNumber--;
                System.arraycopy(books, i + 1, books, i, currentNumber);
                return;
            }
        }
        throw new RuntimeException();
    }

    public void clear() {
        Arrays.fill(books, 0, currentNumber, null);
    }

    Book[] getAll() {
        return Arrays.copyOf(books, currentNumber);
    }

    public int numberBooks() {
        return currentNumber;
    }

    public int freeShelves() {
        return (MAX_NUMBER - currentNumber);
    }
}
