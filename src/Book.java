import java.util.Objects;

public class Book {
    private String title;
    private String year;
    private Author author;
    public Book(String title, String year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getYear() {
        return year;
    }
    public Author getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return author + ", " + title + ", дата выхода: " + year;
    }
    /*
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (title != book.title) return false;
        if (year != book.year) return false;
        return author.equals(book.author);
    }
    @Override
    public int hashCode() {
        int result = 31 * title.hashCode();
        result += 31 * year.hashCode();
        result += 31 * author.hashCode();
        return result;
    }
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && year.equals(book.year) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, author);
    }
}
