package Java8_5;

public class LoginExistCheck extends Check{
    @Override
    public boolean check(String login, String password) {
        for (User user : UserDB.getUserDB()) {
            if (user.getLogin().equals(login))
                return checkNext(login, password);
        }
        return false;
    }
}
