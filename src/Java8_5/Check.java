package Java8_5;


public abstract class Check {
    private Check check;

    public Check link(Check check) {
        this.check = check;
        return this.check;
    }

    public abstract boolean check(String login, String password);

    protected boolean checkNext(String login, String password) {
        if (check == null) {
            return true;
        }
        return check(login, password);
    }

}
