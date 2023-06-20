package com.bookLibrary.library.entity;

public class Teacher extends Base{
    public Teacher(String name, Integer age, Level level, String bookRequestTitle, Integer bookRequestQuantity) {
        super(name, age, level, bookRequestTitle, bookRequestQuantity);
    }
}
