package day39_inheritance.book;

public class AudioBook extends Book {

    public int duration;

    public AudioBook(String name, String author, int duration) {
        super(name, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
