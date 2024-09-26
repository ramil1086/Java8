package Java8_7;

public class TransferController {
private TransferService transferService = new TransferService();

public String transferMoney(int accountFrom, int AccountTo, long amount) {
    transferService.transferMoney(accountFrom, AccountTo, amount);
    return "Transfered";
}
}
