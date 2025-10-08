/*
Online Quiz System ❓
Concepts: Inheritance, Polymorphism, List
Description:
- Base class: Question
- Subclasses: ChoiceQuestion, TrueFalseQuestion
- Uses a List<Question> to store quiz items
- Method displayQuestion() overridden by subclasses
Features:
- Ask user questions
- Collect and check answers
- Display final score
- Created by Sajid Hussain
*/

import java.util.*;

public class OnlineQuizSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // 🧩 Multiple Choice Question 1
        ChoiceQuestion q1 = new ChoiceQuestion("Which language is used for Android development?");
        q1.addChoice("Python", false);
        q1.addChoice("Kotlin", true);
        q1.addChoice("Swift", false);
        q1.addChoice("C#", false);

        // ✅ True/False Question 2
        TrueFalseQuestion q2 = new TrueFalseQuestion("The Earth is flat.", false);

        // ✅ True/False Question 3
        TrueFalseQuestion q3 = new TrueFalseQuestion("Java supports polymorphism.", true);

        // 🧩 Multiple Choice Question 4
        ChoiceQuestion q4 = new ChoiceQuestion("Which of the following is not an OOP concept?");
        q4.addChoice("Encapsulation", false);
        q4.addChoice("Polymorphism", false);
        q4.addChoice("Recursion", true);
        q4.addChoice("Inheritance", false);

        // 🧩 Multiple Choice Question 5
        ChoiceQuestion q5 = new ChoiceQuestion("What is the default value of a boolean variable in Java?");
        q5.addChoice("true", false);
        q5.addChoice("false", true);
        q5.addChoice("0", false);
        q5.addChoice("null", false);

        // ✅ True/False Question 6
        TrueFalseQuestion q6 = new TrueFalseQuestion("A constructor in Java can be overloaded.", true);

        // 🧩 Multiple Choice Question 7
        ChoiceQuestion q7 = new ChoiceQuestion("Which of the following collection classes is synchronized?");
        q7.addChoice("ArrayList", false);
        q7.addChoice("Vector", true);
        q7.addChoice("HashMap", false);
        q7.addChoice("TreeSet", false);

        // ✅ True/False Question 8
        TrueFalseQuestion q8 = new TrueFalseQuestion("Interfaces in Java can contain constructors.", false);

        // Add all questions to quiz list
        quiz.add(q1);
        quiz.add(q2);
        quiz.add(q3);
        quiz.add(q4);
        quiz.add(q5);
        quiz.add(q6);
        quiz.add(q7);
        quiz.add(q8);

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

        // 🎯 Final Results
        System.out.println("🎯 Final Score: " + score + "/" + quiz.size());
        double percentage = ((double) score / quiz.size()) * 100;
        System.out.printf("📊 Percentage: %.2f%%\n", percentage);

        if (percentage >= 80) {
            System.out.println("🏆 Grade: A (Excellent!)");
        } else if (percentage >= 60) {
            System.out.println("👍 Grade: B (Good Job!)");
        } else if (percentage >= 40) {
            System.out.println("👌 Grade: C (Needs Improvement)");
        } else {
            System.out.println("😢 Grade: F (Try Again)");
        }

        System.out.println("\n👋 Good Bye from Online Quiz System");
        System.out.println("  💻 Made by Sajid Hussain ");
        sc.close();
    }
}
