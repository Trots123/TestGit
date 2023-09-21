package Dz33;
import java.util.Date;


public class Not {
    private String text;
    private String author;
    private Date createdAt;

    public Note(String text, String author) {
        this.text = text;
        this.author = author;
        this.createdAt = new Date();
    }

    // Геттери та сеттери
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
