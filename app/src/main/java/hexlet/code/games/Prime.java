package hexlet.code.games;

import java.util.Random;

public final class Prime implements Playable {

    private final String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String question;
    private String answer;

    private final int maxNumber = 100;

    @Override
    public String getGameDescription() {
        return gameDescription;
    }

    @Override
    public void playGame() {
        int number = new Random().nextInt(1, maxNumber);
        int count = 0;
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
        question = "" + number;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getAnswer() {
        return answer;
    }
}
