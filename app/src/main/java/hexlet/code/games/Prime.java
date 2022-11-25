package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void game() {
        Engine.meet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        int number;

        while (Engine.winCount != 3) {
            number = Engine.randNumber();
            Engine.question(Integer.toString(number));
            Engine.answer();
            String answer = scan.next();
            String rightAnswer = Engine.primeTest(number);
            if (answer.equals(rightAnswer)) {
                Engine.rightAnswer();
            } else {
                Engine.wrongAnswer(rightAnswer, answer);
                break;
            }
            if (Engine.winCount == 3) {
                Engine.congrats();
            }
        }
    }
}
