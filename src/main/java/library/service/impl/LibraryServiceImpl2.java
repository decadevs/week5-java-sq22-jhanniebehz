package library.service.impl;

import library.model.Book;
import library.model.Borrower;
import library.service.LibraryService2;

import java.util.LinkedList;
import java.util.Queue;


public class LibraryServiceImpl2 implements LibraryService2 {
    Queue<Borrower> borrowerQueue;

    public LibraryServiceImpl2() {
        borrowerQueue = new LinkedList<>();

    }

    @Override
    public void addToQueueOnFirstCome(Borrower borrower) {
        borrowerQueue.add(borrower);

    }

    @Override
    public String getBookOnFirstCome(Book bookTitle) {
        if (borrowerQueue.isEmpty()) {
            return "No one is on Queue";
        } else if (bookTitle.getBookQuantity() == 0) {
            return "Book taken";
        }

        Borrower borrower = borrowerQueue.poll();
        bookTitle.setBookQuantity(bookTitle.getBookQuantity() -1);

        assert borrower != null;
        return borrower.getFullName() + " has borrowed " + bookTitle.getTitle();
    }
}
