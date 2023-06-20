package com.bookLibrary.library.servicesImplementation;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.SeniorStudent;
import com.bookLibrary.library.services.SeniorStudentServices;

public class SeniorStudentServicesImp implements SeniorStudentServices {
    @Override
    public String joinQueue(Library library, SeniorStudent seniorStudent) {
        library.getPeopleInQueue().add(String.valueOf(seniorStudent));
        return null;
    }
}
