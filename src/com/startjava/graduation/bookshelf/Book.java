package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getBookInfoLength() {
        int bookInfoLength = toString().length();
        return bookInfoLength;
    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}