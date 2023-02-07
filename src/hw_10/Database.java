package hw_10;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Contact> users = new ArrayList<Contact>();
    static {
        users.add(new Contact("Drake",77745233));
        users.add(new Contact("Kendrik Lamar",77784566));
        users.add(new Contact("21 Savage",77777777));
    }

}
