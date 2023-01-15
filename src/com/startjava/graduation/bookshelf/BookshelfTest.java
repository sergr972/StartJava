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
                                        
                    Введите номер операции:
                    1. Добавить книгу
                    2. Найти книгу
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Выход
                    """);

            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Введите книгу в формате author, title, publishYear: ");
                    scanner.nextLine();
                    String text = scanner.nextLine();
                    String[] strings = text.split(", ", 3);
                    book = new Book(strings[0], strings[1], Integer.parseInt(strings[2]));
                    BOOK_SHELF.addBook(book);
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 2 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                    System.out.println(BOOK_SHELF.findBook(bookName));
                }
                case 3 -> {
                    System.out.println("Введите название книги: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    BOOK_SHELF.deleteBook(bookName);
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 4 -> {
                    BOOK_SHELF.clearShelf();
                    System.out.println("Для продолжения нажмите Enter");
                    scanner.nextLine();
                }
                case 5 -> {
                    System.out.println("Программа завершена.");
                    return;
                }
                default -> System.out.println("Неверная команда.");
            }
            System.out.println("\nВ шкафу " + BOOK_SHELF.getNumberBooks() + " книг и свободно "
                    + BOOK_SHELF.getFreeShelves() + " полок\n");
            printAll();
        }
    }

    static void printAll() {
        Book[] all = BOOK_SHELF.getAll();
        if (all.length == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            for (Book book : all) {
                System.out.println(book);
                System.out.println("|--------------------------------------------|");
            }
            if (BOOK_SHELF.getFreeShelves() > 0) {
                System.out.println("|                                            |");
            }
        }
    }
}
