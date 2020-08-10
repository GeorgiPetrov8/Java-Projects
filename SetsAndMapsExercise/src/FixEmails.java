import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> emailsMap = new LinkedHashMap<>();

        String name = "";
        while (!(name=scan.nextLine()).equals("stop")) {

            String email = scan.nextLine();
            char lastChar = email.charAt(email.length() - 1);
            char lastLastChar = email.charAt(email.length() - 2);

            if (lastChar == 'g' && lastLastChar == 'b') {
                emailsMap.put(name, email);
            }
        }

        for (Map.Entry<String, String> entry : emailsMap.entrySet()) {
            System.out.println(String.format("%s -> %s",entry.getKey(), entry.getValue()));
        }

    }
}
