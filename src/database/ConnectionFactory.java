package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory {

    private static String url = "jdbc:mysql://localhost:3000/cantina";
    private static String user = "root";
    private static String password = "#Gui301203";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
