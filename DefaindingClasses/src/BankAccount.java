public class BankAccount {
    private int id;
    private static double balance;
    private static double interestRate;
    private static int idCounter= 1;

    public BankAccount() {
       this.id = idCounter++;
        BankAccount.interestRate = 0.02;
        System.out.printf("Account ID%d created%n", this.id);
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }
    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * BankAccount.balance;
    }
    public static void deposit(double amount) {
        BankAccount.balance += amount;
    }


}
