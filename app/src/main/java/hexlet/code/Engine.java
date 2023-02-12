package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(int pick) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        Cli.greeting(console);
        switch (pick) {
            case 1:
                return;
            case 2:
                System.out.println(Even.gameDescription);
                break;
            case 3:
                System.out.println(Calc.gameDescription);
                break;
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
            }
            if (!result) {
                System.out.println("Let's try again, " + Cli.playerName);
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.playerName + "!");
    }
}
