package com.startjava.graduation.bookshelf;

public class MainTest {
    static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
        Book b1 = new Book("Author1", "Name1", 1901);
        Book b2 = new Book("Author2", "Name2", 1902);
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

        System.out.println(BOOK_SHELF.findBook("Name3"));

        BOOK_SHELF.deleteBook("Name2");
        System.out.println("после удаления книги 2");
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
            System.out.println("|----------------------------------|");
        }
    }
}
