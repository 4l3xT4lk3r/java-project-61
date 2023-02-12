package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static final String gameDescription = "What is the result of the expression?";
    public static boolean game(Scanner console) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        char[] signs = {42, 43, 45};
        char sign = signs[new Random().nextInt(signs.length)];
        int correctAnswer;
        if (sign == 42) {
            correctAnswer = a * b;
        } else if (sign == 43) {
            correctAnswer = a + b;
        } else {
            correctAnswer = a - b;
        }
        System.out.println("Question: " + a + " " + sign + " " + b);
        System.out.print("Your answer: ");
        String answer = console.next();
        try {
            if (Integer.parseInt(answer) != correctAnswer) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                return false;
            } else {
                System.out.println("Correct!");
            }
        } catch (NumberFormatException exception) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
        return true;
    }
}
