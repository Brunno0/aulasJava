import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Start Game");
            System.out.println("2. View Settings");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Starting...");
            } else if (choice == 2) {
                System.out.println("Opening settings...");
            }
        } while (choice != 3);

        System.out.println("Goodbye!");
        scanner.close();
    }
}

