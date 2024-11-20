import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {
    // static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    // static final String URL = "jdbc:mysql://localhost:3306/game_project";
    // static final String USER = "root";
    // static final String PWD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {

            // STEP 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP 2: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/game_project", "root","root");

            // STEP 3: Create a statement
            System.out.println("Creating statement...");
            
            statement = connection.createStatement();
            String sql = "SELECT * FROM user";

            // STEP 4: Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            // STEP 5: Extract data from result set
            while (resultSet.next()) {
                // Retrieve data by column name
                int id = resultSet.getInt("id");
                String username = resultSet.getString("uname");

                // Display values
                System.out.print("ID: " + resultSet.getInt("id"));
                System.out.print(", Username: " + username);
            }

            // STEP 6: Clean up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException excepObject) {
            // Handle JDBC errors
            excepObject.printStackTrace();
        } finally {
            // Close resources if they were opened
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        System.out.println("Goodbye!");

    }

}
