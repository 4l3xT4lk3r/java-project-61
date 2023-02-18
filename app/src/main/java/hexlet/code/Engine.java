package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Playable;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static final int MAX_ROUNDS = 3;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;

    public static void runGame(int pick) {
        Playable gm;
        Scanner console = new Scanner(System.in);
        switch (pick) {
            case 0:
                return;
            case 1:
                Cli.greeting();
                return;
            case EVEN_GAME:
                gm = new Even();
                break;
            case CALC_GAME:
                gm = new Calc();
                break;
            case GCD_GAME:
                gm = new GCD();
                break;
            case PROGRESSION_GAME:
                gm = new Progression();
                break;
            case PRIME_GAME:
                gm = new Prime();
                break;
            default:
                System.out.println("\nWrong pick!");
                return;
        }
        Cli.greeting();
        System.out.println(gm.getGameDescription());
        for (int i = 0; i < MAX_ROUNDS; i++) {
            gm.playGame();
            System.out.println("Question: " + gm.getQuestion());
            System.out.print("Your answer: ");
            String answer = console.next();
            if (!answer.equals(gm.getAnswer())) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gm.getAnswer() + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
