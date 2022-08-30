package replit.custom_classes;

/**
 * - declare these `instance variables`:
 *     - topic (String)
 *     - total number of questions (int)
 *     - total points (double)
 *
 *   - create a `constructor` to initialize all the variables
 *
 *   - create a void instance method: `takeQuiz()`
 *     - the method will print:
 *       > Taking the $topic quiz
 *
 *   - create a `toString()` to print the Quiz objects in this format:
 *     > Quiz | $topic quiz with $questions questions for a total of $point total points
 */
public class Quiz {

    String topic;
    int questions;
    double point;

    public Quiz(String topic, int totalQuest, double totalPoints) {
        this.topic = topic;
        this.questions = totalQuest;
        this.point = totalPoints;
    }
    public void takeQuiz() {
        System.out.println("Taking the " + topic + " quiz");
    }

    @Override
    public String toString() {
        return "Quiz | " +
                topic + " quiz with " + questions +
                " questions for a total of " + point + " total points";
    }
}
