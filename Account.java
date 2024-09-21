import java.util.Scanner;

public class Account {
    String customerName;
    String customerID;
    int balance = 0;
    int previousTransaction = 0;
    Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }
    void deposit(int amount){
        if (amount > 0){
            balance=balance+amount;
            previousTransaction = amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Please enter amount greater than 0");
        }
    }
    void withdraw(int amount){
        if (amount >0 && amount < balance){
            balance=balance-amount;
            previousTransaction= -amount;
            System.out.println("Withdrawl Successful");
            System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Insuffient funds, Cannot withdraw");
        }
    }
    void getPreviousTransaction(){
        if (previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        } else if (previousTransaction<0) {
            System.out.println("Withdrawn: "+previousTransaction);
        }
        else{
            System.out.println("No Transaction occurred");
        }
    }
    void calculatelnterest (int years) {

        double interestRate = .0185; //keeping a constant rate

        double newBalance = (balance * interestRate * years) + balance; // years is received as a parameter

        System.out.println("The current interest rate is " + (100* interestRate) + "%");

        System.out.println("After" + years + " years, your balance will be: " + newBalance);

    }
    void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        System.out.print("Enter your BankID: ");
        String id=scanner.nextLine();
        Account account= new Account(name,id);
int option;
        do{
            System.out.println("\n====== Bank Menu ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Previous Transaction");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("");
                    account.displayAccountDetails();
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("");
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("");
                    account.getPreviousTransaction();
                    break;

                case 5:
                    System.out.println("");
                    System.out.print("Enter the number of years for interest calculation: ");
                    int years = scanner.nextInt();
                    account.calculatelnterest(years);
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("");
                    System.out.println("Invalid option! Please choose a valid one.");
                    break;
            }
        } while (option != 6);

        // Close the scanner
        scanner.close();
    }
}
