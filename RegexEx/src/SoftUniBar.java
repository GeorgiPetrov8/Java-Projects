import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(", ");// IVan, Pesho, Georgi
        HashMap<String, Integer> results = new LinkedHashMap<>();//Ivan 123, Pesho 100, Georgi 24
        ArrayList<String> racers = new ArrayList<>(Arrays.asList(data));//Ivan, Pesho, Georgi
        Pattern letterPattern = Pattern.compile("[a-z]|[A-Z]");//da namira vsichki bukvi
        Pattern digitPattern = Pattern.compile("[0-9]");//Da namira vsichki cifri
        String input = scan.nextLine();//regixa
        while (!"end of race".equals(input)) {// Dokato ne poluchi "end of race" da se povtarq
            //G4e@55or%6g6!68e!!@ - George
            Matcher nameMatcher = letterPattern.matcher(input);//Matchava po bukva
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {//Dokato namira bukva da go dobavq v SBto;
                name.append(nameMatcher.group());//Dobavqme q
            }

            if (racers.contains(name.toString())) {//Ako lista racers sudurja imeto
                results.putIfAbsent(name.toString(), 0);//sloji imeto ako go nqma v Map
                int oldKm = results.get(name.toString());//dai mu starite km ako go nqma mu sloji "0"
                int newKm = 0;//Purvonachalno sa "0"
                //G4e@55or%6g6!68e!!@ - George
                Matcher digitMatcher = digitPattern.matcher(input);//Matchavai po cifra
                while (digitMatcher.find()) {// dokato Matchvash Cifri
                    newKm += Integer.parseInt(digitMatcher.group());//Dobavqi gi kum noviteKM
                }

                results.put(name.toString(), oldKm + newKm);//Dobavi gi v Map pri tekushtoto ime
            }

            input = scan.nextLine();// Produlji nanovo dokato ne dadesh end of the race
        }
        int[] number = {1}; // List ->
        results
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))//Sortirame gi ot PO golqmo kum po malko
                .limit(3)//ogrranichavame gi do max 3
                .forEach(r -> {// za vseki kluch
                    switch (number[0]) {
                        case 1:
                            System.out.println(String.format("1st place: %s", r.getKey()));
                            break;
                        case 2:
                            System.out.println(String.format("2nd place: %s", r.getKey()));
                            break;
                        case 3:
                            System.out.println(String.format("3rd place: %s", r.getKey()));
                            break;
                    }
                    number[0]++;
                });
    }
}