import java.util.Objects;

public class Book {
    private String nameBook;
    private int publiсationYear;
    private Author author;

    public String getNameBook() {
        return nameBook;
    }

    public int getPubliсationYear() {
        return publiсationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public Book(String nameBook, int publiсationYear, Author author) {
        this.nameBook = nameBook;
        this.publiсationYear = publiсationYear;
        this.author = author;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publiсationYear == book.publiсationYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(nameBook, publiсationYear, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", publiсationYear=" + publiсationYear +
                ", author=" + author +
                '}';
    }

    public void setPubliсationYear(int publiсationYear) {
        this.publiсationYear = publiсationYear;
    }
}
