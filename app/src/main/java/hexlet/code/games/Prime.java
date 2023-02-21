package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame(int rounds) {
        String[] data = new String[rounds];
        for (int i = 0; i < rounds; i++) {
            int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
            String question = "" + number;
            String answer = isPrime(number);
            data[i] = question + ":" + answer;
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static String isPrime(int number) {
        int count = 0;
        String answer;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count <= 2) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
