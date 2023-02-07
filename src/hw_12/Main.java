package hw_12;

public class Main {
    public static void main(String[] args){
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
                System.out.println(i);
            }
        }
        System.out.println("-----------");
        System.out.println("3)");

        //3)
        int c = 3, d = 4;
        c = d;
        d = c ;
        System.out.println(c + " " + d);



    }
}
