package com.startjava.graduation.bookshelf;

public class Book {

    private final String title;
    private final String author;
    private final int publishYear;
//    private final int LENGHT_BOOK_INFO = 3;

    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String toString() {
        return "Book [author =" + author + ", publishYear=" + publishYear + ", title=" + title + "]";
    }
}
