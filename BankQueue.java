import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    private Queue<Customer> queue;
    private int customerCounter;

    public BankQueue() {
        queue = new LinkedList<>();
        customerCounter = 1;
    }

    public void addCustomer(String name) {
        Customer newCustomer = new Customer(name, customerCounter++);
        queue.add(newCustomer);
        System.out.println("\nCustomer added: " + newCustomer);
    }

    public void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("\nNo customers in queue.");
        } else {
            Customer served = queue.poll();
            System.out.println("\nNow serving: " + served);
        }
    }

    public void viewQueue() {
        if (queue.isEmpty()) {
            System.out.println("\nThe queue is empty.");
        } else {
            System.out.println("\nCurrent Queue:");
            for (Customer c : queue) {
                System.out.println("- " + c);
            }
        }
    }
}
