package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGame(int rounds) {
        String[] data = new String[rounds];
        for (int i = 0; i < rounds; i++) {
            int a = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
            int b = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
            String question = a + " " + b;
            int answer = getGdc(a, b);
            data[i] = question + ":" + answer;
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static int getGdc(int a, int b) {
        int gdc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gdc = i;
            }
        }
        return gdc;
    }
}

