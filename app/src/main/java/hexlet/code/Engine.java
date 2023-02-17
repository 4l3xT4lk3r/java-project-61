package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {

    public static void runGame(int pick) {
        Playable game = null;
        Scanner console = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        Cli.greeting(console);
        switch (pick) {
            case 2:
                game = new Even();
                break;
            case 3:
                game = new Calc();
                break;
            case 4:
                game = new GCD();
                break;
            case 5:
                game = new Progression();
                break;
            case 6:
                game = new Prime();
                break;
            default:
                return;
        }
        System.out.println(game.getGameDescription());
        for (int i = 0; i < 3; i++) {
            game.playGame();
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = console.next();
            if (!answer.equals(game.getAnswer())) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + game.getAnswer() + "'.");
                System.out.println("Let's try again, " + Cli.playerName + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + Cli.playerName + "!");
    }
}
