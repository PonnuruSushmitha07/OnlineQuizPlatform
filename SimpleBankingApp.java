import java.util.Scanner;

public class SimpleBankingApp {
    // Class-level variable to store the account balance
    private static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Displaying the menu to the user
        do {
            System.out.println("\nWelcome to the Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            // Using a switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to handle deposit
    public static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to handle withdrawal
    public static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. You cannot withdraw more than your balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to check the balance
    public static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}
