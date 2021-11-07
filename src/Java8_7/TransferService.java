package Java8_7;

import java.util.Map;

public class TransferService {
   private  TransferRepository tr = new TransferRepository();

    public void transferMoney(int accountFrom, int accountTo, long amount) {
Account from = tr.getAccountsList().get(1);
Account to = tr.getAccountsList().get(2);
from.setMoney(from.getMoney()-amount);
to.setMoney(to.getMoney()+amount);
tr.putAccountToMap(accountFrom,from);
tr.putAccountToMap(accountTo,to);
printValues();
    }

    public void printValues() {
        for (Map.Entry<Integer, Account> map : tr.getAccountsList().entrySet()) {
            System.out.println(map.getKey() + ":" + map.getValue().getName() + "=" + map.getValue().getMoney());
        }
    }

}
