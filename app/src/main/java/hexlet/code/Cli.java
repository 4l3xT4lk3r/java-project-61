package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String playerName;

    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        playerName = console.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String getPlayerName() {
        return playerName;
    }
}
