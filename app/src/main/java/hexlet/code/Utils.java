package hexlet.code;

public class Utils {

    public static int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static String operation() {
        int operation;
        operation = generateNumber(0, 2);
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

    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
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

    public static boolean isEven(String data) {
        return Integer.parseInt(data) % 2 == 0;
    }

    public static String [] makeProgression(int minX, int maxX, int minSize, int maxSize, int minStep, int maxStep) {
        int startNumber;
        int step;
        int sizeOfProgression;

        startNumber = Utils.generateNumber(minX, maxX);
        step = Utils.generateNumber(minStep, maxStep);
        sizeOfProgression = Utils.generateNumber(minSize, maxSize);

        String[] progression = new String[sizeOfProgression];
        for (int i = 0; i < sizeOfProgression; i++) {
            progression[i] = startNumber + i * step + "";
        }
        return progression;
    }
}
