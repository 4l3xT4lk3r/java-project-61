package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame() {
        String[] data = new String[App.MAX_ROUNDS];
        for (int i = 0; i < App.MAX_ROUNDS; i++) {
            data[i] = makeQuestion();
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static String makeQuestion() {
        int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        int count = 0;
        String question = "" + number;
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
        return question + ":" + answer;
    }
}
