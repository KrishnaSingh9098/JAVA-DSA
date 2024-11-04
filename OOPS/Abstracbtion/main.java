package OOPS.Abstracbtion;
public class main {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("123456789", 500.0);
        
        // Display the account number and balance
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());

        // Perform some transactions
        account.deposit(150.0);
        System.out.println("New Balance: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("New Balance: " + account.getBalance());

        account.withdraw(500.0); // Attempt to withdraw more than the balance
    }
}
