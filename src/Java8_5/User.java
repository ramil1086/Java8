package Java8_5;public class User {
    private String login;
    private String password;
    private boolean paymentStatus;

    public User(String login, String password, boolean paymentStatus) {
        this.login = login;
        this.password = password;
        this.paymentStatus = paymentStatus;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

}
