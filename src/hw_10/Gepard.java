package hw_10;

public class Gepard extends Animal implements Colour {
    @Override
    public void speed() {
        int sped = 999;
        System.out.println("Gepard speed is " + sped);
    }

    @Override
    public void color() {
        String color = "brown";
        System.out.println("Gepard color is " + color);
    }
}
