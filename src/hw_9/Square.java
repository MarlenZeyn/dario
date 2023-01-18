package hw_9;
import java.util.Scanner;

public class Square {
    public int findSquare() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int Perim, area;
        double diag;
        Perim = 4 * a;
        area = a * a;
        diag = a * Math.sqrt(2);
        System.out.println("Perimeter = " + Perim + " Area =" + area + "  diagonal = " + diag);
        System.out.println("Your number is :");
        return a;
    }
}
