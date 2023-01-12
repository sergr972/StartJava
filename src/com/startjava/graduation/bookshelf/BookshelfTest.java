package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private final static Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book;
        String bookName;

        printAll();
        while (true) {
            System.out.println("""
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    """);
            System.out.print("Введите номер операции: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.print("Введите книгу в формате author, title, publishYear: ");
                    String[] strings = scanner.nextLine().split(", ", 3);
                    book = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
                    BOOK_SHELF.addBook(book);
                    printAll();
                }
                case 2 -> {
                    System.out.print("Введите название книги: ");
                    bookName = scanner.next();
                    BOOK_SHELF.findBook(bookName);
                }
                case 3 -> {
                    System.out.print("Введите название книги: ");
                    bookName = scanner.next();
                    BOOK_SHELF.deleteBook(bookName);
                    printAll();
                }
                case 4 -> BOOK_SHELF.clearShelf();
                default -> System.out.println("Неверная команда.");
            }
            System.out.println("В шкафу " + BOOK_SHELF.getNumberBooks() + " книг и свободно "
                    + BOOK_SHELF.getFreeShelves() + " полок");
            printAll();
        }
    }

    static void printAll() {
        Book[] all = Bookshelf.getAll();
        System.out.println("----------------------------");
        if (all.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            for (Book book : all) {
                System.out.println();
            }
        }
        System.out.println("----------------------------");
    }
}
