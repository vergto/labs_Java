package com.company.laboratorka3.var4.part1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library(10, 5);
        library.readers[0].createApp();
        library.readers[1].createApp();
        Librarian librarian = new Librarian();
        librarian.issueBook(library.readers[0], library.books[0]);
        librarian.issueBook(library.readers[1], library.books[1]);
        library.readers[1].returnBook(library.books[1]);
        Thread.sleep(12);
        for (int i = 0; i < library.readers.length; i++) {
            library.admin.checkReaders(library.readers[i]);
        }
        for (int i = 0; i < library.readers.length; i++) {
            if (library.readers[i].blackList == true) {
                System.out.println(library.readers[i].name + " - этот читатель не вернул книгу в срок.");
            }
        }
    }


}
