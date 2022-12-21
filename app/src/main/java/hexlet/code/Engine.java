package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String name;
    public static final int ROUNDS = 3;

    public static void game(String question, String[][] task) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scan.next();
        System.out.println("Hello, " + name + "!");
        String ans;
        System.out.println(question);
        /*
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + task[i][0]);
            System.out.print("Your answer: ");
            ans = scan.next();
            if (ans.equals(task[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + ans + "'" + " is wrong answer ;(. Correct answer was " + "'" + task[i][1] + "'");
                System.out.println("Let's try again, " + Engine.name + "!");
                return;
            }
        }

         */
        for (String[] round : task) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            ans = scan.next();
            if (ans.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + ans + "'" + " is wrong answer ;(. Correct answer was " + "'" + round[1] + "'");
                System.out.println("Let's try again, " + Engine.name + "!");
                return;
            }
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
