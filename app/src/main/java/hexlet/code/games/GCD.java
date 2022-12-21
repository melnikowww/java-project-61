package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final String Q = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int big;
            int small;
            int x1 = Utils.generateNumber(MIN_X, MAX_X);
            int x2 = Utils.generateNumber(MIN_X, MAX_X);
            if (x1 > x2) {
                big = x1;
                small = x2;
            } else {
                big = x2;
                small = x1;
            }
            task[i][0] = big + " " + small;
            task[i][1] = gcd(big, small) + "";
        }
        Engine.game(Q, task);
    }
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

}
