import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<String>> courses = new TreeMap<>();
        String input = scan.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split("\\:");
            String type = tokens[0];
            String nameOfStudent = tokens[1];

            courses.putIfAbsent(type, new ArrayList<>());
            List<String> listOfNames = courses.get(type);
            listOfNames.add(nameOfStudent);
            courses.put(type, listOfNames);

            input = scan.nextLine();
        }

        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(String.format("%s:%d", e.getKey(), e.getValue().size()));
                    e.getValue().stream().sorted(String::compareTo).forEach(p -> System.out.println(String.format("--%s", p)));
                });
    }
}


