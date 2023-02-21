package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void processGameData(String gameDescription, String[] gameData) {
        Cli.greeting();
        System.out.println(gameDescription);
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < gameData.length; i++) {
            String question = gameData[i].split(":")[0];
            String correctAnswer = gameData[i].split(":")[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = console.next();
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
