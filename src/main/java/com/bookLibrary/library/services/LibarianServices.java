package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.*;

public interface LibarianServices {

    String givesBook(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book);
    String giveBookBaseOnFifo(Library library, Libarian libarian, Teacher teacher, SeniorStudent seniorStudent, JuniorStudent juniorStudent, Book book);


}
