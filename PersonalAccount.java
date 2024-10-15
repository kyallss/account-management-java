import java.util.ArrayList;

public class PersonalAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
    public ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        Amount deposit = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(deposit);
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
            return;
        }

        Amount withdrawal = new Amount(amount, TransactionType.WITHDRAWAL);
        transactions.add(withdrawal);
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
