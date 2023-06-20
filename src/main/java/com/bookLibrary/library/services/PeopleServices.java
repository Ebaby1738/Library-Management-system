package com.bookLibrary.library.services;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.People;

public interface PeopleServices {
    String addPeopleToQueue(Library library, People people);
}
