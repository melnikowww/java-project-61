package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number1 = Utils.generateNumber(MIN_X, MAX_X);
            int number2 = Utils.generateNumber(MIN_X, MAX_X);
            task[i][0] = number1 + " " + number2;
            task[i][1] = Integer.toString(gcd(number1, number2));
        }
        Engine.game(QUESTION, task);
    }
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

}
