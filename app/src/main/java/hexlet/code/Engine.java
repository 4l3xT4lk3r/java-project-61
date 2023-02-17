package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static void runGame(int pick) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        Cli.greeting(console);
        switch (pick) {
            case 2:
                System.out.println(Even.GAME_DESCRIPTION);
                break;
            case 3:
                System.out.println(Calc.GAME_DESCRIPTION);
                break;
            case 4:
                System.out.println(GCD.GAME_DESCRIPTION);
                break;
            case 5:
                System.out.println(Progression.GAME_DESCRIPTION);
                break;
            default:
                return;
        }
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            switch (pick) {
                case 2:
                    result = Even.game(console);
                    break;
                case 3:
                    result = Calc.game(console);
                    break;
                case 4:
                    result = GCD.game(console);
                    break;
                case 5:
                    result = Progression.game(console);
                    break;
            }
            if (!result) {
                System.out.println("Let's try again, " + Cli.playerName);
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.playerName + "!");
    }
}
