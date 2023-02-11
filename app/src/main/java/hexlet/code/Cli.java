package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting() {
        Scanner console = new Scanner(System.in);
        System.out.print("May I have your name? ");
        App.playerName = console.nextLine();
        System.out.println("Hello, " + App.playerName + "!");
    }
}
