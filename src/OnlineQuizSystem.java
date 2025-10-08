/*
Online Quiz System ❓ Concepts: Inheritance, Polymorphism, List
Description: Base class: Question
Subclasses: ChoiceQuestion, TrueFalseQuestion
Use a List<Question> to store quiz items
Method displayQuestion() overridden by subclasses
Features: Ask user questions
Collect and check answers
Display final score
 */
import java.util.*;

public class OnlineQuizSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Create questions
        ChoiceQuestion q1 = new ChoiceQuestion("Which language is used for Android development?");
        q1.addChoice("Python", false);
        q1.addChoice("Kotlin", true);
        q1.addChoice("Swift", false);
        q1.addChoice("C#", false);

        TrueFalseQuestion q2 = new TrueFalseQuestion("The Earth is flat.", false);
        TrueFalseQuestion q3 = new TrueFalseQuestion("Java supports polymorphism.", true);

        quiz.add(q1);
        quiz.add(q2);
        quiz.add(q3);

        int score = 0;

        System.out.println("===== Online Quiz System =====\n");

        // Loop through each question
        for (Question q : quiz) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            String response = sc.nextLine();

            if (q.checkAnswer(response)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect.\n");
            }
        }

        System.out.println("🎯 Final Score: " + score + "/" + quiz.size());
        System.out.println(" Good Bye from, Online Quiz System \n  Made by Sajid Hussain 2");
        sc.close();
    }
}
