package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    public static void game() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] task = new String[Engine.rowNumber][Engine.columnNumber];
        int x1;
        int x2;
        int big;
        int small;
        for (int i = 0; i < Engine.stepNumber; i++) {
            x1 = Engine.randNumber();
            x2 = Engine.randNumber();
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
        Engine.game(question, task);
    }
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
