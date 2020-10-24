package homeWork8;

import homeWork8.Exception.NotEnoughMoneyException;
import homeWork8.Exception.UnknownAccountException;

import java.sql.Connection;
import java.sql.SQLException;

public interface AccountService {

    void withdraw(int accountId, int amount, Connection connection) throws SQLException,NotEnoughMoneyException,UnknownAccountException;

    void balance(int accountId, Connection connection) throws SQLException,UnknownAccountException;

    void deposit(int accountId, int amount, Connection connection) throws SQLException,UnknownAccountException;

    void transfer(int indexFrom, int indexTo, int amount, Connection connection) throws SQLException,NotEnoughMoneyException,UnknownAccountException;
}
