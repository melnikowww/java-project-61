package hexlet.code.games;

import java.util.Scanner;

import static java.lang.Math.E;
import static java.lang.Math.round;
import hexlet.code.Engine;

public class Even {
    public static void game() {
        Engine.meet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        long quest;

        while (Engine.winCount != 3) {
            quest = Engine.randNumber();
            System.out.println("Question: " + quest);
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
        }
    }
}
