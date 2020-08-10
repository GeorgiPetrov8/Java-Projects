import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, List<String>> bandMembers = new TreeMap<>();
        TreeMap<String, Integer> playedTime = new TreeMap<>();

        String command = scan.nextLine();
        while (!command.equals("start of concert")) {
            String[] tokens = command.split("; ");
            switch (tokens[0]) {
                case "Add":
                    String bandName = tokens[1];
                    String[] names = tokens[2].split(", ");
                    bandMembers.putIfAbsent(bandName, new ArrayList<>());
                    for (String name : names) {
                        if (!bandMembers.get(bandName).contains(name)) {
                            bandMembers.get(bandName).add(name);
                        }
                    }
                    break;
                case "Play":
                    String bandName2 = tokens[1];
                    int time = Integer.parseInt(tokens[2]);
                    playedTime.putIfAbsent(bandName2, 0);
                    int lastCount = playedTime.get(bandName2);
                    playedTime.put(bandName2,lastCount + time);
                    break;
            }
            command = scan.nextLine();
        }
        int totalTime = 0;
        for (int time : playedTime.values()) {
            totalTime += time;
        }
        System.out.println(String.format("Total time: %d", totalTime));
        playedTime.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue(),t1.getValue()))
                .forEach(t -> System.out.println(String.format("%s -> %d", t.getKey(), t.getValue())));

        String inputBand = scan.nextLine();
        bandMembers.entrySet().stream()
                .filter(v -> v.getKey().equals(inputBand))
                .forEach(v -> {
                    System.out.println(v.getKey());
                    v.getValue().forEach(s -> System.out.println(String.format("=> %s", s)));
                });

    }
}

//Working! 100/100 :)))