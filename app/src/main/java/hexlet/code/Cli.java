package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String playerName;
    public static void greeting(Scanner console) {
        System.out.print("May I have your name? ");
        playerName = console.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }
}
