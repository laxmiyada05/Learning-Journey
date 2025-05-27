import java.sql.*;
public class JdbcSelectExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // or use SQLite: jdbc:sqlite:test.db
        String user = "root";
        String password = "password";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
