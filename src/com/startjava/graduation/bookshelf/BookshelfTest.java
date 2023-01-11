package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bs = new Bookshelf();
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
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
                case 1 -> bs.addBook();
                case 2 -> bs.find();
                case 3 -> bs.delete();
                case 4 -> bs.clearShelf();
            }
            System.out.println("В шкафу " + bs.getNumberBooks() + " книг и свободно "
                    + bs.getFreeShelves() + " полок");
            printAll();
        }
    }
    static void printAll() {
        Book[] all = Bookshelf.getAll();
        System.out.println("----------------------------");
        if (all.length == 0) {
            System.out.println("Empty");
        } else {
            for (Book book : all) {
                System.out.println(book);
            }
        }
        System.out.println("----------------------------");
    }
}
