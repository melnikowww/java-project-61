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
        String eq;
        while (Engine.winCount != 3){
            firstNumb = Engine.randNumber();
            secNumb = Engine.randNumber();
            op = Engine.operation();
            System.out.println("Question: " + firstNumb + op + secNumb);
            if (op.equals("+")) {
                right = firstNumb + secNumb;
            }
            if (op.equals("-")) {
                right = firstNumb - secNumb;
            }
            if (op.equals("*")) {
                right = firstNumb * secNumb;
            }
            String answer = scan.next();
            if (answer.equals(Integer.toString(right))) {
                Engine.rightAnswer();
            }
            if (!answer.equals(Integer.toString(right))) {
                Engine.wrongAnswer(Integer.toString(right), answer);
                break;
            }
            if (Engine.winCount == 3) {
                Engine.congrats();
            }
        }
    }
}
