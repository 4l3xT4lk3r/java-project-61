package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final int MAX_ROUNDS = 3;

    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int pick;
        try {
            pick = console.nextInt();
            switch (pick) {
                case 0:
                    break;
                case 1:
                    Cli.greeting();
                    break;
                case EVEN_GAME:
                    Even.playGame(MAX_ROUNDS);
                    break;
                case CALC_GAME:
                    Calc.playGame(MAX_ROUNDS);
                    break;
                case GCD_GAME:
                    GCD.playGame(MAX_ROUNDS);
                    break;
                case PROGRESSION_GAME:
                    Progression.playGame(MAX_ROUNDS);
                    break;
                case PRIME_GAME:
                    Prime.playGame(MAX_ROUNDS);
                    break;
                default:
                    System.out.println("\nWrong pick!");
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("\nWrong pick!");
        }
        console.close();
    }
}
