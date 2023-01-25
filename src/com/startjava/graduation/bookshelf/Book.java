package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int year;
    private final int infoLength;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        infoLength = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return infoLength;
    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}