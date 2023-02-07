package hw_10;

public class Dog extends Animal implements Colour {
    @Override
    public void speed() {
        int sped = 100;
        System.out.println("Dog speed is " + sped);
    }

    @Override
    public void color() {
        String color = "white";
        System.out.println("Doggy color is " + color);
    }




















   /*  Level lvl = Level.LOW;
        System.out.println(lvl);

        switch (lvl){
            case LOW -> {
                System.out.println("low lvl");
            }
            case MEDIUM -> {
                System.out.println("mid lvl");
            }
            case HIGH -> {
                System.out.println("high lvl");
            }

        }
        for (Level level : Level.values()){
            System.out.println(level);
        }
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String surname = scan.nextLine();
        int age = scan.nextInt();
        Person pers = new Person(name, surname, age);
        System.out.println(pers.toString());
*/
}
