package hexlet.code;

import java.util.Scanner;

public class App {
    public static String playerName;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        switch (console.nextInt()) {
            case (1):
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                break;
            case (2):
                System.out.println("Welcome to the Brain Games!");
                Cli.greeting();
                Even.game();
                break;
            default:
                break;
        }
        console.close();
    }
}
