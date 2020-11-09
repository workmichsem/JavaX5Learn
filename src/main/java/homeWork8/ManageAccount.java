package homeWork8;

import homeWork8.Exception.NotEnoughMoneyException;
import homeWork8.Exception.UnknownAccountException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManageAccount implements AccountService {
    public void recordReplacement(Account account, int index, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "UPDATE holders set amount = '" + account.getAmount() +
                "', holder = '" + account.getHolder() + "' where id = '" + index + "';";
        statement.executeUpdate(sql);
    }

    public Account serchAccount(int index, Connection connection) throws SQLException {
        Account buferAccount = new Account();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM holders where `id` = " + index;
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            buferAccount.setId(index);
            buferAccount.setHolder(resultSet.getString("holder"));
            buferAccount.setAmount(resultSet.getDouble("amount"));
            return buferAccount;
        } catch (UnknownAccountException e) {
            e.printStackTrace();
        }
        return null;
    }





    @Override
    public void withdraw(int accountId, int amount, Connection connection) throws SQLException {
        Account account = serchAccount(accountId, connection);
        try {
            if (account.getAmount() >= amount) {
                account.setAmount(account.getAmount() - amount);
                recordReplacement(account, accountId, connection);
            }
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void balance(int accountId, Connection connection) throws SQLException {
        Account account = serchAccount(accountId, connection);
        System.out.println(account.getAmount());
    }

    @Override
    public void deposit(int accountId, int amount, Connection connection) throws SQLException {
        Account account = serchAccount(accountId, connection);
        account.setAmount(account.getAmount() + amount);
        recordReplacement(account, accountId, connection);
    }

    @Override
    public void transfer(int indexFrom, int indexTo, int amount, Connection connection) throws SQLException {
        Account accountFrom;
        Account accountTo;
        accountFrom = serchAccount(indexFrom, connection);
        accountTo = serchAccount(indexTo, connection);
        try {
            if (accountFrom.getAmount() >= amount) {
                accountFrom.setAmount(accountFrom.getAmount() - amount);
                accountTo.setAmount(accountTo.getAmount() + amount);
                recordReplacement(accountFrom, indexFrom, connection);
                recordReplacement(accountTo, indexTo, connection);
            }
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
}