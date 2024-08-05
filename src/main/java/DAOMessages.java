import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMessages {
    public static void  createMessage(Messages message) {
        DatabaseConnection db_connect = new DatabaseConnection();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query="INSERT INTO messages(message_text, author_name) VALUES (?,?);";
                ps=connection.prepareStatement(query);
                ps.setString(1, message.getMessage_text());
                ps.setString(2, message.getAuthor_name());
                ps.executeUpdate();
                System.out.println("message created successfully");
            }catch(SQLException error){
                System.out.println(error);
            }
        }catch (SQLException error){
            System.out.println(error);
        }
    }

    public static void getMessagesDB(){
        DatabaseConnection db_connect = new DatabaseConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = db_connect.get_connection()) {
            String query = "SELECT * FROM messages;";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("message_id"));
                System.out.println("Message: " + rs.getString("message_text"));
                System.out.println("Author: " + rs.getString("author_name"));
                System.out.println("Date: " + rs.getString("created_at"));
            }
        } catch (SQLException error){
            System.out.println("Messages not found");
            System.out.println(error);
        }
    }
    public static void deleteMessageDB(int message_id){
        DatabaseConnection db_connect = new DatabaseConnection();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query="DELETE FROM messages WHERE message_id = ?";
                ps=connection.prepareStatement(query);
                ps.setInt(1, message_id);
                ps.executeUpdate();
                System.out.println("message deleted successfully");
            }catch(SQLException error){
                System.out.println(error);
            }
        }catch (SQLException error){
            System.out.println(error);
        }
    }
    public static void updateMessageDB(Messages message){
        DatabaseConnection db_connect = new DatabaseConnection();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query="UPDATE messages SET message_text = ? WHERE message_id = ?;";
                ps=connection.prepareStatement(query);
                ps.setString(1, message.getMessage_text());
                ps.setInt(2, message.getMessage_id());
                ps.executeUpdate();
                System.out.println("message updated successfully");
            }catch(SQLException error){
                System.out.println(error);
            }
        }catch (SQLException error){
            System.out.println(error);
        }
    }

}
