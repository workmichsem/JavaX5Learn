package homeWork8;

import java.sql.*;

public class MainTask {
    public static void main(String[] args) throws SQLException {
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.startDBConnection();

        ManageAccount manageAccount = new ManageAccount();
        manageAccount.balance(102,connection);
        manageAccount.withdraw(102, 50,connection);
        manageAccount.balance(102, connection);
        manageAccount.deposit(102, 100,connection);
        manageAccount.balance(102,connection);
       manageAccount.balance(105,connection);
        manageAccount.transfer(102, 105, 1000,connection);
        manageAccount.balance(102, connection);
        manageAccount.balance(105, connection);
    }
}