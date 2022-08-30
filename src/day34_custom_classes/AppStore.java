package day34_custom_classes;

import day34_custom_classes.app.App;

public class AppStore {
    public static void main(String[] args) {

        App app = new App();
        app.name = "Instagram";
        app.version = 1.2;
        app.isFree = true;
        app.rating = 4;

        app.update();
        System.out.println(app.version);
        System.out.println(app);
    }
}
