import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection get_connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messageDB", "admin", "root");
        } catch (SQLException e) {
            System.out.println(e);
        }

        return  connection;
    }
}
