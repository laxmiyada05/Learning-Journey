import java.sql.*;
public class BankTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        try (Connection conn = DriverManager.getConnection(url, "root", "password")) {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                debit.setDouble(1, 100.0);
                debit.setInt(2, 1);
                debit.executeUpdate();
                credit.setDouble(1, 100.0);
                credit.setInt(2, 2);
                credit.executeUpdate();
                conn.commit();
                System.out.println("Transaction successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
