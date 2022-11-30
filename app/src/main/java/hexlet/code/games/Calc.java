package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void game() {
        Engine.meet();
        System.out.println("What is the result of the expression?");
        Scanner scan = new Scanner(System.in);
        int firstNumb;
        int secNumb;
        String op;
        int right = 0;
        int win_number = 3;
        //String eq;
        while (Engine.winCount != win_number) {
            firstNumb = Engine.randNumber();
            secNumb = Engine.randNumber();
            op = Engine.operation();
            Engine.question(Integer.toString(firstNumb), Integer.toString(secNumb), op);
            if (op.equals("+")) {
                right = firstNumb + secNumb;
            }
            if (op.equals("-")) {
                right = firstNumb - secNumb;
            }
            if (op.equals("*")) {
                right = firstNumb * secNumb;
            }
            Engine.answer();
            String answer = scan.next();
            if (answer.equals(Integer.toString(right))) {
                Engine.rightAnswer();
            }
            if (!answer.equals(Integer.toString(right))) {
                Engine.wrongAnswer(Integer.toString(right), answer);
                break;
            }
            if (Engine.winCount == win_number) {
                Engine.congrats();
            }
        }
    }
}
