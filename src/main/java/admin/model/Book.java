package admin.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int  edition;
    private int year;
    private double price;

    public Book(String title, String author, String isbn, int edition, int year, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.edition = edition;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEdition() {
        return edition;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
