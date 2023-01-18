package com.startjava.graduation.bookshelf;

public class Book {

    String author;
    String title;
    int year;
    int bookInfoLength;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }

    int bookInfoLength() {
        bookInfoLength = toString().length();
        return bookInfoLength;
    }
}