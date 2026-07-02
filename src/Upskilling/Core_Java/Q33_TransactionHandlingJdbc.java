package Upskilling.Core_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q33_TransactionHandlingJdbc {
    private static final String URL = "jdbc:sqlite:bank.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            AccountTransferService service = new AccountTransferService(URL);
            service.createTables();
            service.seedAccounts();
            service.transfer(1, 2, 100.0);
            System.out.println("Transfer completed.");
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Transaction error: " + exception.getMessage());
        }
    }
}

class AccountTransferService {
    private final String url;

    AccountTransferService(String url) {
        this.url = url;
    }

    void createTables() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS accounts (id INTEGER PRIMARY KEY, balance REAL NOT NULL)";
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.execute();
        }
    }

    void seedAccounts() throws SQLException {
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement insert = connection.prepareStatement("INSERT OR IGNORE INTO accounts (id, balance) VALUES (?, ?)") ) {
            insert.setInt(1, 1);
            insert.setDouble(2, 1000.0);
            insert.executeUpdate();

            insert.setInt(1, 2);
            insert.setDouble(2, 500.0);
            insert.executeUpdate();
        }
    }

    void transfer(int fromAccountId, int toAccountId, double amount) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url)) {
            connection.setAutoCommit(false);

            try (PreparedStatement debit = connection.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = connection.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromAccountId);
                credit.setDouble(1, amount);
                credit.setInt(2, toAccountId);

                debit.executeUpdate();
                credit.executeUpdate();

                connection.commit();
            } catch (SQLException exception) {
                connection.rollback();
                throw exception;
            } finally {
                connection.setAutoCommit(true);
            }
        }
    }
}
