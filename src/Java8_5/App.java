package Java8_5;

public class App {
    public static void main(String[] args) {

        Check loginExistCheck = new LoginExistCheck();
        Check authCheck = new AuthCheck();
        Check paymentCheck = new PaymentCheck();

        Check myCheck = loginExistCheck.link(authCheck).link(paymentCheck);
        String login1 = "user1";
        String login2 = "user2";
        String pass1 = "pass1";
        String pass2 = "pass2";
        boolean result1 = myCheck.check(login1, pass1);
        boolean result2 = myCheck.check(login2, pass2);

        System.out.println("User1 resultCheck is: " + result1);
        System.out.println("User2 resultCheck is: " + result2);
    }
}
