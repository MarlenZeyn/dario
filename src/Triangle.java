// 2)
public class Triangle {

    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.print("perimetr ");
        System.out.println(a + b + c);
        double p, S;
        p = (a + b + c) / 2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("area " + S);


    }
}