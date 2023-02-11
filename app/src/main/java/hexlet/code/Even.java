package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner console = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 100);
            String correctAnswer = "";
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
                System.out.println("Let's try again," + App.playerName);
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + App.playerName + "!");
    }
}
