public class Main {
    public static void main(String[] args) {
        Author author = new Author("Марио", "Пьюзо");
        Book book = new Book("Крестный отец", 1972, author);
        Author author1 = new Author("Бернхард", "Шлинк");
        Book book1 = new Book("Чтец", 1995, author);
        System.out.println("book = " + book.getPubliсationYear());
        book.setPubliсationYear(1992);
        System.out.println("book = " + book.getPubliсationYear());
        System.out.println(book);
    }
}