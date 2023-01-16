package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    int numberBooks;
    int BOOKS_LIMIT = 10;
    Book[] books = new Book[BOOKS_LIMIT];

    //добавить книгу
    void addBook(Book book) {
        books[numberBooks] = book;
        numberBooks++;
    }

    //найти книгу
    Book findBook(String bookName) {
        for (Book book: books) {
            if (bookName.equalsIgnoreCase(book.title)) {
                return book;
            }
        }
        return null;
    }

    //удалить книгу
    void deleteBook(String bookName) {
        int index = 0;
        for (int i = 0; i < numberBooks; i++) {
            if (bookName.equalsIgnoreCase(books[i].title)) {
                index = i;
                numberBooks--;
                break;
            }
        }
        System.arraycopy(books, index + 1, books, index, numberBooks);
    }

    //очистить полку
    void clearShelf() {
        Arrays.fill(books, 0, numberBooks, null);
    }

    //получить все книги (только для визуализации шкафа)
    Book[] getAll() {
        return Arrays.copyOf(books, numberBooks);
    }

    //получить количество книг в шкафу
    int numberBooks() {
        return numberBooks;
    }

    //получить количество свободных полок
    int freeShelves() {
        return (BOOKS_LIMIT - numberBooks);
    }
}
