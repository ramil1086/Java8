package Java8_4;

import Java8_4.Account;

public class CurrentAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("Opened CURRENT ACCOUNT");
        return new CurrentAccount();
    }

    @Override
    public void printAccountType() {
        System.out.println("This is CURRENT ACCOUNT");
    }
}
