package com.bookLibrary.library;

import com.bookLibrary.library.entity.*;
import com.bookLibrary.library.services.LibarianServices;
import com.bookLibrary.library.servicesImplementation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {


		Library library = new Library();
		System.out.println("Current list of books:" + library.getBooks());

		System.out.println("==================================================");

		System.out.println("==========================================");
		Book book = new Book("Pelzman", "introduction to react", "221", 7);
		Book book1 = new Book("Eben I", "concept of java", "288", 4);
		Book book2 = new Book("Bello W", "concept of oop", "284", 6);
		Book book3 = new Book("Irene E", "java masters", "285", 1);
		Book book4 = new Book("Wajiu B", "java intermediate", "287", 1);


		Teacher teacher = new Teacher("Teacher weng", 33, Level.HIGH, "introduction to react", 1);
		SeniorStudent seniorStudent = new SeniorStudent("Senior kenny", 30, Level.MEDIUM, "introduction to react", 1);
		JuniorStudent juniorStudent = new JuniorStudent("Junior  Ubong", 32, Level.LOW, "introduction to react", 1);

		Libarian libarian = new Libarian("Ernest");

		LibraryServicesImp libraryServicesImp = new LibraryServicesImp();

		libraryServicesImp.addBook(book1, library);
		libraryServicesImp.addBook(book2, library);
		libraryServicesImp.addBook(book3, library);
		libraryServicesImp.addBook(book4, library);

		System.out.println(library.getBooks());
		System.out.println("==================================================");


		TeacherServicesImp teacherServicesImp = new TeacherServicesImp();
		SeniorStudentServicesImp seniorStudentServicesImp = new SeniorStudentServicesImp();
		JuniorStudentServicesImp juniorStudentServicesImp = new JuniorStudentServicesImp();


		seniorStudentServicesImp.joinQueue(library,seniorStudent);
		teacherServicesImp.joinQueue(library, teacher);
		juniorStudentServicesImp.joinQueue(library, juniorStudent);

		System.out.println(library.getPeopleInQueue());
		System.out.println("==================================================");


		LibarianServicesImp libarianServicesImp = new LibarianServicesImp();

		String givingBook = libarianServicesImp.givesBook(library, libarian, teacher, seniorStudent, juniorStudent, book);
		System.out.println(givingBook);

		System.out.println("==================================================");

		//String givingBookBasedOnFifo = libarianServicesImp.giveBookBaseOnFifo(library, libarian, teacher,
		//		seniorStudent, juniorStudent, book);
		//System.out.println(givingBookBasedOnFifo);

		System.out.println("===========================");


	}

}
