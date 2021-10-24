package Java8_4;

public class BankB extends Bank {
    public BankB(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("BankB");
        System.out.println("Opened account");
        return account;
    }
}
