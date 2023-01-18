package hw_9;

public class Test {
    public static void main(String[] args) {
        System.out.println("1)");
        Student stud = new Student();
        stud.setId(1);
        stud.setName("Vlad");
        stud.setYear(2023);
        System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getYear());
        stud.setId(2);
        stud.setName("Simple");
        stud.setYear(2024);
        System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getYear());
        System.out.println("----------------------");
        System.out.println("2)");


        //2
        StarTriangle star = new StarTriangle();
        star.printTriangle();
        System.out.println("-----------------------");



        //3)
        System.out.println("3)");
        System.out.println("input a: ");
        Square sq = new Square();
        System.out.println(sq.findSquare());
        System.out.println("------------------------");


        //4)
        Temperature temp = new Temperature();
        temp.setTemp(100);
        temp.setF("F");
        temp.changeDegrees_FtoC();
        temp.getF();


        temp.setTemp(37.777);
        temp.changeDegrees_CtoF();








    }



    static class Student {
        private String name;
        private int id;
        private int year;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }


    }
}
