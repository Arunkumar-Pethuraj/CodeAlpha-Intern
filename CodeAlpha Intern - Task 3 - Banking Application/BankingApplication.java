import java.util.Scanner;

public class BankingApplication {

    private double balance;
    private Scanner scanner;

    public BankingApplication(double balance) {
        this.balance = balance;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nWelcome to Banking Application\n");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Exiting the Application.");
                    return;
                default:
                    System.out.println("\"Invalid choice\", Please enter again.");
            }
        }
    }

    private void checkBalance() {
        System.out.println("\nYour current balance is : " + balance);
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit : ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("\"Deposit successful\", Your new balance is : " + balance);
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw : ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("\"Insufficient balance\", Please enter a smaller amount.");
        } else {
            balance -= amount;
            System.out.println("\"Withdrawal successful\", Your new balance is: " + balance);
        }
    }

    public static void main(String[] args) {
        BankingApplication app = new BankingApplication(500);
        app.start();
    }
}
