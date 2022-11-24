package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void game() {
        Engine.meet();
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scan = new Scanner(System.in);
        int big;
        int small;
        int n1;
        int n2;
        int right;

        while (Engine.winCount != 3) {
            n1 = Engine.randNumber();
            n2 = Engine.randNumber();
            if (n1 > n2) {
                big = n1;
                small = n2;
            } else {
                big = n2;
                small = n1;
            }
            Engine.question(Integer.toString(big), Integer.toString(small));
            right = gcd(big, small);
            Engine.answer();
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
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
