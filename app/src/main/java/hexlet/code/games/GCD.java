package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGame() {
        String[] data = new String[App.MAX_ROUNDS];
        for (int i = 0; i < App.MAX_ROUNDS; i++) {
            data[i] = makeQuestion();
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static String makeQuestion() {
        int a = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        int b = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        String question = a + " " + b;
        int answer = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        return question + ":" + answer;
    }
}
