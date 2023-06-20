package com.bookLibrary.library.servicesImplementation;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.People;
import com.bookLibrary.library.services.PeopleServices;

public class PeopleServicesImp implements PeopleServices{

    @Override
    public String addPeopleToQueue(Library library, People people) {
        library.getPeopleInQueue().add(String.valueOf(people));
        return null;

    }
}
