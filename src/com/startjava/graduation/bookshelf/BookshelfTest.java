package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {

    private static int maxSize;
    private static String maxLenBook;
    private final static Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        printAll();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Book book;
            int input;
            String title;

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
                    if (BOOK_SHELF.getFreeShelves() == 0) {
                        System.out.println("\nШкаф заполнен.");
                        break;
                    }
                    System.out.println("Введите книгу в формате автор, название, год издания: ");
                    try {
                        scanner.nextLine();
                        String[] strings = scanner.nextLine().split(", ", 3);
                        book = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
                        BOOK_SHELF.add(book);
                        System.out.println("\nКнига добавлена.");
                        if (book.getInfoLength() > maxSize) {
                            maxSize = book.getInfoLength();
                            maxLenBook = book.getTitle();
                        }
                    } catch (RuntimeException e) {
                        System.out.println("\nНеверный ввод данных.");
                    }
                }
                case 2 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    if (BOOK_SHELF.find(title) == null) {
                        System.out.println("Книга отсутствует в шкафу.");
                    } else {
                        System.out.println("|" + BOOK_SHELF.find(title) + "|");
                    }
                }
                case 3 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    if (BOOK_SHELF.delete(title)) {
                        System.out.println("Книга " + title + " удалена.");
                        if (title.equals(maxLenBook)) {
                            maxSize();
                        }
                    } else {
                        System.out.println("Книга отсутствует в шкафу.");
                    }
                }
                case 4 -> {
                    BOOK_SHELF.clear();
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
            System.out.println("\nВ шкафу " + BOOK_SHELF.getNumberBooks() + " книг и свободно "
                    + BOOK_SHELF.getFreeShelves() + " полок\n");
            printAll();
        }
    }

    private static void printAll() {
        Book[] all = BOOK_SHELF.getAll();
        if (all.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            for (Book book : all) {
                if (book != null) {
                    StringBuilder builder = new StringBuilder(maxSize);
                    int to = maxSize - book.getInfoLength();
                    builder.append(book);
                    System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
                    System.out.println("|" + "-".repeat(maxSize) + "|");
                }
            }
            if (BOOK_SHELF.getFreeShelves() > 0) {
                System.out.println("|" + " ".repeat(maxSize) + "|");
            }
        }
    }

    private static void maxSize() {
        maxSize = 0;
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                if (book.getInfoLength() > maxSize) {
                    maxSize = book.getInfoLength();
                    maxLenBook = book.getTitle();
                }
            }
        }
    }
}
