package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final String Q = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            task[i][0] = Utils.generateNumber(MIN_X, MAX_X) + "";
            task[i][1] = primeTest(Integer.parseInt(task[i][0]));
        }
        Engine.game(Q, task);
    }
    public static String primeTest(int x) {
        String rightAnswer = "yes";
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                rightAnswer = "no";
                break;
            }
        }
        return rightAnswer;
    }
}
