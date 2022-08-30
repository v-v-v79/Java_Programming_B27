package day39_inheritance.book;

public class BookStore {
    public static void main(String[] args) {

        AudioBook book = new AudioBook("Gray", "V.V", 7);
        System.out.println(book);

        book.setName("Red");

        System.out.println(book);
        System.out.println(book.getDuration());
    }
}
