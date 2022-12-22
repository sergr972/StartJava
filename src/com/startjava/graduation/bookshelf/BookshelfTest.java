package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("""
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                """);

        Bookshelf bs = new Bookshelf();
        System.out.print("Введите номер операции: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> bs.addBook();
            case 2 -> bs.find();
            case 3 -> bs.delete();
            case 4 -> bs.clearShelf();
        }

    }
}
