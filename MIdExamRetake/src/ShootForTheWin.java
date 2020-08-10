import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> shotTargets = Arrays
                .stream(scan.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        int countOfShootTargets = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index >= 0 && index <= shotTargets.size() - 1) {

                if (shotTargets.get(index) > -1) {
                    int number = shotTargets.get(index);
                    shotTargets.set(index, - 1);
                    countOfShootTargets++;

                    for (int i = 0; i < shotTargets.size() ; i++) {
                        int currentIndex = shotTargets.get(i);

                        if (currentIndex > -1) {

                            if (currentIndex > number) {
                                int result = shotTargets.get(i) - number;
                                shotTargets.set(i, result);
                            } else {
                                int result = shotTargets.get(i) + number;
                                shotTargets.set(i, result);
                            }

                        }
                    }
                }
            }

            input = scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> " , countOfShootTargets);
        for (Integer number : shotTargets ) {
            System.out.print(number + " ");
        }
    }
}

