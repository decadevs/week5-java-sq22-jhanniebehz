package library.service;

import library.enums.Role;
import library.model.Book;
import library.model.Borrower;
import library.model.Library;
import library.service.impl.LibraryServiceImpl;
import library.service.impl.LibraryServiceImpl2;


public class Main {
    public static void main(String[] args) {

        //CREATING NEW INSTANCES OF BOOK
        Book book = new Book(01, "Half of A Yellow Sun", "Chinua Achebe", 3);
        Book book2 = new Book(01, "Switze Bansi is Dead", "Athol Fugard", 2);
        Library library = new Library(book);


        //This is with Priority
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        //This iswithout priority
        LibraryServiceImpl2 libraryServiceImpl2 = new LibraryServiceImpl2();


        //ADDING BORROWERS TO QUEUE WITH PRIORITY
        libraryService.addBorrowerToQueue(new Borrower("Janefrances", Role.JUNIOR_STUDENT));
        libraryService.addBorrowerToQueue(new Borrower("Abike Smith", Role.TEACHER));
        libraryService.addBorrowerToQueue(new Borrower("Bisola Ayodele", Role.SENIOR_STUDENT));

        //ADDING BORROWERS WITH PRIORITY
        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("John Makins", Role.SENIOR_STUDENT));
        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("Olutosin Olaleye", Role.TEACHER));
        libraryServiceImpl2.addToQueueOnFirstCome(new Borrower("Segun Osiki", Role.JUNIOR_STUDENT));

        System.out.println("THIS IS WITH PRIORITY");
        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println(libraryService.borrowBooks(library, book));
        System.out.println("**********************************");


        System.out.println("THIS IS ON A FIRST COME FIRST SERVE BASIS");
        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
        System.out.println(libraryServiceImpl2.getBookOnFirstCome(book2));
        System.out.println("***********************************");


    }
}
