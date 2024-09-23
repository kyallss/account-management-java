public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Kyial Asykpaeva");

        account.deposit(500.00);
        account.withdraw(200.00);
        account.deposit(300.00);
        account.withdraw(1000.00);


        account.printTransactionHistory();

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}
