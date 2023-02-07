package hw_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1)
        Square(12);
        Square(144);

        // 2)
        div(2, 0);
        div(3, 1);

        // 3)
        Sum();
    }

    public static double Square(double num) {
        double result = 0;
        try {
            result = Math.sqrt(num);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int div(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void Sum() {
        try {
            Thread.sleep(1000);
            Scanner scan = new Scanner(System.in);
            System.out.println("first num: ");

            int firstNumber = scan.nextInt();

            System.out.println("sec num: ");
            int secondNumber = scan.nextInt();

            System.out.println("third num: ");
            int thirdNumber = scan.nextInt();

            System.out.println("fourth: ");
            int fourthNumber = scan.nextInt();

            System.out.println(firstNumber + secondNumber + thirdNumber + fourthNumber);
        } catch (InputMismatchException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
