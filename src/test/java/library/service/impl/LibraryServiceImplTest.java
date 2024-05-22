package library.service.impl;

import library.enums.Role;
import library.model.Book;
import library.model.Borrower;
import library.model.Library;
import library.service.LibraryService1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    private LibraryService1 libraryService1;

    @BeforeEach
    public void setUp() {
        libraryService1 = new LibraryServiceImpl();
    }

    @Test
    public void testPriorityBorrowing() {
        Book book = new Book(1, "Half of A Yellow Sun", "Chinua Achebe", 2);
        Library library = new Library(book);

        // Add borrowers with different priorities
        libraryService1.addBorrowerToQueue(new Borrower("Janefrances", Role.JUNIOR_STUDENT));
        libraryService1.addBorrowerToQueue(new Borrower("Abike Smith", Role.TEACHER));
        libraryService1.addBorrowerToQueue(new Borrower("Bisola Ayodele", Role.SENIOR_STUDENT));

        // First borrow should be the teacher
        String result1 = libraryService1.borrowBooks(library, book);
        assertEquals("Abike Smith has borrowed Half of A Yellow Sun by Chinua Achebe", result1);
        assertEquals(1, book.getBookQuantity());

        // Second borrow should be the senior student
        String result2 = libraryService1.borrowBooks(library, book);
        assertEquals("Bisola Ayodele has borrowed Half of A Yellow Sun by Chinua Achebe", result2);
        assertEquals(0, book.getBookQuantity());

        // Third borrow should show book is taken
        String result3 = libraryService1.borrowBooks(library, book);
        assertEquals("Book Taken", result3);
    }

    @Test
    public void testNoBorrowersInQueue() {
        Book book = new Book(3, "Test Book", "Test Author", 1);
        Library library = new Library(book);

        // No borrowers in the queue
        String result1 = libraryService1.borrowBooks(library, book);
        assertEquals("No borrower is on the queue", result1);
    }
}


