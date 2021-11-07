package Java8_7;

public class Account {
    private String name;
    private long accountNumber;
    private long money;

    public Account(String name, long accountNumber, long money) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
}
