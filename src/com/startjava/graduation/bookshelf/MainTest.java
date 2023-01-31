package com.startjava.graduation.bookshelf;

public class MainTest {

    private static final Bookshelf BOOK_SHELF = new Bookshelf();

    public static void main(String[] args) {

        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
        Book b1 = new Book("Author3", "Name3", 1903);
        Book b2 = new Book("Ирвинг Стоун", "Жажда жизни", 1973);
        Book b3 = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1980);
        Book b4 = new Book("Author4", "Name4", 1904);


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

        System.out.println("\nУдалить книгу 3");
        BOOK_SHELF.delete("451 градус по Фаренгейту");
        printAll();

        System.out.println("\nУдалить книгу 2");
        BOOK_SHELF.delete("Жажда жизни");
        printAll();

        System.out.println("\nпосле очистки");
        BOOK_SHELF.clear();
        printAll();
        System.out.println("количество книг в шкафу: " + BOOK_SHELF.getNumberBooks());
        System.out.println("количество свободных полок: " + BOOK_SHELF.getFreeShelves() + "\n");
    }

    private static void printAll() {
        System.out.println("\nСодержимое шкафа");
        int maxSize = Bookshelf.getMaxLenBook();
        Book[] all = BOOK_SHELF.getAll();
        StringBuilder builder = new StringBuilder(maxSize);
        for (Book book : all) {
            if (book != null) {
                int to = maxSize - book.getInfoLength();
                System.out.println(builder.append("|").append(book).append(" ".repeat(to)).append("|"));
                builder.setLength(0);
                System.out.println(builder.append("|").append("-".repeat(maxSize)).append("|"));
                builder.setLength(0);
            }
        }
        if (BOOK_SHELF.getFreeShelves() > 0) {
            System.out.println("|" + " ".repeat(maxSize) + "|");
        }
    }
}
