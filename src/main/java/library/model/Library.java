package library.model;

public class Library {

    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                '}';
    }
}
