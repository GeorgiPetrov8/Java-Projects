import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, List<String>> companyList = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\->");
            String companyName = tokens[0];
            String userId = tokens[1];

            companyList.putIfAbsent(companyName, new ArrayList<>());
            if (!companyList.get(companyName).contains(userId)) {
                companyList.get(companyName).add(userId);
            }
            input = scan.nextLine();
        }
        companyList
                .entrySet()
                .stream()
                .sorted()
    }
}
