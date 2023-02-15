package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int pick;
        try {
            pick = console.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("\nWrong pick!");
            return;
        }
        if (pick >= 1 && pick <= 6) {
            Engine.runGame(pick);
        } else if (pick != 0) {
            System.out.println("\nWrong pick!");
        }
        console.close();
    }
}
