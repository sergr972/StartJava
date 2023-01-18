package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {

    static int maxSize;
    static String maxLenBook;
    private final static Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        printAll();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Book book;
            int input;
            String bookName;

            System.out.println("""
                                        
                    Введите номер операции:
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    0. Выход
                    """);
            try {
                input = scanner.nextInt();
                if (input < 0 || input > 4) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException exc) {
                System.out.println("Неверный номер операции.");
                continue;
            }
            switch (input) {
                case 1 -> {
                    if (BOOK_SHELF.freeShelves() == 0) {
                        System.out.println("\nШкаф заполнен.");
                        break;
                    }
                    System.out.println("Введите книгу в формате автор, название, год издания: ");
                    try {
                        scanner.nextLine();
                        String[] strings = scanner.nextLine().split(", ", 3);
                        book = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
                        BOOK_SHELF.addBook(book);
                        System.out.println("\nКнига добавлена.");
                        if (book.bookInfoLength() > maxSize) {
                            maxSize = book.bookInfoLength;
                            maxLenBook = book.title;
                        }
                    } catch (RuntimeException e) {
                        System.out.println("\nНеверный ввод данных.");
                    }
                }
                case 2 -> {
                    System.out.println("Введите название книги: ");
                    try {
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        System.out.println("|" + BOOK_SHELF.findBook(bookName) + "|");
                    } catch (RuntimeException e) {
                        System.out.println("Книга отсутствует в шкафу.");
                    }
                }
                case 3 -> {
                    System.out.println("Введите название книги: ");
                    try {
                        scanner.nextLine();
                        bookName = scanner.nextLine();
                        BOOK_SHELF.deleteBook(bookName);
                        if (bookName.equals(maxLenBook)) {
                            maxSize();
                        }
                        System.out.println("Книга " + bookName + " удалена.");
                    } catch (RuntimeException e) {
                        System.out.println("Книга отсутствует в шкафу.");
                    }
                }
                case 4 -> {
                    BOOK_SHELF.clearShelf();
                    System.out.println("Полки очищены.");
                    maxSize = 0;
                }
                case 0 -> {
                    System.out.println("Программа завершена.");
                    return;
                }
                default -> System.out.println("Неверная команда.");
            }
            System.out.println("Для продолжения нажмите Enter");
            scanner.nextLine();
            System.out.println("\nВ шкафу " + BOOK_SHELF.numberBooks() + " книг и свободно "
                    + BOOK_SHELF.freeShelves() + " полок\n");
            printAll();
        }
    }

    static void printAll() {
        Book[] all = BOOK_SHELF.getAll();
        if (all.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            for (Book book : all) {
                if (book != null) {
                    StringBuilder builder = new StringBuilder(maxSize);
                    int to = maxSize - book.bookInfoLength();
                    builder.append(book);
                    System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
                    System.out.println("|" + "-".repeat(maxSize) + "|");
                }
            }
            if (BOOK_SHELF.freeShelves() > 0) {
                System.out.println("|" + " ".repeat(maxSize) + "|");
            }
        }
    }

    public static void maxSize() {
        maxSize = 0;
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                if (book.bookInfoLength() > maxSize) {
                    maxSize = book.bookInfoLength();
                    maxLenBook = book.title;
                }
            }
        }
    }
}
