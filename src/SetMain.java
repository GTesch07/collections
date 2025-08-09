import java.util.HashSet;
import java.util.Set;

import tesch.guilherme.models.User;

public class SetMain {
    public static void main(String[] args) {
        Set<User> users = new HashSet();
        users.add(new User(1, "João"));
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Juca"));
        users.add(new User(4, "Leo"));

        System.out.println(users.contains(new User(1, "Jão;")));
    }
}
