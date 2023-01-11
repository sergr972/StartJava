package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {

    private int numberBook;
    private static final int BOOKS_LIMIT = 10;
    private final Book[] books = new Book[BOOKS_LIMIT];


    //добавить книгу

    void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите книгу в формате author, title, publishYear: ");
        String[] strings = scanner.nextLine().split(", ", 3);
        books[numberBook] = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
        numberBook++;
    }

    //найти книгу
    void find() {

    }

    //удалить книгу
    void delete() {

    }

    //очистить полку
    void clearShelf() {
        Arrays.fill(books, 0, numberBook, null);
    }

    //получить все книги (только для визуализации шкафа)
    Book[] getAll() {
        return Arrays.copyOf(books, numberBook);
    }



//        Book b1 = new Book("Name1", "Author1", 1901);
//        Book b2 = new Book("Name2", "Author2", 1902);
//        Book b3 = new Book("Name3", "Author3", 1903);
//        Book b4 = new Book("Name4", "Author4", 1904);
//        addBook(b1);
//        addBook(b2);
//        addBook(b3);
//        addBook(b4);

//        System.out.println("after adding");
//        System.out.println(this);
//        deleteBook(1);
//        deleteBook(4);

//        System.out.println("after removing");
//        System.out.println(this);



    //получить количество книг в шкафу
    int  getNumberBooks() {
        return numberBook;
    }

    //получить количество свободных полок
    int getFreeShelves() {
        return (BOOKS_LIMIT - numberBook);
    }
}
