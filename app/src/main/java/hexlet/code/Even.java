package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.round;

public class Even {
    public static void game(){
        System.out.println("Welcome to the Brain Games!");
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int winCount = 0;
        long quest;

        while (winCount != 3) {
            quest = round(Math.random() * 100);
            System.out.println("Question: " + quest);
            String answer = scan.next();
            if (((quest % 2 == 0) && (answer.equals("yes"))) || ((quest % 2 != 0) && (answer.equals("no")))) {
                System.out.println("Correct!");
                winCount++;
            }
            if ((quest % 2 == 0) && (answer.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name);
                break;
            }
            if ((quest % 2 != 0) && (answer.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                break;
            }
            if ((!answer.equals("no")) && (!answer.equals("yes"))) {
                System.out.println("Incorrect answer ;(.");
                System.out.println("Let's try again, " + name);
                break;
            }
            }
        }
    }
