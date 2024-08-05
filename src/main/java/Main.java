import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option=0;

        do{
            System.out.println("---------------");
            System.out.println("Messages App");
            System.out.println("1. Create message");
            System.out.println("2. Get messages");
            System.out.println("3. Update message");
            System.out.println("4. Delete message");
            System.out.println("5. Exit");

            // Read the option
            option = sc.nextInt();

            switch (option){
                case 1:
                    ServiceMessages.createMessage();
                    break;
                case 2:
                    ServiceMessages.getMessages();
                    break;
                case 3:
                    ServiceMessages.updateMessage();
                    break;
                case 4:
                    ServiceMessages.deleteMessages();
                    break;
                default:
                    break;
            }
        }while (option != 5);
    }
}