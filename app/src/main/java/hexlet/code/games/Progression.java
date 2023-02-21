package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MAX_INCREASE_NUMBER = 10;

    public static void playGame(int rounds) {
        String[] data = new String[rounds];
        for (int i = 0; i < rounds; i++) {
            int length = Utils.getRandomNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int startNumber = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
            int k = Utils.getRandomNumber(1, MAX_INCREASE_NUMBER);
            int randomPos = Utils.getRandomNumber(1, length);
            data[i] = getProgression(length, startNumber, k, randomPos);
        }
        Engine.processGameData(GAME_DESCRIPTION, data);
    }

    private static String getProgression(int length, int startNumber, int k, int randomPos) {
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
        return question + ":" + answer;
    }
}
