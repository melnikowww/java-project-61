package hexlet.code.games;

import hexlet.code.Engine;
public class Prime {
    public static void game() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] task = new String[Engine.rowNumber][Engine.columnNumber];

        for (int i = 0; i < Engine.stepNumber; i++) {
            task[i][0] = Engine.randNumber() + "";
            task[i][1] = Engine.primeTest(Integer.parseInt(task[i][0]));
        }
        Engine.game(question, task);
    }
}
