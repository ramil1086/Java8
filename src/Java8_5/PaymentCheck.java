package Java8_5;

public class PaymentCheck extends Check{
    @Override
    public boolean check(String login, String password) {

        for (User user : UserDB.getUserDB()) {
            if (user.getLogin().equals(login)) {
                if (user.isPaymentStatus()){
                    return checkNext(login, password);
                }
                return false;
            }
        }
        return false;
    }

}
