package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    int currentNumber;
    public static int MAX_NUMBER = 2;
    public static Book[] books = new Book[MAX_NUMBER];

    //добавить книгу
    void addBook(Book book) {
        books[currentNumber] = book;
        currentNumber++;
    }

    //найти книгу
    Book findBook(String bookName) {
        for (Book book : books) {
            if (bookName.equalsIgnoreCase(book.title)) {
                return book;
            }
        }
        throw new RuntimeException();
    }

    //удалить книгу
    void deleteBook(String bookName) {
        for (int i = 0; i < currentNumber; i++) {
            if (bookName.equalsIgnoreCase(books[i].title)) {
                currentNumber--;
                System.arraycopy(books, i + 1, books, i, currentNumber);
                return;
            }
        }
        throw new RuntimeException();
    }

    //очистить полку
    void clearShelf() {
        Arrays.fill(books, 0, currentNumber, null);
    }

    //получить все книги (только для визуализации шкафа)
    Book[] getAll() {
        return Arrays.copyOf(books, currentNumber);
    }

    //получить количество книг в шкафу
    int numberBooks() {
        return currentNumber;
    }

    //получить количество свободных полок
    int freeShelves() {
        return (MAX_NUMBER - currentNumber);
    }
}
