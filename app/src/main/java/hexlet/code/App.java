package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static String playerName;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int pick;
        try {
            pick = console.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong pick!");
            return;
        }
        if (pick >= 1 && pick <= 6) {
            System.out.println("\nWelcome to the Brain Games!");
            Cli.greeting();
        }
        switch (pick) {
            case (0), (1) -> {
                return;
            }
            case (2) -> {
                Even.game();
            }
            default -> System.out.println("Wrong pick!");
        }
        console.close();
    }
}
