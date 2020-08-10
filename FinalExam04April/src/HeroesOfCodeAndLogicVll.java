import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogicVll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> hpMap = new TreeMap<>();
        TreeMap<String, Integer> mpMap = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());
        int hpCapacity = 100;
        int mpCapacity = 200;

        for (int i = 0; i < n; i++) {
            String hero = scan.nextLine();
            String[] tokens = hero.split("\\s+");
            String name = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);
            hpMap.put(name, Math.min(hp, 100));
            mpMap.put(name, Math.min(mp, 200));
        }
        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split(" - ");
            switch (tokens[0]) {
                case "CastSpell":
                    String heroName = tokens[1];
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if (mpMap.get(heroName) >= mpNeeded) {
                        int mpLeft = mpMap.get(heroName) - mpNeeded;
                        mpMap.put(heroName, mpLeft);
                        System.out.println(String.format("%s has successfully cast %s and now has %d MP!",
                                heroName, spellName, mpLeft));
                    } else {
                        System.out.println(String.format("%s does not have enough MP to cast %s!", heroName, spellName));
                    }
                    break;
                case "TakeDamage":
                    String nameHero = tokens[1];
                    int dmg = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int hpLeft = hpMap.get(nameHero) - dmg;
                    if (hpLeft <= 0) {
                        hpMap.remove(nameHero);
                        mpMap.remove(nameHero);
                        System.out.println(String.format("%s has been killed by %s!", nameHero, attacker));
                    } else {
                        hpMap.put(nameHero, hpLeft);
                        System.out.println(String.format("%s was hit for %d HP by %s and now has %d HP left!",
                                nameHero, dmg, attacker, hpLeft));
                    }
                    break;
                case "Recharge":
                    String nameHero1 = tokens[1];
                    int amount = Integer.parseInt(tokens[2]);
                    if (amount + mpMap.get(nameHero1) >= mpCapacity) {
                        int amountRecovered = mpCapacity - mpMap.get(nameHero1);
                        mpMap.put(nameHero1, 200);
                        System.out.println(String.format("%s recharged for %d MP!", nameHero1, amountRecovered));
                    } else {
                        int newMp = mpMap.get(nameHero1) + amount;
                        mpMap.put(nameHero1, newMp);
                        System.out.println(String.format("%s recharged for %d MP!", nameHero1, amount));
                    }
                    break;
                case "Heal":
                    String healName = tokens[1];
                    int amountHeal = Integer.parseInt(tokens[2]);
                    if (amountHeal + hpMap.get(healName) >= hpCapacity) {
                        int amountHealRecovered = hpCapacity - hpMap.get(healName);
                        hpMap.put(healName, 100);
                        System.out.println(String.format("%s healed for %d HP!", healName, amountHealRecovered));
                    } else {
                        int newHp = hpMap.get(healName) + amountHeal;
                        hpMap.put(healName, newHp);
                        System.out.println(String.format("%s healed for %d HP!", healName, amountHeal));
                    }
                    break;
            }
            command = scan.nextLine();
        }
        hpMap.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(k -> {
                    System.out.println(String.format("%s", k.getKey()));
                    System.out.println(String.format("  HP: %d", k.getValue()));
                    System.out.println(String.format("  MP: %d", mpMap.get(k.getKey())));

                });
    }
}