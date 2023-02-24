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
        String answer = isPrime(number);
        return new String[]{question, answer};
    }

    private String isPrime(int number) {
        int count = 0;
        String answer;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count <= 2) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return answer;
    }
}
