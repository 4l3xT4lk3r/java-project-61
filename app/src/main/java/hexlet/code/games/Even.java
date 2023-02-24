package hexlet.code.games;

import hexlet.code.Utils;

public final class Even extends Game {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public Even() {
        super(GAME_DESCRIPTION);
    }

    String[] generateRoundData() {
        int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        String question = "" + number;
        String answer;
        if (number % 2 == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[]{question, answer};
    }
}
