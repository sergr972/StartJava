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


        System.out.println("Добавить 3 книги");
        BOOK_SHELF.addBook(b1);
//        BOOK_SHELF.addBook(b2);
        BOOK_SHELF.addBook(b3);
        BOOK_SHELF.addBook(b4);

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
        printAll();

        System.out.println("\nДобавить книгу 4");
        BOOK_SHELF.addBook(b2);
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
        printAll();

        System.out.println("\nНайти книгу Жажда жизни");
        System.out.println("|" + BOOK_SHELF.findBook("жажда жизни") + "|");

        System.out.println("\nпосле удаления книги 4");
        BOOK_SHELF.deleteBook("451 градус по Фаренгейту");
        printAll();

//        System.out.println("после очистки");
//        BOOK_SHELF.clearShelf();
//        printAll();
//        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
//        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves());
    }

    static void printAll() {
        System.out.println("\nGet All");
        Book[] all = BOOK_SHELF.getAll();
        int maxSize = getMaxSize(all);
        for (Book book : all) {
            StringBuilder builder = new StringBuilder(maxSize);
            int to = maxSize - book.lenBook();
            builder.append(book);
            System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
            System.out.println("|" + "-".repeat(maxSize) + "|");
        }
        if (BOOK_SHELF.getFreeShelves() > 0) {
            System.out.println("|" + " ".repeat(maxSize) + "|");
        }
    }

    private static int getMaxSize(Book[] all) {
        int maxSize = all[0].lenBook();
        for (int i = 1; i < all.length; i++) {
            if (all[i].lenBook() > maxSize) {
                maxSize = all[i].lenBook();
            }
        }
        return maxSize;
    }
}
