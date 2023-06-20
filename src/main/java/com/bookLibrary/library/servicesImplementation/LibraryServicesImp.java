package com.bookLibrary.library.servicesImplementation;

import com.bookLibrary.library.entity.*;
import com.bookLibrary.library.services.LibraryServices;

import java.util.List;

public class LibraryServicesImp implements LibraryServices {


    @Override
    public void addBook(Book book, Library library) {

        library.getBooks().add(book);

    }

    @Override
    public String bookStatus(Book book, Library library) {
        if (library.getBooks() ==null){
            return "empty book list";
        }else{
            return "available books: "+ library.getBooks();
        }
    }


}
