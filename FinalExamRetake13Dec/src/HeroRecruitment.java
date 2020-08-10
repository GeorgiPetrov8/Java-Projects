import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import java.util.TreeMap;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> heroesMap = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Enroll":
                    String heroName = tokens[1];
                    if (heroesMap.containsKey(heroName)) {
                        System.out.println(String.format("%s is already enrolled.", heroName));
                    } else {
                        heroesMap.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String heroName1 = tokens[1];
                    String spellName = tokens[2];
                    if (!heroesMap.containsKey(heroName1)) {
                        System.out.println(String.format("%s doesn't exist.",heroName1));
                    } else {
                        if (heroesMap.get(heroName1).contains(spellName)) {
                            System.out.println(String.format("%s has already learnt %s.",heroName1, spellName));
                        } else {
                            heroesMap.get(heroName1).add(spellName);
                        }
                    }
                    break;
                case "Unlearn":
                    String heroName2 = tokens[1];
                    String spellName2 = tokens[2];
                    if (!heroesMap.containsKey(heroName2)) {
                        System.out.println(String.format("%s doesn't exist.", heroName2));
                    } else {
                        if (!heroesMap.get(heroName2).contains(spellName2)) {
                            System.out.println(String.format("%s doesn't know %s.",heroName2, spellName2));
                        } else {
                            heroesMap.get(heroName2).remove(spellName2);
                        }
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println("Heroes:");
        heroesMap.entrySet().stream()
                .sorted((k1, k2)-> Integer.compare(k2.getValue().size(), k1.getValue().size()))
                .forEach(v -> {
                    System.out.println(String.format("== %s: %s",v.getKey(), v.getValue().toString()
                            .replaceAll("[\\[\\]]", "")));});



    }
}
