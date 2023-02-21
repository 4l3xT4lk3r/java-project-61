package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGame(int rounds) {
        String[] data = new String[rounds];
        for (int i = 0; i < rounds; i++) {
            int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
            String question = "" + number;
            String answer;
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            data[i] = question + ":" + answer;
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }
}
