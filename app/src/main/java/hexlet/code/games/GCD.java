package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    public static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static boolean game(Scanner console) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int gdc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gdc = i;
            }
        }
        System.out.println("Question: " + a + " " + b);
        System.out.print("Your answer: ");
        String answer = console.next();
        try {
            if (Integer.parseInt(answer) != gdc) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gdc + "'.");
                return false;
            } else {
                System.out.println("Correct!");
            }
        } catch (NumberFormatException exception) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gdc + "'.");
            return false;
        }
        return true;
    }
}
