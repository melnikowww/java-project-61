package hexlet.code.games;

import hexlet.code.Engine;
public class Prime {
    public static void game() {
        String[][] task = new String[Engine.R][Engine.C];

        for (int i = 0; i < Engine.S; i++) {
            task[i][0] = Engine.randNumber() + "";
            task[i][1] = Engine.primeTest(Integer.parseInt(task[i][0]));
        }
        Engine.game("Answer 'yes' if given number is prime. Otherwise answer 'no'.", task);
    }
}
