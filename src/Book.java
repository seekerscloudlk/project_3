import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Book")
@Entity
public class Book {
    @Id
    private int bookId;
    private String name;
    private String tittle;

    public Book() {
    }

    public Book(int bookId, String name, String tittle) {
        this.bookId = bookId;
        this.name = name;
        this.tittle = tittle;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}
