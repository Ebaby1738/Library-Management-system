package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.Book;
import com.bookLibrary.library.entity.Library;

public interface BookServices {
    String addBook(Book book, Library library);

}
