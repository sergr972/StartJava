package com.startjava.graduation.bookshelf;

public class MainTest {

    static int maxSize;
    static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves() + "\n");
        Book b1 = new Book("Author3", "Name3", 1903);
        Book b2 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book b3 = new Book("Author4", "Name4", 1904);
        Book b4 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);


        System.out.println("\nДобавить 3 книги\n");
        BOOK_SHELF.addBook(b1);
        maxSize();
        BOOK_SHELF.addBook(b2);
        maxSize();
        BOOK_SHELF.addBook(b3);
        maxSize();

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves() + "\n");
        printAll();

        System.out.println("\nДобавить книгу 4\n");
        BOOK_SHELF.addBook(b4);
        maxSize();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves() + "\n");
        printAll();

//        System.out.println("\nНайти книгу Жажда жизни\n");
//        System.out.println("|" + BOOK_SHELF.findBook("жажда жизн") + "|");


        System.out.println("\nпосле удаления книги 4\n");
        BOOK_SHELF.deleteBook("451 градус по Фаренгейту");
        maxSize();
        printAll();

        System.out.println("\nпосле очистки\n");
        BOOK_SHELF.clearShelf();
        maxSize();
        printAll();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves() + "\n");
    }

    static void printAll() {
        System.out.println("Содержимое шкафа\n");
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                StringBuilder builder = new StringBuilder(maxSize);
                int to = maxSize - book.bookInfoLength();
                builder.append(book);
                System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
                System.out.println("|" + "-".repeat(maxSize) + "|");
            }
        }
        if (BOOK_SHELF.freeShelves() > 0) {
            System.out.println("|" + " ".repeat(maxSize) + "|");
        }
    }

    static void maxSize() {
        maxSize = 0;
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                if (book.bookInfoLength() > maxSize) {
                    maxSize = book.bookInfoLength();
                }
            }
        }
    }
}
