package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.round;

public class Engine {
    public static int operation;
    public static long randomNumber;
    public static int winCount = 0;
    public static String question;
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
        randomNumber = round(Math.random() * 100);
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

    public static void answer() {
        System.out.print("Your answer: ");
    }
    public static void rightAnswer() {
        System.out.println("Correct!");
        winCount++;
    }
    public static void wrongAnswer(String rightA, String wrongA) {
        System.out.println("'" + wrongA + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightA + "'");
        System.out.println("Let's try again, " + Engine.name + "!");
    }
    public static void wrongAnswer(int rightA, int wrongA) {
        System.out.println("'" + wrongA + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightA + "'");
        System.out.println("Let's try again, " + Engine.name + "!");
    }
    public static void incorrectAns() {
        System.out.println("Incorrect answer ;(.");
        System.out.println("Let's try again, " + Engine.name);
    }
    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }
    public static void question(String data1) {
        System.out.println("Question: " + data1);
    }
    public static void question(String data1, String data2) {
        System.out.println("Question: " + data1 + " " + data2);
    }
    public static void question(String data1, String data2, String smthElse) {
        System.out.println("Question: " + data1 + " " + smthElse + " " + data2);
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
}
