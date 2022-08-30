package replit.custom_classes;

import java.util.ArrayList;

/**
 * Create the `Canvas.java` file according to the following requirements.
 *
 *   - declare these `instance variables`:
 *     - topic (String)
 *     - quizzes (ArrayList of Quiz objects)
 *     - modules (ArrayList of Module objects)
 *
 *   - create these `constructors` to initialize the variables:
 *     - 1 argument (`String`): initialize the name and create an empty ArrayList of quizzes and modules
 *     - 3 arguments(`String, ArrayList<Quiz>, and ArrayList<Module>`):  initialize the name and use the given ArrayLists to set up the starting values of all quizzers and modules
 *
 *   - create a `toString()` to print the Canvas objects in this format:
 *     > $topic name
 *     >
 *     > Quizzes:
 *     >
 *     > [ArrayList of Quiz]
 *     >
 *     > Modules:
 *     >
 *     > [ArrayList of Module]
 */

public class Canvas {

    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        modules = new ArrayList<>();
        quizzes = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return topic + "\n" + "\n" + "Quizzes:\n\n" + quizzes + "\n\n" + "Modules:\n\n" + modules;
    }
}
