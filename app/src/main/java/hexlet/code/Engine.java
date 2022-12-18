package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int S = 3;

    public static void game(String question, String[][] task) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scan.next();
        System.out.println("Hello, " + name + "!");
        String ans;
        System.out.println(question);
        for (int i = 0; i < S; i++) {
            System.out.println("Question: " + task[i][0]);
            System.out.print("Your answer: ");
            ans = scan.next();
            if (ans.equals(task[i][1])) {
                rightAnswer();
            } else {
                wrongAnswer(task[i][1], ans);
                break;
            }
            congrats();
        }
    }
    public static void rightAnswer() {
        System.out.println("Correct!");
    }
    public static void wrongAnswer(String rightA, String wrongA) {
        System.out.println("'" + wrongA + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightA + "'");
        System.out.println("Let's try again, " + Engine.name + "!");
    }
    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }
}
