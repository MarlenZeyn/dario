package hw_10;

public class Contact {
    String name;
    int number;


   public Contact(String name, int number){
    this.name = name;
    this.number = number;
}

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
