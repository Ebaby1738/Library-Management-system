package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.Book;
import com.bookLibrary.library.entity.Library;

import java.util.List;

public interface LibraryServices {
    void addBook(Book book, Library library);
    String bookStatus(Book book, Library library);
}
