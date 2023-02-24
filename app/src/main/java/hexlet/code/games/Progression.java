package hexlet.code.games;

import hexlet.code.Utils;

public final class Progression extends Game {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_INCREASE_NUMBER = 10;

    public Progression() {
        super(GAME_DESCRIPTION);
    }

    @Override
    String[] generateRoundData() {
        int length = Utils.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
        int startNumber = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        int k = Utils.getRandomNumber(1, MAX_INCREASE_NUMBER);
        int randomPos = Utils.getRandomNumber(1, length);
        return getProgression(length, startNumber, k, randomPos);
    }

    private String[] getProgression(int length, int startNumber, int k, int randomPos) {
        StringBuilder question = new StringBuilder();
        String answer = null;
        for (int i = 0; i < length; i++) {
            if (i != randomPos) {
                question.append(startNumber).append(" ");
                startNumber += k;
            } else {
                question.append(".. ");
                answer = "" + startNumber;
                startNumber += k;
            }
        }
        return new String[]{question.toString(), answer};
    }
}
