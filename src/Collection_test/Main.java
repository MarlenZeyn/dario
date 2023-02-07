package Collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    enum Bus {
        DIESEL, ELECTRIC, HYBRID;
        int mileage = 10;
        }
    public static void main(String[] args){
        Bus bus = Bus.ELECTRIC;
        System.out.println(bus + ", " + bus.mileage);
        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Toyota");
        Cars.add("BMW");
        Cars.add("Lexus");
        Cars.add("Mercedes");
//        System.out.println(Cars);
//        Cars.remove(0);
//        System.out.println(Cars);
//        Cars.clear();
//        System.out.println(Cars);
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1000);
        num.add(10);
        num.add(-100);
        num.add(3);
        Collections.sort(num);
        System.out.println(num);
        System.out.println(num.get(0));
        LinkedList<String> Water = new LinkedList<>();
        Water.addFirst("samal");
        Water.addLast("Bonaqua");
        System.out.println( Water.getFirst());





    }
}
