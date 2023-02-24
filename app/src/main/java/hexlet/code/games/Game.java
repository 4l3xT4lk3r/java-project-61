package hexlet.code.games;

import hexlet.code.Engine;

public abstract class Game {
    private final String gameDescription;

    public Game(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public final void playGame(int rounds) {
        String[][] data = new String[rounds][2];
        for (int i = 0; i < rounds; i++) {
            data[i] = generateRoundData();
        }
        Engine.processGameData(gameDescription, data);
    }

    abstract String[] generateRoundData();
}
