package library.model;

public class Book {

    private  int bookId;

    private String title;

    private String author;

    private int bookQuantity;




    public int getBookId() {
        return bookId;
    }

    public Book(int bookId, String title, String author, int bookQuantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.bookQuantity = bookQuantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}
