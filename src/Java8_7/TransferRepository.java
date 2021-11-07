package Java8_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransferRepository {
    private static Map<Integer, Account> accountMap;
    {
        accountMap = new HashMap<>();
        accountMap.put(1, new Account("user1", 123456789, 100));
        accountMap.put(2,new Account("user2", 234567890, 100));
        accountMap.put(3,new Account("user3", 345678901, 100));
    }

    public  Map<Integer, Account> getAccountsList() {
        return accountMap;
    }

    public void putAccountToMap(int id, Account account) {
        accountMap.put(id, account);
    }

}
