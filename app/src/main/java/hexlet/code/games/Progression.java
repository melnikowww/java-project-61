package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int minX = 0;
    private static final int maxX = 100;
    private static final int minStep = 1;
    private static final int maxStep = 10;
    private static final int minSize = 5;
    private static final int maxSize = 10;
    private static final String quest = "What number is missing in the progression?";


    public static void game() {
        String[][] task = new String[Engine.S][2];
        int secretPlace;
        String[] progression;

        for (int i = 0; i < Engine.S; i++) {
            progression = Utils.makeProgression(minX, maxX, minSize, maxSize, minStep, maxStep);
            secretPlace = Utils.generateNumber(1, progression.length - 1);
            task[i][1] = progression[secretPlace - 1] + "";
            task[i][0] = String.join(" ", progression).replace(" " + task[i][1] + " ", " .. ");
        }
        Engine.game(quest, task);
    }
}
