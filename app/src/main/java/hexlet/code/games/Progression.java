package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String[][] task = new String[Engine.R][Engine.C];
        int startNumber;
        int step;
        int sizeOfProgression;
        int secretPlace;
        final int minSize = 5;
        final int maxSize = 10;
        final int minStep = 1;
        final int maxStep = 10;

        for (int i = 0; i < Engine.S; i++) {
            startNumber = Engine.randNumber();
            step = Engine.randNumber(minStep, maxStep);
            sizeOfProgression = Engine.randNumber(minSize, maxSize);
            secretPlace = Engine.randNumber(0, sizeOfProgression - 1);
            task[i][0] = "";

            int[] progression = new int[sizeOfProgression];
            //progression[0] = startNumber;
            for (int j = 0; j < sizeOfProgression; j++) {
                progression[j] = startNumber + j * step;
            }
            for (int j = 0; j < sizeOfProgression; j++) {
                if (j == secretPlace) {
                    task[i][0] = task[i][0] + ".." + " ";
                    //System.out.println(task[i][0]);
                    task[i][1] = progression[j] + "";
                    //System.out.println(task[i][1]);
                    continue;
                }
                task[i][0] = task[i][0] + progression[j] + " ";
            }
        }
        Engine.game("What number is missing in the progression?", task);
    }
}
