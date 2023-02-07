package hw_10;

import java.util.*;

public class Main {
    //1)

    enum Colors {
        BLUE,
        WHITE,
        RED
    }


    //2)
    enum weekDay{

        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY,
        SUNDAY
    }


    public static void main(String[] mara) {

        System.out.println("----------------");
        System.out.println("1)");
        for (Colors allcolors : Colors.values()) {
            System.out.println(allcolors);
        }
        System.out.println("----------------");
        System.out.println("2)");

        for (weekDay weekday : weekDay.values()) {


        }
//        static void isHoliday(weekDay day){
//            if(day == weekDay.SATURDAY){
//                System.out.println("Saturday holiday");
//            }
//            else if(day == weekDay.SUNDAY){
//                System.out.println("Saturday holiday");
//            }




        //3)
        Animal doggy = new Dog();
        doggy.speed();
        Dog dogg = new Dog();
        dogg.color();
        Gepard gepi = new Gepard();
        Animal gipi = new Gepard();
        gipi.speed();
        gepi.color();
        System.out.println("----------------");
        System.out.println("3)");


        System.out.println("------------");
        System.out.println("4)");
        //4)
        Student stud_grade = new Student();
        ArrayList<String> Stud_name = new ArrayList<>();
        Stud_name.add("Dr.Dre");
        Stud_name.add("Savage");
        Stud_name.add("Eminem");
        Stud_name.add("MetroBoomin");
        for (String stud : Stud_name){
            System.out.println(stud);
            stud_grade.grade();
        }
        System.out.println("-----------------");
        System.out.println("5)");

        //5)
//        List_number list = new List_number("Drake",7777777);
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        int number = scan.nextInt();
//        Contact contact = new Contact(name,number);
//
//
//
//        while(true){
//            System.out.println("PRESS[1] TO SEE LIST OF CONTACTS");
//            System.out.println("PRESS[2] TO ADD NEW CONTACT");
//            System.out.println("PRESS[3] TO FIND CONTACT");
//            int select1 = scan.nextInt();
//            if(select1 == 1){
//                Database.users.get(0);
//
//            }
//
//        }
        System.out.println("-----------------");
        System.out.println("6)");






        //6)
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("green");
        Colors.add("white");
        Colors.add("red");
        Colors.add("black");
        for (String color : Colors){
            System.out.println(color);
        }
        System.out.println("-----------------");
        System.out.println("7)");



        //7)
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(15);
        num1.add(1);
        num1.add(0);
        Collections.sort(num1);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(0);
        num2.add(1);
        num2.add(15);
        Collections.sort(num2);
        if (num1.equals(num2)){
            System.out.println("num 1 equal to num 2");
        }
        System.out.println("-----------------");
        System.out.println("8)");




        //8)

        ArrayList<Integer> num = new ArrayList<>();
        num.add(555);
        num.add(1);
        num.add(15);
        num.set(1,3333);
        System.out.println(num);
        System.out.println("-----------------");
        System.out.println("9)");



        //9)
        LinkedList<String> water = new LinkedList<>();
        water.add("samal");
        water.add("bonaqua");
        water.add("voda");
        System.out.println(water.getFirst() + " " + water.getLast());
        System.out.println("-----------------");
        System.out.println("10)");



        //10)

        Collections.swap(water,0,2);
        System.out.println(water);
        System.out.println("-----------------");
        System.out.println("11)");


        //11)
        HashSet<String> cars = new HashSet<>();
        cars.add("bmw");
        cars.add("toyota");
        cars.add("mclaren");
        HashSet<String> cars2 = new HashSet<>();
        cars.add("mercedes");
        cars.add("toyota");
        cars.add("nissan");
        if (cars.equals(cars2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        HashSet<String> bothcars = new HashSet<>(cars);
        bothcars.retainAll(cars2);
        System.out.println(bothcars);
        System.out.println("-----------------");
        System.out.println("12)");


        //12)
        if (bothcars.isEmpty())
        {
            System.out.println("this set is empty");
        }
        else{
            System.out.println("not empty");
        };
        System.out.println("-----------------");
        System.out.println("13)");


        //13)

       HashMap<String, String> country = new HashMap<>();
       HashMap<String, String> empty_country = new HashMap<>();
       country.put("USA", "France") ;
       country.put("Italy", "Spain") ;
       empty_country.putAll(country);
        System.out.println(empty_country);
        System.out.println("-----------------");
        System.out.println("14)");


        //14)
        HashMap<Integer, String> colorr = new HashMap<>();
        colorr.put(1, "Green");
        colorr.put(2, "Red");
        colorr.put(3, "White");
        if (colorr.containsValue("Red")) {
            System.out.println("true");
        }























    }

    //4)
     static class Student{
        int grade;
        public void grade() {
            ArrayList<Integer> Stud2 = new ArrayList<>();
            Stud2.add(70);
            for (Integer stud2 : Stud2){
                System.out.println(stud2);
            }
        }


    }




    }

