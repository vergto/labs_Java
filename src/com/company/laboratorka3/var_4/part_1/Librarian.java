package com.company.laboratorka3.var_4.part_1;

import java.util.Date;

public class Librarian {
    public void issueBook(Reader reader, Book book) {
        if (reader.blackList == false  && reader.createApp == true && book.reader == null) {
            reader.nBook++;
            reader.book[reader.nBook] = book;
            Date temp = new Date();
            book.date = temp.getTime();
            book.reader = reader;
        }
    }
}
