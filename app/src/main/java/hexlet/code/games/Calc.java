package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final char[] OPERATION = {'+', '-', '*'};
    private static final String Q = "What is the result of the expression?";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];
        char op;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            op = OPERATION[Utils.generateNumber(0, 2)];
            int x1 = Utils.generateNumber(MIN_X, MAX_X);
            int x2 = Utils.generateNumber(MIN_X, MAX_X);
            task[i][0] = x1 + " " + op + " " + x2;
            switch (op) {
                case '+': {
                    task[i][1] = x1 + x2 + "";
                    break;
                }
                case '-': {
                    task[i][1] = x1 - x2 + "";
                    break;
                }
                case '*': {
                    task[i][1] = x1 * x2 + "";
                    break;
                }
            }
        }
        Engine.game(Q, task);
    }
}
