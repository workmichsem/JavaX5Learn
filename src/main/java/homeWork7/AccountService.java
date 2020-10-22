package homeWork7;

import homeWork7.Exception.NotEnoughMoneyException;
import homeWork7.Exception.UnknownAccountException;

public interface AccountService {
    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void balance(int accountId) throws UnknownAccountException;

    void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;

    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException;
}
