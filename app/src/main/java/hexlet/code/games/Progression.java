package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String question = "What number is missing in the progression?";
        String[][] task = new String[3][2];
        int startNumber;
        int step;
        int sizeOfProgression;
        int secretPlace;

        for (int i = 0; i < 3; i++) {
            startNumber = Engine.randNumber();
            step = Engine.randNumber(10);
            sizeOfProgression = Engine.randNumber(5, 10);
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
