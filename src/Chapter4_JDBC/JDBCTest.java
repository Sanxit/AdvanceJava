package Chapter4_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

    public static void main(String[] args) {

        // 1. Connecting JDBC Class - Registering Driver -> Driver Class

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Get connection from Driver Manager

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv26", "root", "");

            System.out.println("Connection successful!");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
