package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String question = "What number is missing in the progression?";
        String[][] task = new String[Engine.rowNumber][Engine.columnNumber];
        int startNumber;
        int step;
        int sizeOfProgression;
        int secretPlace;
        int minSize = 5;
        int maxSize = 10;
        int minStep = 1;
        int maxStep = 10;

        for (int i = 0; i < Engine.stepNumber; i++) {
            startNumber = Engine.randNumber();
            step = Engine.randNumber(minStep, maxStep);
            sizeOfProgression = Engine.randNumber(minSize, maxSize);
            secretPlace = Engine.randNumber(sizeOfProgression);
            task[i][0] = "";

            int[] progression = new int[sizeOfProgression];
            for (int j = 0; j < sizeOfProgression; j++) {
                progression[j] = startNumber + j * step;
            }
            for (int j = 0; j < sizeOfProgression; j++) {
                if (j == secretPlace) {
                    task[i][0] = task[i][0] + ".." + " ";
                    task[i][1] = progression[j] + "";
                    continue;
                }
                task[i][0] = task[i][0] + progression[j] + " ";
            }
        }
        Engine.game(question, task);
    }
}
