package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> allBankAcc = new HashMap<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String command = tokens[0];
            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    allBankAcc.put(bankAccount.getId(), bankAccount);
                    break;
                case "Deposit":
                    int idToFind = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (allBankAcc.containsKey(idToFind)) {
                        allBankAcc.get(idToFind).deposit(amount);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int neededId = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (allBankAcc.containsKey(neededId)) {
                        double result = allBankAcc.get(neededId).getInterestRate(years);
                        System.out.printf("%.2f%n", result);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scan.nextLine();
        }
    }
}
