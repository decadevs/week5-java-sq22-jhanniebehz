package library.service;

import library.model.Book;
import library.model.Borrower;
import library.model.Library;

public interface LibraryService1 {

    void addBorrowerToQueue(Borrower borrower);

    String borrowBooks(Library library, Book book);

}
