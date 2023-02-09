package hw_12;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1)
        int a = 10, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("-----------");
        System.out.println("2)");

        //2)
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.println("-----------");
        System.out.println("-----------");

        System.out.println("3)");

        //3)
        int c = 3, d = 4;
        int l;
        l = c;
        c = d;
        d = l ;
        System.out.println(c + " " + d);

        //4)
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        if(a1 > b1 && a1 > c1){
            System.out.println(a1);
        }
        else if (b1 > a1 && b1 > c1){
            System.out.println(b1);
        }
        else {
            System.out.println(c1);
        }

        //5)
        int num = sc.nextInt();
        if (num >= 0){
            System.out.println("polozhitelnoe");
        }
        else {
            System.out.println("otricatelnoe");
        }

        //6)

        String str = "AAAAAA";
        String newString =  str.replace('A', 'B');
        System.out.println(newString);


        //7)
        int sum = 0;
           int arr[] = {10, 3 ,15};
           for (int i = 0; i < arr.length; i++){
               sum += arr[i];
           }
        System.out.println(sum);

           //8)

        int array[] = {10, 3 ,15, 1000 , 100 , 10 , 1};
        Arrays.sort(array);
        System.out.print(array[array.length - 2]);

    }

}
