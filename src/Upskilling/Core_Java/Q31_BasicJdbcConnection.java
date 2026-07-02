package Upskilling.Core_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q31_BasicJdbcConnection {
    private static final String URL = "jdbc:sqlite:students.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ignored) {
        }

        String createTable = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT NOT NULL)";
        String selectQuery = "SELECT id, name FROM students";

        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement()) {
            statement.execute(createTable);

            try (ResultSet resultSet = statement.executeQuery(selectQuery)) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + ": " + resultSet.getString("name"));
                }
            }
        } catch (SQLException exception) {
            System.out.println("JDBC error: " + exception.getMessage());
        }
    }
}
