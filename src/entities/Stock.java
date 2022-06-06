package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import database.ConnectionFactory;

public class Stock{
    public void insert() throws SQLException {
        Connection conn = ConnectionFactory.getConnection();
        Scanner input = new Scanner(System.in);
        
    }
}
