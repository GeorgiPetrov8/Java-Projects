package BankAccount;

public class BankAccount {
    private int id;
    private static int idCounter = 1;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount() {
        id = idCounter++;
        System.out.printf("Account ID%d created%n",this.id);
    }
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposited %.0f to ID%d%n",amount,this.id);
    }
    public int getId() {
        return this.id;
    }
}
