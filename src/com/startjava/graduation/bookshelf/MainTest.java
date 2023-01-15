package com.startjava.graduation.bookshelf;

public class MainTest {
    static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
        Book b1 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book b2 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book b3 = new Book("Author3", "Name3", 1903);
        Book b4 = new Book("Author4", "Name4", 1904);

        BOOK_SHELF.addBook(b1);
        BOOK_SHELF.addBook(b2);
        BOOK_SHELF.addBook(b3);
        BOOK_SHELF.addBook(b4);

        printAll();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());

//        BOOK_SHELF.addBook(b4);
//        printAll();
//        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
//        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());

        System.out.println("\nНайти книгу Жажда жизни");
        System.out.println(BOOK_SHELF.findBook("жажда жизни"));

        System.out.println("\nпосле удаления книги 3");
        BOOK_SHELF.deleteBook("Name3");
        printAll();
//
//        BOOK_SHELF.clearShelf();
//        System.out.println("после очистки");
//        printAll();
//        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
//        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
    }

    static void printAll() {
        Book[] all = BOOK_SHELF.getAll();
        System.out.println("\nGet All");
        for (Book book : all) {
            System.out.println(book);
            System.out.println("|--------------------------------------------|");
        }
    }
}
