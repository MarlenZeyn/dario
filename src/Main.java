public class Main {
    public static void main(String[] args) {

        //      1)
        Student stud = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student stud2 = new Student("Азамат", "samat", "Коктем-1", 25);
        Student stud3 = new Student("Кристина", "Кристина", "Коктем-3", 23);
        System.out.println(stud);
        System.out.println(stud2);
        System.out.println(stud3);
        System.out.println("---------");

        //     2)
        Triangle tri = new Triangle(3, 4, 5);
        System.out.println(tri);
        System.out.println("---------");


        //    3)
        Rectangle rec = new Rectangle();
        System.out.println(rec.findPer(5, 9) + " " + rec.findArea(5, 9));
        System.out.println(rec.findPer(10, 14) + " " + rec.findArea(10, 14));
        System.out.println("------------");


        //    4)
        Average avg = new Average();
        System.out.println(avg.findAvg(5,5,5));
        System.out.println("------------");


       //     5)
       Movie mov = new Movie("Фокус","RatPac-Dune Entertainment", "R");
        Movie mov2 = new Movie("Главный герой","20th Century Studio");
       System.out.println(mov.title + " " + mov.studio + " " + mov.rating);
        System.out.println(mov2.title + " " + mov2.studio + " " + mov2.rating);







    }
}




//         1)
class Student {

    String name;
    String surname;
    String address;
    int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String toString() {
        return name + " " + surname + " " + address + " " + id;
    }
}



