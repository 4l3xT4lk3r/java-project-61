package hexlet.code.games;

import hexlet.code.Utils;

public final class Calc extends Game {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final char ASTERISK_SIGN = 42;
    private static final char PLUS_SIGN = 43;
    private static final char MINUS_SIGN = 45;

    public Calc() {
        super(GAME_DESCRIPTION);
    }

    @Override
    String[] generateRoundData() {
        int a = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        int b = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        char[] signs = {ASTERISK_SIGN, PLUS_SIGN, MINUS_SIGN};
        char sign = signs[Utils.getRandomNumber(signs.length)];
        String question = a + " " + sign + " " + b;
        String answer;
        if (sign == ASTERISK_SIGN) {
            answer = "" + (a * b);
        } else if (sign == PLUS_SIGN) {
            answer = "" + (a + b);
        } else {
            answer = "" + (a - b);
        }
        return new String[]{question, answer};
    }
}
