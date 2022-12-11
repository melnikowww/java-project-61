package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void game() {
        String question = "What is the result of the expression?";
        String[][] task = new String[Engine.rowNumber][Engine.columnNumber];
        String op;

        for (int i = 0; i < Engine.stepNumber; i++) {
            op = Engine.operation();
            int x1 = Engine.randNumber();
            int x2 = Engine.randNumber();
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
        Engine.game(question, task);
    }
}
