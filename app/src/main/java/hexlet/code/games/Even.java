package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void game() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] task = new String[Engine.rowNumber][Engine.columnNumber];

        for (int i = 0; i < Engine.stepNumber; i++) {
            task[i][0] = Engine.randNumber() + "";
            if (Integer.parseInt(task[i][0]) % 2 == 0) {
                task[i][1] = "yes";
            } else {
                task[i][1] = "no";
            }
        }
        Engine.game(question, task);
    }
}

