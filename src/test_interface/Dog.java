package test_interface;

public class Dog extends Animal implements Colour{
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
}