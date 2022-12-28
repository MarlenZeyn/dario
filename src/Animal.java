public class Main {


    public static void main(String[] args) {
        find();

    }
    //1)
    static void find(){
    Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if(number<number2&&number<number3){
            System.out.println(number);
        }
        else if(number2<number&&number2<number3){
            System.out.println(number2);
        }
        else {
            System.out.println(number3);
        }
    }
    //2)
    static void find(){
        Scanner scan = new Scanner(System.in);
        double avg;
        int number = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        avg = (number3 + number + number2)/3;
        System.out.println(avg);

    }

            3)
    static void find(){
    String dar = "DarTech123";

    char[] Arr = new char[]{'a', 'e', 'o', 'y'};

    int counter = 0;

    char[] arr = dar.toCharArray();
        for (char ch : arr) {
            for (char ch2 : Arr) {
                if (ch == ch2){
                    counter++;
                }
            }
        }
        System.out.println(counter);}


    //             4)
    static void find() {
        String str = "Java is good to learn Object Oriented programming";
        int count = 0;

        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    //          5)

    static void find() {
        int x = 1254212;
        int counter = 0;
        int n = x;
        do {
            if (n % 10 == 2) {
                counter++;
            }
            n /= 10;
        } while (n > 0);
        System.out.println(counter);
    }



    //5)
    static void find() {
        String dar = "AIEEE";
        boolean check = false;
        int count = 0;
        char[] Arr = new char[]{'A', 'I', 'E', 'y'};
        char[] arr = dar.toCharArray();
        for (char ch : arr) {
            for (char ch2 : Arr) {
                if (ch == ch2) {
                    count++;
                }

            }
            if (count == 5) {
                check = true;
                System.out.println(check);
                break;
            } else if (count != 5) {
                System.out.println(check);
                break;
            }
        }


    }

    // 6)
    static void find() {
        int a = 6;
        double area;
        double area1;
        double area2;
        area1 = (double) (5 * Math.pow(6,2) * Math.sin(72));

        area2 = (4 * (1 - Math.cos(72)));
        area = area1 / area2;
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area);


    }



    // 7)
    static void find(){
        int a = 252;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }






































}