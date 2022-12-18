package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final String Q = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] task = new String[Engine.S][2];
        int x1;
        int x2;
        int big;
        int small;
        for (int i = 0; i < Engine.S; i++) {
            x1 = Utils.generateNumber(MIN_X, MAX_X);
            x2 = Utils.generateNumber(MIN_X, MAX_X);
            if (x1 > x2) {
                big = x1;
                small = x2;
            } else {
                big = x2;
                small = x1;
            }
            task[i][0] = big + " " + small;
            task[i][1] = Utils.gcd(big, small) + "";
        }
        Engine.game(Q, task);
    }
}
