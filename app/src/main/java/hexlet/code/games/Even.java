package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(MIN_X, MAX_X);
            task[i][0] = Integer.toString(number);
            task[i][1] = isEven(Integer.parseInt(task[i][0])) ? "yes" : "no";
        }
        Engine.game(QUESTION, task);
    }
    public static boolean isEven(int data) {
        return data % 2 == 0;
    }
}

