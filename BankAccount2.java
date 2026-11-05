class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}

public class BankAccount2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", 1000);

       
        account.deposit(500);

       
        account.withdraw(300);

        
        account.withdraw(1500);

       
        System.out.println("Final balance: " + account.getBalance());
    }
}