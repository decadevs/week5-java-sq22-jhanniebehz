package library.service.impl;

import library.enums.Role;
import library.model.Book;
import library.model.Borrower;
import library.service.LibraryService2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImpl2Test {
    private LibraryService2 libraryService2;

    @BeforeEach
    public void setUp() {
        libraryService2 = new LibraryServiceImpl2();
    }

    @Test
    public void testFirstComeFirstServeBorrowing() {
        Book book = new Book(2, "Switze Bansi is Dead", "ROllins Achebe", 1);

        // Add borrowers to the queue
        libraryService2.addToQueueOnFirstCome(new Borrower("John Makins", Role.SENIOR_STUDENT));
        libraryService2.addToQueueOnFirstCome(new Borrower("Olutosin Olaleye", Role.TEACHER));

        // First borrow should be the first added
        String result1 = libraryService2.getBookOnFirstCome(book);
        assertEquals("John Makins has borrowed Switze Bansi is Dead", result1);
        assertEquals(0, book.getBookQuantity());

        // Second borrow should show book is taken
        String result2 = libraryService2.getBookOnFirstCome(book);
        assertEquals("Book taken", result2);
    }

    @Test
    public void testNoBorrowersInQueue() {
        Book book = new Book(3, "Test Book", "Test Author", 1);

        // No borrowers in the queue
        String result1 = libraryService2.getBookOnFirstCome(book);
        assertEquals("No one is on Queue", result1);
    }

}

