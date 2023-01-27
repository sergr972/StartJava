package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        printAll();
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
            input = scanner.nextInt();
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
                    } catch (RuntimeException e) {
                        System.out.println("\nНеверный ввод данных.");
                    }
                }
                case 2 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    book = BOOK_SHELF.find(title);
                    if (book == null) {
                        System.out.println("Книга отсутствует в шкафу.");
                    } else {
                        System.out.println("|" + book + "|");
                    }
                }
                case 3 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    if (BOOK_SHELF.delete(title)) {
                        System.out.println("Книга " + title + " удалена.");
                    } else {
                        System.out.println("Книга отсутствует в шкафу.");
                    }
                }
                case 4 -> {
                    BOOK_SHELF.clear();
                    System.out.println("Полки очищены.");
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
            int maxSize = Bookshelf.maxSize;
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
}
