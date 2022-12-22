package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class Bookshelf {

    private int numberBook;
    private static final int BOOKS_LIMIT = 10;
    private final Book[] books = new Book[BOOKS_LIMIT];


    Scanner scanner = new Scanner(System.in);
    //добавить книгу
    void addBook() {
        System.out.print("Введите книгу в формате title, author, publishYear: ");
        String[] strings = scanner.nextLine().split(", ", 3);
        books[0] = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
    }
    //найти книгу
    void find() {

    }
    //удалить книгу
    void delete() {

    }
    //очистить полку
    void clearShelf() {

    }
    //получить все книги (только для визуализации шкафа)
    void testBookshelf() {

    }
    //получить количество книг в шкафу
    void getNumberBooks() {

    }
    //получить количество свободных полок
    void getFreeShelves() {

    }





}
