package day40_inheritance.app;

public class Phone {

    public static void main(String[] args) {

        YouTube youTube = new YouTube(4.8);
        System.out.println(youTube.name);
        System.out.println(youTube.version);
        youTube.download();
        youTube.watchVideo();
        Object object = new Object();
    }
}
