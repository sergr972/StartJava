package com.startjava.graduation.bookshelf;

public class Book {

    String author;
    String title;
    int publishYear;
    int bookInfoLength;

    public Book(String bookAuthor, String bookName, int year) {
        author = bookAuthor;
        title = bookName;
        publishYear = year;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }



    int bookInfoLength() {
        bookInfoLength = toString().length();
        return bookInfoLength;
    }
}