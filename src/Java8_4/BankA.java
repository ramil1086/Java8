package Java8_4;

public class BankA extends Bank{
    public BankA(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("BankA");
        System.out.println("Opened account");
        return account;
    }
}
