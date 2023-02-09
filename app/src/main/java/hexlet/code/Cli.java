package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting(){
        Scanner console  = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = console.nextLine();
        System.out.println("Hello, "+ name + "!");
        console.close();
    }
}
