package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorDatabase {
    static Connection connection;

    public static Connection openConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "NaBa@1423");
            System.out.println("Connected to Doctor databse...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
