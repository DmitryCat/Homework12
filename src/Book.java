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

    public void setPubliсationYear(int publiсationYear) {
        this.publiсationYear = publiсationYear;
    }
}
