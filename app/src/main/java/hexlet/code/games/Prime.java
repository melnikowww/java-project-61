package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int minX = 0;
    private static final int maxX = 100;
    private static final String quest = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[][] task = new String[Engine.S][2];

        for (int i = 0; i < Engine.S; i++) {
            task[i][0] = Utils.generateNumber(minX, maxX) + "";
            task[i][1] = Utils.primeTest(Integer.parseInt(task[i][0]));
        }
        Engine.game(quest, task);
    }
}
