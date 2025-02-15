package be.kuleuven.sessylibrary.domain;

public class Book {
    private int isbn;
    private String title;
    private String author;
    private String thumbnail;
    private String description;
    private boolean borrowed;

    public Book() {
    }

    public Book(int isbn, String title, String author, String thumbnail, String beschrijving) {
        this(isbn, title, author, thumbnail, beschrijving, false);
    }

    public Book(int isbn, String title, String author, String thumbnail, String beschrijving, boolean borrowed) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.thumbnail = thumbnail;
        this.description = beschrijving.replace("\n", "");
        this.borrowed = borrowed;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void borrow() {
        this.borrowed = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void bringBack() {
        this.borrowed = false;
    }
}
