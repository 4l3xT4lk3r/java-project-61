package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public static boolean game(Scanner console) {
        int[] progressionLength = {5, 6, 7, 8, 9, 10};
        int length = progressionLength[new Random().nextInt(progressionLength.length)];

        int startNumber = new Random().nextInt(100);
        int k = new Random().nextInt(10);
        int pos = new Random().nextInt(length);

        StringBuilder question = new StringBuilder();
        int correctAnswer = 0;

        for (int i = 0; i < length; i++) {
            if (i != pos) {
                question.append(startNumber).append(" ");
                startNumber += k;
            } else {
                question.append(".. ");
                correctAnswer = startNumber;
                startNumber += k;
            }
        }

        System.out.println("Question: " + question);
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
