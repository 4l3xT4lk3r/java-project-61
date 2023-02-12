package hexlet.code;

import java.util.Scanner;

public class Even {
    public static final String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean game(Scanner console) {
        int number = (int) (Math.random() * 100);
        String correctAnswer;
        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = console.next();
        if (!answer.equals(correctAnswer)) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        } else {
            System.out.println("Correct!");
        }
        return true;
    }
}