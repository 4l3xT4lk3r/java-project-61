package hexlet.code;

import java.util.Random;

public final class Utils {
    private static final Random RANDOM = new Random();

    public static final int MAX_NUMBER = 100;

    public static int getRandomNumber(int startNumber, int endNumber) {
        return RANDOM.nextInt(startNumber, endNumber);
    }

    public static int getRandomNumber(int startNumber) {
        return RANDOM.nextInt(startNumber);
    }

}
