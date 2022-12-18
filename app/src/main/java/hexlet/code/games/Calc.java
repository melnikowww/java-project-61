package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int minX = 0;
    private static final int maxX = 100;
    private static final String quest = "What is the result of the expression?";

    public static void game() {
        String[][] task = new String[Engine.S][2];
        String op;

        for (int i = 0; i < Engine.S; i++) {
            op = Utils.operation();
            int x1 = Utils.generateNumber(minX, maxX);
            int x2 = Utils.generateNumber(minX, maxX);
            task[i][0] = x1 + " " + op + " " + x2;
            if (op.equals("+")) {
                task[i][1] = x1 + x2 + "";
            }
            if (op.equals("-")) {
                task[i][1] = x1 - x2 + "";
            }
            if (op.equals("*")) {
                task[i][1] = x1 * x2 + "";
            }
        }
        Engine.game(quest, task);
    }
}
