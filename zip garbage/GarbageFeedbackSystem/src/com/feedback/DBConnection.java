package com.feedback;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/garbage_feedback";
            String user = "root";
            String pass = "Lorry@123"; // 🔁 Change this to your actual password

            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e);
            return null;
        }
    }
}
