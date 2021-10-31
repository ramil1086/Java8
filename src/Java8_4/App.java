package Java8_4;

public class App {
    public static void main(String[] args) {
        Bank bankA = new BankA(new CurrentAccount());
        Account current  = bankA.openAccount();
        current.printAccountType();

        Bank bankB = new BankB(new SavingAccount());
        Account saving = bankB.openAccount();
        saving.printAccountType();
    }
}
