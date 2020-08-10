import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<BankAccount, List<Integer>> bankAccounts = new HashMap<>();

        int currentId = 0;

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Create")) {
                currentId++;
                BankAccount bankAccount = new BankAccount();
                bankAccounts.putIfAbsent(bankAccount, new ArrayList<>());
                bankAccounts.get(bankAccount).add(currentId);
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                if (bankAccounts.keySet().) {
                    id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    BankAccount.deposit(amount);
                    System.out.println("Deposited " + amount + " to ID" + id);
                } else {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);
            } else if (command.equals("GetInterest")) {
                BankAccount bankAccount = new BankAccount();
                int id = Integer.parseInt(tokens[1]);
                if (bankAccounts.containsValue(id)) {
                    double result = bankAccount.getInterestRate(Integer.parseInt(tokens[2]));
                    System.out.printf("%.2f%n", result);
                } else {
                    System.out.println("Account does not exist");
                }

            }

            input = scan.nextLine();
        }

    }
}
