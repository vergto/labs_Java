package com.company.laboratorka3.var_4.part_1;

import java.util.Date;

public class Reader {
    String name;
    Boolean blackList;
    Boolean createApp;
    Book[] book = new Book[8];
    int nBook;
    Reader(String name) {
        this.name = name;
        this.blackList = false;
        this.createApp = false;
        this.nBook = 0;
    }
    public void createApp() {
        createApp = true;
    }
    public void getInfo() {
        if (nBook != 0) {
            for (int i = 0; i < nBook; i++) {
                System.out.println(name + " " + book[i].title);
            }
        }
        else {
            System.out.println(name + " не брал книгу");
        }
    }
    public void returnBook(Book book) {
        nBook--;
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == book) {
                this.book[i].reader = null;
                this.book[i] = null;
            }
        }
    }
    public String toString() {
        return name + " " + blackList + " " + createApp + " " + nBook;
    }
}
