package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.round;

public class Engine {
    public static int operation;
    public static long randomNumber;
    public static int winCount = 0;
    public static String name;
    public static void meet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scan.next();
        System.out.println("Hello, " + name + "!");
    }
    public static String operation() {
        operation = (int) round(Math.random() * 2);
        String result = "";
        if (operation == 0) {
            result = "+";
        }
        if (operation == 1) {
            result = "-";
        }
        if (operation == 2) {
            result = "*";
        }
        return result;
    }
    public static int randNumber() {
        int range = 100;
        randomNumber = round(Math.random() * range);
        return (int) randomNumber;
    }
    public static int randNumber(int size) {
        randomNumber = round(Math.random() * size);
        return (int) randomNumber;
    }
    public static int randNumber(int start, int stop) {
        randomNumber = round((Math.random() * (stop - start)) + start);
        return (int) randomNumber;
    }
    public static void rightAnswer() {
        System.out.println("Correct!");
        winCount++;
    }
    public static void wrongAnswer(String rightA, String wrongA) {
        System.out.println("'" + wrongA + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightA + "'");
        System.out.println("Let's try again, " + Engine.name + "!");
    }
    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }
    public static String primeTest(int x) {
        String rightAnswer = "yes";
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                rightAnswer = "no";
                break;
            }
        }
        return rightAnswer;
    }

    public static void game(String question, String[][] task) {
        meet();
        Scanner scan = new Scanner(System.in);
        String ans;
        //int winNumber = 3;
        System.out.println(question);
        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + task[i][0]);
            System.out.print("Your answer: ");
            ans = scan.next();
            if (ans.equals(task[i][1])) {
                rightAnswer();
            } else {
                wrongAnswer(task[i][1], ans);
                break;
            }
            if (winCount == 3) {
                congrats();
            }
        }
    }
}
