package homeWork7;

import homeWork7.Exception.NotEnoughMoneyException;
import homeWork7.Exception.UnknownAccountException;

public class ManageAccount implements AccountService {
    String fileName = "./src/main/java/homeWork7/data.xml";
    Accounts unmarshData = JaxbWorker.unmarshalXML(fileName);

    public void recordReplacement(Account account, int index) {
        unmarshData.accounts.remove(index);
        unmarshData.accounts.add(account);
        JaxbWorker.marshalXLM(unmarshData, fileName);
    }

    public Account serchAccount(int index) {
        Account buferAccount;
        for (int i = 0; i < unmarshData.accounts.size(); i++) {
            buferAccount = (Account) unmarshData.accounts.get(i);
            try {
                if (buferAccount.getId() == index) {
                    return buferAccount;
                }
            } catch (UnknownAccountException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public int searchAccountIndex(int id) {
        Account buferAccount;
        int i;
        for (i = 0; i < unmarshData.accounts.size(); i++) {
            buferAccount = (Account) unmarshData.accounts.get(i);
            try {
                if (buferAccount.getId() == id) {
                    return i;
                }
            } catch (UnknownAccountException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public void withdraw(int accountId, int amount) {
        Account account = serchAccount(accountId);
        try {
            if (account.getAmount() >= amount) {
                account.setAmount(account.getAmount() - amount);
                recordReplacement(account, searchAccountIndex(accountId));

            }
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void balance(int accountId) {
        Account account = serchAccount(accountId);
        System.out.println(account.getAmount());
    }

    @Override
    public void deposit(int accountId, int amount) {
        Account account = serchAccount(accountId);
        account.setAmount(account.getAmount() + amount);
        recordReplacement(account, searchAccountIndex(accountId));
    }

    @Override
    public void transfer(int indexFrom, int indexTo, int amount) {
        Account accountFrom;
        Account accountTo;
        accountFrom = serchAccount(indexFrom);
        accountTo = serchAccount(indexTo);
        try {
            if (accountFrom.getAmount() >= amount) {
                accountFrom.setAmount(accountFrom.getAmount() - amount);
                accountTo.setAmount(accountTo.getAmount() + amount);
                recordReplacement(accountFrom, searchAccountIndex(indexFrom));
                recordReplacement(accountTo, searchAccountIndex(indexTo));
            }
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
}



