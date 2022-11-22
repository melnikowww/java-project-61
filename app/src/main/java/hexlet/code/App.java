package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even\n1 - Greet\n0 - Exit");
        String numb = scan.next();
        System.out.println("Your choice: " + numb);

        if (numb.equals("1")) {
            Cli.meet();
        }
        if (numb.equals("2")) {
            Even.game();
        }
    }
}

