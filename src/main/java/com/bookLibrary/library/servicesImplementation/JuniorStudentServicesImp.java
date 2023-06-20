package com.bookLibrary.library.servicesImplementation;

import com.bookLibrary.library.entity.JuniorStudent;
import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.services.JuniorStudentServices;

public class JuniorStudentServicesImp implements JuniorStudentServices {
    @Override
    public String joinQueue(Library library, JuniorStudent juniorStudent) {
        library.getPeopleInQueue().add(String.valueOf(juniorStudent));
        return null;
    }
}
