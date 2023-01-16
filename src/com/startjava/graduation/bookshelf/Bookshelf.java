package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int MAX_NUMBER = 10;
    public static Book[] books = new Book[MAX_NUMBER];
    int currentNumber = 0;

    //добавить книгу
    void addBook(Book book) {
        books[currentNumber] = book;
//        if (books[currentNumber].bookInfoLength() > 0 || books[currentNumber].bookInfoLength() > books[currentNumber - 1].bookInfoLength()) {
//            BookshelfTest.maxSize();
//        }
        currentNumber++;
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
        for (int i = 0; i < currentNumber; i++) {
            if (bookName.equalsIgnoreCase(books[i].title)) {
                index = i;
                currentNumber--;
                break;
            }
        }
        System.arraycopy(books, index + 1, books, index, currentNumber);
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
