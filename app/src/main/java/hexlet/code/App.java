package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String numb = scan.next();

        switch (numb) {
            case "1":
                Cli.meet();
                break;

            case "2":
                Even.game();
                break;

            case "3":
                Calc.game();
                break;

            case "4":
                GCD.game();
                break;

            case "5":
                Progression.game();
                break;

            case "6":
                Prime.game();
                break;

            default:
                throw new RuntimeException("Unknown input: " + numb);

        }
    }
}

