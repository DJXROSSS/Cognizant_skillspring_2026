package Upskilling.Core_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q32_InsertUpdateJdbc {
    private static final String URL = "jdbc:sqlite:students.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            StudentDAO studentDAO = new StudentDAO(URL);
            studentDAO.createTable();
            studentDAO.insertStudent(1, "Alice");
            studentDAO.updateStudentName(1, "Alice Smith");
            System.out.println("Insert and update completed.");
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("JDBC error: " + exception.getMessage());
        }
    }
}

class StudentDAO {
    private final String url;

    StudentDAO(String url) {
        this.url = url;
    }

    void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT NOT NULL)";
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.execute();
        }
    }

    void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT OR REPLACE INTO students (id, name) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.executeUpdate();
        }
    }

    void updateStudentName(int id, String name) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
        }
    }
}
