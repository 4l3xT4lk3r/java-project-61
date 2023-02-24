package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void processGameData(String gameDescription, String[][] gameData) {
        String playerName = Cli.greeting();
        System.out.println(gameDescription);
        Scanner console = new Scanner(System.in);
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
