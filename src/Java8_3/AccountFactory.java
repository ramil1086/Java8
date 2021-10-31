package Java8_3;

public class AccountFactory {
    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new CurrentAccount();
        }
        else if (SAVING_ACCOUNT.equalsIgnoreCase(accountType)) {
            return new SavingAccount();
        }
        return null;
    }
}
