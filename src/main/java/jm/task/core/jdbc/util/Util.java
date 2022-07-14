package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3308/mydb";
    private static final String USER = "root";
    private static final String PASS  = "root";

    public static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connection established");
        } catch (SQLException ex) {
            System.out.println("Connection not established");
            ex.printStackTrace();
        }
    }
}

