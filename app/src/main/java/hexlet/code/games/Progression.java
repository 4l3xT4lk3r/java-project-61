package hexlet.code.games;

import java.util.Random;

public class Progression implements Playable {
    public final String gameDescription = "What number is missing in the progression?";
    private String question;
    private String answer;

    @Override
    public String getGameDescription() {
        return gameDescription;
    }

    @Override
    public void playGame() {
        int length = new Random().nextInt(5, 10);
        int startNumber = new Random().nextInt(1, 100);
        int k = new Random().nextInt(1, 10);
        int pos = new Random().nextInt(1, length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != pos) {
                sb.append(startNumber).append(" ");
                startNumber += k;
            } else {
                sb.append(".. ");
                answer = "" + startNumber;
                startNumber += k;
            }
        }
        question = sb.toString();
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
