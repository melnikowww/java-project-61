package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int PROGRESSION_SIZE = 8;
    private static final String Q = "What number is missing in the progression?";


    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];
        int secretPlace;
        String[] progression;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int startNumber = Utils.generateNumber(MIN_X, MAX_X);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
            progression = makeProgression(startNumber, PROGRESSION_SIZE, step);

            secretPlace = Utils.generateNumber(0, progression.length - 1);
            task[i][1] = progression[secretPlace];
            task[i][0] = (" " + String.join(" ", progression) + " ").replace( " " + task[i][1] + " ", " .. ");
        }
        Engine.game(Q, task);
    }
    public static String[] makeProgression(int start, int size, int step) {

        String[] progression = new String[size];
        for (int i = 0; i < size; i++) {
            progression[i] = start + i * step + "";
        }
        return progression;
    }
}
