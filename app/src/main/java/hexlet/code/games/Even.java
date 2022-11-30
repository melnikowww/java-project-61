package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Even {
    public static void game() {
        Engine.meet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        long quest;
        int win_number = 3;

        while (Engine.winCount != win_number) {
            quest = Engine.randNumber();
            Engine.question(Integer.toString((int) quest));
            Engine.answer();
            String answer = scan.next();
            if (((quest % 2 == 0) && (answer.equals("yes"))) || ((quest % 2 != 0) && (answer.equals("no")))) {
                Engine.rightAnswer();
            }
            if ((quest % 2 == 0) && (answer.equals("no"))) {
                Engine.wrongAnswer("yes", "no");
                break;
            }
            if ((quest % 2 != 0) && (answer.equals("yes"))) {
                Engine.wrongAnswer("no", "yes");
                break;
            }
            if ((!answer.equals("no")) && (!answer.equals("yes"))) {
                Engine.incorrectAns();
                break;
            }
            if (Engine.winCount == win_number) {
                Engine.congrats();
            }
        }
    }
}
