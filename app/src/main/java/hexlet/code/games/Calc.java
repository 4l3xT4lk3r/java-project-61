package hexlet.code.games;

import java.util.Random;

public final class Calc implements Playable {
    private final String gameDescription = "What is the result of the expression?";
    private String question;
    private String answer;

    private final int maxNumber = 100;
    private final int asteriskSign = 42;
    private final int plusSign = 43;
    private final int minusSign = 45;
    @Override
    public String getGameDescription() {
        return gameDescription;
    }

    @Override
    public void playGame() {
        int a = new Random().nextInt(1, maxNumber);
        int b = new Random().nextInt(1, maxNumber);
        char[] signs = {asteriskSign, plusSign, minusSign};
        char sign = signs[new Random().nextInt(signs.length)];
        question = a + " " + sign + " " + b;
        if (sign == asteriskSign) {
            answer = "" + (a * b);
        } else if (sign == plusSign) {
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
