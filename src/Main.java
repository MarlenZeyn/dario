import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1)
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        if (a==b){
//            System.out.println("квадрат");
//        }
//        else {
//            System.out.println("прямоугольник");
//        }


        //2)
//        int a = scan.nextInt();
//        if(a > 5000){
//            System.out.println("Итоговая сумма="+(a-(a*0.1)));
//        }
//        else {
//            System.out.println("Итоговая сумма="+a);
//        }

        //3)
//        int a = scan.nextInt();
//        if(a < 25){
//            System.out.println("F");
//        }
//        else if (25 <= a && a < 45){
//            System.out.println("E");
//        }
//        else if (45 <= a && a < 50){
//            System.out.println("D");
//        }
//        else if (50 <= a && a < 60){
//            System.out.println("C");
//        }
//        else if (60 <= a && a < 80){
//            System.out.println("B");
//        }
//        else if (a >= 80 && a <= 100){
//            System.out.println("A");
//        }
//         else(){
//            System.out.println("вы ввели неправильное число");
//        }

        //4)

//        int b = 0;
//        int a = scan.nextInt();
//        for(int i = 0; a != 0; a /= 10){
//            int c = a % 10;
//            b= b * 10 + c;
//        }
//        System.out.println(b);
        //5)
//        int a = scan.nextInt();
//        for (int i = 2; i <= Math.sqrt(a); i++) {
//            if (a % i == 0) {
//                System.out.println("ne prostoe 4islo");
//            }
//        }
//        System.out.println("prostoe");
//
//
//
//
        //6 i)

//        for (int i = 0; i < 4; i++){
//            for (int y = 0; y < 10; y++)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }

        //6 ii)
//        for (int i = 0; i < 5; i++){
//            for (int y = 0; y < i + 1; y++)
//            {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

        //6) iii)
//         for (int i = 1; i <= 5; i++)
//         {
//             for (int y = i; y <= 4; y++){
//                 System.out.print("  ");
//             }
//             for (int j = i; j > 0; j--){
//                 System.out.print(j);
//             }
//             for (int k = 2; k <= i; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
        //7)
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int sum = 0;
//        for (int i = a ; i <= b; i++){
//            sum +=i;
//        }
//        System.out.println(sum);


        //8)
//        double zp_withprem;
//        int zarplata = 100000;
//        System.out.println("A = 1");
//        System.out.println("B = 2");
//        System.out.println("C = 3");
//        int zp_class = scan.nextInt();
//        if (zp_class == 1){
//            zp_withprem = zarplata*1.5;
//            System.out.println(zp_withprem);
//        }
//        else if (zp_class == 2){
//            zp_withprem = zarplata*1.25;
//            System.out.println(zp_withprem);
//        }
//        else if (zp_class == 3){
//            zp_withprem = zarplata*1;
//            System.out.println(zp_withprem);
//        }


        //9)
//        int n0 = 1;
//        int n1 = 1;
//        int n2;
//        System.out.print(n0 + " " + n1 + " ");
//        for (int i = 3; i <= 11; i++) {
//            n2 = n0 + n1;
//            System.out.print(n2 + " ");
//            n0 = n1;
//            n1 = n2;
//        }
//        System.out.println();


    }


}
