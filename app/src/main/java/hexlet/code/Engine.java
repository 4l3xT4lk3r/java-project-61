package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void processGameData(String gameDescription, String[][] gameData) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String playerName = console.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameDescription);
        for (int i = 0; i < gameData.length; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = console.next();
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
