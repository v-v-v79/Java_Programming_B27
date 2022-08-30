package day39_inheritance.book;

public class Book {

    public String name;
    protected String author;
    int pages;
    public int year;
    public static String publisher;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
