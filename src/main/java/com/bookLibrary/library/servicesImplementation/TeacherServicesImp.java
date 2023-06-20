package com.bookLibrary.library.servicesImplementation;

import com.bookLibrary.library.entity.Library;
import com.bookLibrary.library.entity.Teacher;
import com.bookLibrary.library.services.TeacherServices;

public class TeacherServicesImp implements TeacherServices {
    @Override
    public String joinQueue(Library library, Teacher teacher) {
        library.getPeopleInQueue().add(String.valueOf(teacher));
        return null;
    }
}
