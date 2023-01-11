package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bs = new Bookshelf();
        System.out.println("В шкафу " +  bs.getNumberBooks() + " книг и свободно "
                + bs.getFreeShelves() + " полок");
        bs.getAll();
        System.out.println("""
                1. Добавить книгу <author>, <title>, <publishYear>
                2. Найти книгу <title>
                3. Удалить книгу <title>
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
        bs.getAll();
    }
}
