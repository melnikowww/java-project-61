package hexlet.code.games;

import hexlet.code.Engine;
public class Prime {
    /*
    public static void game() {
        Engine.meet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        int number;
        int win_number = 3;

        while (Engine.winCount != win_number) {
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
            if (Engine.winCount == win_number) {
                Engine.congrats();
            }
        }
    }
    */
    public static void game() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] task = new String[3][2];

        for (int i = 0; i < 3; i++) {
            task[i][0] = Engine.randNumber() + "";
            task[i][1] = Engine.primeTest(Integer.parseInt(task[i][0]));
        }
        Engine.game(question, task);
    }
}
