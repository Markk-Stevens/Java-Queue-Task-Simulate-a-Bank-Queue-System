import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankQueue bankQueue = new BankQueue();
        int choice;

        do {
            System.out.println("\n--- Bank Queue Menu ---");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("\nEnter customer name: ");
                    String name = scanner.nextLine();
                    bankQueue.addCustomer(name);
                    bankQueue.viewQueue();
                    break;

                case 2:
                    bankQueue.serveCustomer();
                    bankQueue.viewQueue();
                    break;

                case 3:
                    bankQueue.viewQueue();
                    break;

                case 4:
                    System.out.println("\nExiting program.");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
