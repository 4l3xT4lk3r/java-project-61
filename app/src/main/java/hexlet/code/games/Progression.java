package hexlet.code.games;

import java.util.Random;

public final class Progression implements Playable {
    private final String gameDescription = "What number is missing in the progression?";
    private String question;
    private String answer;

    private final int minProgressionLength = 5;
    private final int maxProgressionLength = 10;
    private final int minStartNumber = 1;
    private final int maxStartNumber = 100;

    private final int maxIncreaseNumber = 10;

    @Override
    public String getGameDescription() {
        return gameDescription;
    }

    @Override
    public void playGame() {
        int length = new Random().nextInt(minProgressionLength, maxProgressionLength);
        int startNumber = new Random().nextInt(minStartNumber, maxStartNumber);
        int k = new Random().nextInt(1, maxIncreaseNumber);
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
