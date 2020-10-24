package homeWork8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
    Connection connection = null;
    Statement statement = null;
    String schemaSqlFilePath = "./src/main/java/homeWork8/DBFiles/schema.sql";
    String dataSqlFilePath = "./src/main/java/homeWork8/DBFiles/data.sql";

    public Connection startDBConnection() throws SQLException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        connection = DriverManager.getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM '" + schemaSqlFilePath
                + "'\\;" + "RUNSCRIPT FROM '" + dataSqlFilePath + "'");
        return connection;
    }

    public void stopDB() throws SQLException {
        statement.close();
        connection.close();
    }
}
