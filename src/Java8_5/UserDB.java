package Java8_5;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> userDB = new ArrayList<>();
   static  {
        userDB.add(new User("user1", "pass1", true));
        userDB.add(new User("user2", "pass2", false));
    }

    public static List<User> getUserDB() {
        return userDB;
    }
}
