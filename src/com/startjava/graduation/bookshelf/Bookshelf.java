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
        int i = check(title);
        if (i < countBooks) {
            return books[i];
        } else {
            System.out.println("Книги " + title + " нет!");
        }
        return null;
    }

    public void delete(String title) {
        int i = check(title);
        if (i < countBooks) {
            countBooks--;
            System.arraycopy(books, i + 1, books, i, countBooks - i);
            System.out.println("Книга " + title + " удалена!");
        } else {
            System.out.println("Книги " + title + " нет!");
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

    private int check(String title) {
        int i = 0;
        for (; i < countBooks; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                break;
            }
        }
        return i;
    }
}
