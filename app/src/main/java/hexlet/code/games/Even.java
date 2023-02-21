package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGame() {
        String[] data = new String[App.MAX_ROUNDS];
        for (int i = 0; i < App.MAX_ROUNDS; i++) {
            data[i] = makeQuestion();
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static String makeQuestion() {
        int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        String question = "" + number;
        String answer;
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return question + ":" + answer;
    }
}
