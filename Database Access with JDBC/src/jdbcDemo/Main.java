package jdbcDemo;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String DB_URL = "jdbc:mysql://localhost:3306/soft_uni";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter DB username (<Enter> for 'root'): ");
        String username = scan.nextLine().trim();
        username = username.length() > 0 ? username : "root";

        System.out.println("Enter DB password (<Enter> for 'root'): ");
        String password = scan.nextLine().trim();
        password = password.length() > 0 ? password : "root";

        // 1. Load DB driver.
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.printf("Database driver: '%s' not found.", DB_DRIVER);
        }
        System.out.println("Driver loaded successfully.");

        // 2. Connect to DB
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, username, password);
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
            System.exit(0);
        }
        System.out.println("Connection successfully");

        // 3. Read query params
        System.out.println("Enter query salary (<Enter> for '40000'): ");
        String salaryStr = scan.nextLine().trim();
        salaryStr = salaryStr.length() > 0 ? salaryStr : "40000";
        double salary = 40000; //default value

        try {
            salary = Double.parseDouble(salaryStr);
        } catch (NumberFormatException exception) {
            System.err.printf("Invalid number '%s'", salaryStr);
            System.exit(0);
        }

        // 4.Create prepared statement
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM employees WHERE salary > ?");
            // 5. Execute prepared statement with parameter
            ps.setDouble(1, salary);
            ResultSet rs = ps.executeQuery();

            // 6. Print result set
            while (rs.next()) {
                System.out.printf("| %10d | %-15.15s | %-15.15s | %10.2f %n",
                        rs.getLong("employee_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getDouble("salary")
                );
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }

        // 7 Close connection

        try {
            connection.close();
        } catch (SQLException sqlException) {
            System.err.println(sqlException.getMessage());
        }

    }
}
