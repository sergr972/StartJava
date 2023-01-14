package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static int numberBook;
    private static final int BOOKS_LIMIT = 10;
    private static final Book[] books = new Book[BOOKS_LIMIT];

    //добавить книгу
    void addBook(Book book) {
        books[numberBook] = book;
        numberBook++;
    }

    //найти книгу
    Book findBook(String bookName) {
        for (int i = 0; i < numberBook; i++) {
            if (bookName.equals(books[i].title)) {
                return books[i];
            }
        }
        return null;
    }

    //удалить книгу
    void deleteBook(String bookName) {
        for (int i = 0; i < numberBook; i++) {
            if (bookName.equals(books[i].title)) {
                books[i] = books[numberBook - 1];
                books[numberBook - 1] = null;
                numberBook--;
                break;
            }
        }
    }

    //очистить полку
    void clearShelf() {
        Arrays.fill(books, 0, numberBook, null);
    }

    //получить все книги (только для визуализации шкафа)
    Book[] getAll() {
        return Arrays.copyOf(books, numberBook);
    }

    //получить количество книг в шкафу
    int getNumberBooks() {
        return numberBook;
    }

    //получить количество свободных полок
    int getFreeShelves() {
        return (BOOKS_LIMIT - numberBook);
    }
}
