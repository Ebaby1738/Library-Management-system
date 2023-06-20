package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.JuniorStudent;
import com.bookLibrary.library.entity.Library;

public interface JuniorStudentServices {
    String joinQueue(Library library, JuniorStudent juniorStudent);
}
