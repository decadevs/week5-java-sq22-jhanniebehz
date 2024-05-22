package library.service;

import library.model.Book;
import library.model.Borrower;

public interface LibraryService2 {

     void addToQueueOnFirstCome(Borrower borrower);

     String getBookOnFirstCome(Book bookTitle);
}
