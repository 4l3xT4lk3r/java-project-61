package hexlet.code.games;

import java.util.Random;

public class GCD implements Playable {
    public final String gameDescription = "Find the greatest common divisor of given numbers.";
    private String question;
    private String answer;

    @Override
    public String getGameDescription() {
        return gameDescription;
    }

    @Override
    public void playGame() {
        int a = new Random().nextInt(1, 100);
        int b = new Random().nextInt(1, 100);
        question = a + " " + b;
        int gdc = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gdc = i;
            }
        }
        answer = "" + gdc;
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
