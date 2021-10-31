package Java8_4;

import Java8_4.Account;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("Opened SAVING ACCOUNT");
        return new SavingAccount();
    }

    @Override
    public void printAccountType() {
        System.out.println("This is SAVING ACCOUNT");
    }
}
