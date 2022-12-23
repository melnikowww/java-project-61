package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_X = 0;
    private static final int MAX_X = 100;
    private static final char[] OPERATION = {'+', '-', '*'};
    private static final String QUESTION = "What is the result of the expression?";

    public static void game() {
        String[][] task = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            char operator = OPERATION[Utils.generateNumber(0, 2)];
            int number1 = Utils.generateNumber(MIN_X, MAX_X);
            int number2 = Utils.generateNumber(MIN_X, MAX_X);
            task[i][1] = Integer.toString(calculate(operator, number1, number2));
            task[i][0] = number1 + " " + operator + " " + number2;
        }
        Engine.game(QUESTION, task);
    }
    private static int calculate(char operation, int x1, int x2) {
        int result;
        switch (operation) {
            case '+':
                result = x1 + x2;
                break;

            case '-':
                result = x1 - x2;
                break;

            case '*':
                result = x1 * x2;
                break;
            default:
                throw new RuntimeException("Unknown operation: " + operation);
        }
        return result;
    }
}
