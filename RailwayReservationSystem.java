import java.sql.*;

public class RailwayReservationSystem {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/your_database_name";
    static final String USER = "your_database_username";
    static final String PASS = "your_database_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            
            String username = "user_input_username";
            String password = "user_input_password";
            String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } 
        } 
    }
}