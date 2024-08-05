import java.util.Scanner;

public class ServiceMessages {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String message = sc.nextLine();

        System.out.println("Write your name");
        String name = sc.nextLine();

        Messages record = new Messages();
        record.setMessage_text(message);
        record.setAuthor_name(name);

        DAOMessages.createMessage(record);
    }
    public static void getMessages(){
        DAOMessages.getMessagesDB();
    }
    public  static void deleteMessages() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the message id to delete");
        int message_id = sc.nextInt();
        DAOMessages.deleteMessageDB(message_id);
    }
    public static void updateMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the new message");
        String message = sc.nextLine();

        System.out.println("Type the id message to update");
        int message_id = sc.nextInt();
        Messages update = new Messages();
        update.setMessage_id(message_id);
        update.setMessage_text(message);
        DAOMessages.updateMessageDB(update);
    }
}
