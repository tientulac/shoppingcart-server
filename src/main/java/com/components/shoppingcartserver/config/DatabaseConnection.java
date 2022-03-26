package com.components.shoppingcartserver.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final static String DATABASE_URL_FORMAT = "jdbc:mysql://127.0.0.1/shopping-cart?user=root";
    private final static String DATABASE_SERVER = "localhost";
    private final static int DATABASE_PORT = 8080;
    private final static String DATABASE_NAME = "shopping-cart";
    private final static String DATABASE_USER = "root";
    private final static String DATABASE_PWD = "";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(String.format(DATABASE_URL_FORMAT, DATABASE_SERVER, DATABASE_PORT, DATABASE_NAME), DATABASE_USER, DATABASE_PWD);
                System.out.println("Create connection success");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        }
        return connection;
    }
}
