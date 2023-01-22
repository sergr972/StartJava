package com.startjava.graduation.bookshelf;

public class Book {

    private String author;
    private String title;
    private int year;
    public static int INFO_LENGTH = 0;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        INFO_LENGTH = toString().length();
    }

    public String getTitle() {
        return title;
    }

//    public int getBookInfoLength() {
//        return bookInfoLength;
//    }

//    public int bookInfoLength() {
//        bookInfoLength = toString().length();
//        return bookInfoLength;
//    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}