package hexlet.code.games;

import hexlet.code.Utils;

public final class GCD extends Game {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public GCD() {
        super(GAME_DESCRIPTION);
    }

    @Override
    String[] generateRoundData() {
        int a = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        int b = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        String question = a + " " + b;
        int answer = getGdc(a, b);
        return new String[]{question, "" + answer};
    }

    private int getGdc(int a, int b) {
        int gdc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gdc = i;
            }
        }
        return gdc;
    }
}

