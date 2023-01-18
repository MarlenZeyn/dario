package hw_9;

public class StarTriangle {
    void printTriangle(){
        int i, j, row=3;
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("[*] ");
            }
            System.out.println();
        }}
}
