
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver (optional in latest versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to database!");
            
            // Step 3: Insert Data
            String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, "Sanika More");
            pstmt.setString(2, "sanika@example.com");
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

            // Step 4: Retrieve Data
            String selectQuery = "SELECT * FROM users";
            ResultSet rs = conn.createStatement().executeQuery(selectQuery);

            System.out.println("\nUsers in Database:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email"));
            }
            // Step 5: Close Connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
