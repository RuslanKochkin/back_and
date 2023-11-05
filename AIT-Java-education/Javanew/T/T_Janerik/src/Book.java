public class Book {
    protected String book;

    public Book(String book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book='" + book + '\'' +
                '}';
    }
}
