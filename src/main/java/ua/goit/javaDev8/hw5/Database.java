package ua.goit.javaDev8.hw5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Connection conn;

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/goit_java8_hw4";
    private static final String DB_USER_NAME = "maksbbn";
    private static final String DB_USER_PASSWORD = "qwerty";

    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_USER_PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        conn = null;
    }
}
