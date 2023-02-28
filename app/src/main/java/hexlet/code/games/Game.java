package hexlet.code.games;

import hexlet.code.Engine;

public abstract class Game {
    private final String gameDescription;
    private int maxRounds;

    private static final  int DEFAULT_ROUND_COUNT = 3;

    public Game(String description) {
        this.gameDescription = description;
        this.maxRounds = DEFAULT_ROUND_COUNT;
    }

    public final void setMaxRounds(int rounds) {
        this.maxRounds = rounds;
    }

    public final void playGame() {
        String[][] data = new String[maxRounds][2];
        for (int i = 0; i < maxRounds; i++) {
            data[i] = generateRoundData();
        }
        Engine.processGameData(gameDescription, data);
    }

    abstract String[] generateRoundData();
}
