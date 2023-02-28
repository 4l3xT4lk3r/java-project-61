package hexlet.code.games;

import hexlet.code.Utils;

public final class Prime extends Game {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public Prime() {
        super(GAME_DESCRIPTION);
    }

    @Override
    String[] generateRoundData() {
        int number = Utils.getRandomNumber(1, Utils.MAX_NUMBER);
        String question = "" + number;
        String answer;
        if (isPrime(number)) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[]{question, answer};
    }

    private boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count <= 2;
    }
}
