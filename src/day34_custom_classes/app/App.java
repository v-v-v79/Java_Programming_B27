package day34_custom_classes.app;

public class App {

    public String name;
    public double version;
    public boolean isFree;
    public int rating;

    public void update(){
        System.out.println(name + " is updating");
        version += 0.1;
    }

    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                ", rating=" + rating +
                '}';
    }
}
