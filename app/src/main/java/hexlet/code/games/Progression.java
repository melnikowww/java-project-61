package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 10;
    private static final String Q = "What number is missing in the progression?";


    public static void game() {
        String[][] task = new String[Engine.S][2];
        int secretPlace;
        String[] progression;

        for (int i = 0; i < Engine.S; i++) {
            progression = Utils.makeProgression(MIN_X, MAX_X, MIN_SIZE, MAX_SIZE, MIN_STEP, MAX_STEP);
            /*
            for (int j = 0; j < progression.length; j++) {
                System.out.print(progression[j] + " ");
            }
             */
            //System.out.println();
            secretPlace = Utils.generateNumber(0, progression.length - 2);
            //System.out.println(secretPlace);
            task[i][1] = progression[secretPlace];
            //System.out.println(task[i][1]);
            task[i][0] = String.join(" ", progression).replace(task[i][1] + " ", ".. ");
        }
        Engine.game(Q, task);
    }
}
