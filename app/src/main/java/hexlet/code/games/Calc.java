package hexlet.code.games;

import java.util.Random;

public class Calc implements Playable {
    private final String gameDescription = "What is the result of the expression?";
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
        char[] signs = {42, 43, 45};
        char sign = signs[new Random().nextInt(signs.length)];
        question = a + " " + sign + " " + b;
        if (sign == 42) {
            answer = "" + (a * b);
        } else if (sign == 43) {
            answer = "" + (a + b);
        } else {
            answer = "" + (a - b);
        }
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
