package com.startjava.graduation.bookshelf;

public class MainTest {

    static int maxSize;

    private static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
        Book b1 = new Book("Author3", "Name3", 1903);
        Book b2 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book b3 = new Book("Author4", "Name4", 1904);
        Book b4 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);


        System.out.println("\nДобавить 3 книги\n");
        BOOK_SHELF.add(b1);
        BOOK_SHELF.add(b2);
        BOOK_SHELF.add(b3);


        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
        printAll();

        System.out.println("\nДобавить книгу 4\n");
        BOOK_SHELF.add(b4);
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
        printAll();

        System.out.println("\nНайти книгу Жажда жизни");
        System.out.println("|" + BOOK_SHELF.find("жажда жизни") + "|");

        System.out.println("\nУдалить книгу 2");
        BOOK_SHELF.delete("Жажда жизни");
        printAll();

        System.out.println("\nУдалить книгу 4");
        BOOK_SHELF.delete("451 градус по Фаренгейту");
        printAll();

        System.out.println("\nпосле очистки");
        BOOK_SHELF.clear();
        maxSize();
        printAll();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
    }

    private static void printAll() {
        System.out.println("\nСодержимое шкафа");
        maxSize();
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                StringBuilder builder = new StringBuilder(maxSize);
                int to = maxSize - book.getInfoLength();
                builder.append(book);
                System.out.println("|" + builder.append(" ".repeat(to)).append("|"));
                System.out.println("|" + "-".repeat(maxSize) + "|");
            }
        }
        if (BOOK_SHELF.getFreeShelves() > 0) {
            System.out.println("|" + " ".repeat(maxSize) + "|");
        }
    }

    private static void maxSize() {
        maxSize = 0;
        Book[] all = BOOK_SHELF.getAll();
        for (Book book : all) {
            if (book != null) {
                if (book.getInfoLength() > maxSize) {
                    maxSize = book.getInfoLength();
                }
            }
        }
    }
}
