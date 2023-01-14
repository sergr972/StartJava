package com.startjava.graduation.bookshelf;

public class Book {

    String author;
    String title;
    int publishYear;

    public Book(String bookAuthor, String bookName, int year) {
        author = bookAuthor;
        title = bookName;
        publishYear = year;
    }

    public String toString() {
        String str = "|" + author + ", " + title + ", " + publishYear;
        int position = 35;
        final StringBuilder buffer = new StringBuilder(position);
        final int to = position - str.length();
        buffer.append(str);
        buffer.append(" ".repeat(Math.max(0, to))).append("|");
        return buffer.toString();
    }
}