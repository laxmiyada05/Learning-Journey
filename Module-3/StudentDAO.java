import java.sql.*;
public class StudentDAO {
    private Connection conn;
    public StudentDAO(Connection conn) {
        this.conn = conn;
    }
    public void insertStudent(int id, String name, int age) throws SQLException {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.executeUpdate();
        }
    }
    public void updateStudentAge(int id, int newAge) throws SQLException {
        String sql = "UPDATE students SET age = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, newAge);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        StudentDAO dao = new StudentDAO(conn);
        dao.insertStudent(1, "Alice", 20);
        dao.updateStudentAge(1, 21);
        conn.close();
    }
}
