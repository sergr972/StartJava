package com.startjava.graduation.bookshelf;

public class MainTest {
    static final Bookshelf BOOK_SHELF = new Bookshelf();
    static int maxSize;
    public static void main(String[] args) {
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves());
        Book b1 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book b2 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book b3 = new Book("Author3", "Name3", 1903);
        Book b4 = new Book("Author4", "Name4", 1904);


        System.out.println("Добавить 3 книги");
        BOOK_SHELF.addBook(b1);
        getMaxSize();
//        BOOK_SHELF.addBook(b2);
        BOOK_SHELF.addBook(b3);
        getMaxSize();
        BOOK_SHELF.addBook(b4);
        getMaxSize();

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves());
        printAll();

        System.out.println("\nДобавить книгу 4");
        BOOK_SHELF.addBook(b2);
        getMaxSize();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.numberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.freeShelves());
        printAll();

        System.out.println("\nНайти книгу Жажда жизни");
        System.out.println("|" + BOOK_SHELF.findBook("жажда жизни") + "|");

        System.out.println("\nпосле удаления книги 4");
        BOOK_SHELF.deleteBook("451 градус по Фаренгейту");
        getMaxSize();
        printAll();

//        System.out.println("после очистки");
//        BOOK_SHELF.clearShelf();
//        printAll();
//        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
//        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
    }

    static void printAll() {
        System.out.println("\nСодержимое шкафа");
        Book[] all = BOOK_SHELF.getAll();
//        int maxSize = BOOK_SHELF.maxSize();
        for (Book book : all) {
            StringBuilder builder = new StringBuilder(maxSize);
            int to = maxSize - book.lenBook();
            builder.append(book);
            System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
            System.out.println("|" + "-".repeat(maxSize) + "|");
        }
        if (BOOK_SHELF.freeShelves() > 0) {
            System.out.println("|" + " ".repeat(maxSize) + "|");
        }
    }

    private static void getMaxSize() {
        maxSize = 0;
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book.lenBook() > maxSize) {
                maxSize = book.lenBook();
            }
        }
    }
}
