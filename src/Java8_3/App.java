package Java8_3;

public class App {
    public static void main(String[] args) {
        // Фабрика
        AccountFactory af = new AccountFactory();
        Account savingAccount = af.getAccount("saving");
        Account currentAccount = af.getAccount("current");

        savingAccount.printAccountType();
        currentAccount.printAccountType();
    }

}
