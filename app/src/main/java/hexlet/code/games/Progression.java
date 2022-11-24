package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void game() {
        Engine.meet();
        System.out.println("What number is missing in the progression?");
        Scanner scan = new Scanner(System.in);
        int startNumber;
        int step;
        int sizeOfProgression;
        int secretPlace;

        while (Engine.winCount != 3) {
            startNumber = Engine.randNumber();
            step = Engine.randNumber(10);
            sizeOfProgression = Engine.randNumber(5, 10);
            secretPlace = Engine.randNumber(sizeOfProgression);
            int[] progression = new int[sizeOfProgression];
            for (int i = 0; i < sizeOfProgression; i++) {
                progression[i] = startNumber + i * step;
            }
            System.out.print("Question: ");
            for (int i = 0; i < sizeOfProgression; i++) {
                if (i == secretPlace) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }
            System.out.println();
            Engine.answer();
            String answer = scan.next();
            String right = Integer.toString(progression[secretPlace]);
            if (answer.equals(right)) {
                Engine.rightAnswer();
            } else {
                Engine.wrongAnswer(right, answer);
                break;
            }
            if (Engine.winCount == 3) {
                Engine.congrats();
            }
        }
    }
}
