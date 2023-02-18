package hexlet.code.games;

import java.util.Random;


public final class Even implements Playable {
    private final String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private String question;
    private String answer;

    private final int maxNumber = 100;

    public void playGame() {
        int number = new Random().nextInt(1, maxNumber);
        this.question = "" + number;
        if (number % 2 == 0) {
            this.answer = "yes";
        } else {
            this.answer = "no";
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getGameDescription() {
        return gameDescription;
    }

}
