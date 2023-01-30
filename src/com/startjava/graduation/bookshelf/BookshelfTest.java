package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Scanner scanner = new Scanner(System.in);
    private static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        printAll();
        while (true) {
            int input = menu();
            switch (input) {
                case 0 -> {
                    System.out.println("Программа завершена.");
                    return;
                }
                case 1 -> {
                    if (BOOK_SHELF.getFreeShelves() == 0) {
                        System.out.println("\nШкаф заполнен.");
                        break;
                    }
                    BOOK_SHELF.add(inputBook(scanner));
                    System.out.println("\nКнига добавлена.");
                    scanner.nextLine();
                }
                case 2 -> {
                    Book book = BOOK_SHELF.find(inputTitle());
                    if (book == null) {
                        System.out.println("Книга отсутствует в шкафу.");
                    } else {
                        System.out.println("|" + book + "|");
                    }
                }
                case 3 -> {
                    String title = inputTitle();
                    if (BOOK_SHELF.delete(title)) {
                        System.out.println("Книга " + title + " удалена.");
                    } else {
                        System.out.println("Книга отсутствует в шкафу.");
                    }
                }
                case 4 -> {
                    BOOK_SHELF.clear();
                    System.out.println("Полки очищены.");
                    scanner.nextLine();
                }
                default -> System.out.println("Неверная команда.");
            }
            System.out.println("Для продолжения нажмите Enter");
            scanner.nextLine();
            System.out.println("В шкафу " + BOOK_SHELF.getNumberBooks() + " книг и свободно "
                    + BOOK_SHELF.getFreeShelves() + " полок\n");
            printAll();
        }
    }

    private static int menu() {
        System.out.println("""
                                    
                Введите номер операции:
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                0. Выход
                """);
        return scanner.nextInt();
    }

    private static Book inputBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.println("Введите год издания: ");
        int year = scanner.nextInt();
        return new Book(author, title, year);
    }

    private static String inputTitle() {
        System.out.println("Введите название книги: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    private static void printAll() {
        Book[] all = BOOK_SHELF.getAll();
        if (all.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            int maxSize = Bookshelf.getMaxLenBook();
            StringBuilder builder = new StringBuilder(maxSize);
            for (Book book : all) {
                if (book != null) {
                    int to = maxSize - book.getInfoLength();
                    System.out.println(builder.append("|").append(book).append(" ".repeat(to)).append("|"));
                    builder.setLength(0);
                    System.out.println(builder.append("|").append("-".repeat(maxSize)).append("|"));
                    builder.setLength(0);
                }
            }
            if (BOOK_SHELF.getFreeShelves() > 0) {
                System.out.println("|" + " ".repeat(maxSize) + "|");
            }
        }
    }
}
