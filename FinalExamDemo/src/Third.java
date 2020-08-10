import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> mealsList = new LinkedHashMap<>();
        int unlikeMeals = 0;

        String input = scan.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split("\\-");
            String command = tokens[0];
            String name = tokens[1];
            String meal = tokens[2];
            if (command.equals("Like")) {
                mealsList.putIfAbsent(name, new ArrayList<>());
                List<String> currentList = mealsList.get(name);
                if (!currentList.contains(meal)) {
                    currentList.add(meal);
                }
            } else if (command.equals("Unlike")) {
                if (!mealsList.containsKey(name)) {
                    System.out.println(String.format("%s is not at the party.", name));
                } else if (!mealsList.get(name).contains(meal)) {
                    System.out.println(String.format("%s doesn't have the %s in his/her collections.", name, meal));
                } else {
                    mealsList.get(name).remove(meal);
                    unlikeMeals++;
                    System.out.println(String.format("%s doesn't like the %s.", name, meal));
                }
            }
            input = scan.nextLine();
        }

        mealsList.entrySet().stream()
                .sorted((k1, k2) -> Integer.compare(k2.getValue().size(), k1.getValue().size()))
                .forEach(guest -> {
                    System.out.print(String.format("%s:", guest.getKey()));
                    if (guest.getValue().size() > 1) {
                    guest.getValue().stream().sorted(String::compareTo)
                            .forEach(m -> System.out.print(String.format(", %s", m)));
                    System.out.println();

                }else {
                        guest.getValue().forEach(m -> System.out.println(String.format(" %s", m)));  }
                });

        System.out.println(String.format("Unliked meals: %d", unlikeMeals));
    }


}


