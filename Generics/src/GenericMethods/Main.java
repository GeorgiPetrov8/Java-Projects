package GenericMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Box<String>> boxList = new ArrayList<>();
        while (n-- > 0) {
            String name = scan.nextLine();
            Box<String> box = new Box<>(name);

            boxList.add(box);
        }

        String value =scan.nextLine();

        System.out.println(counter(boxList, value));


    }

    private static<T extends Comparable<T>> int counter(List<Box<T>> boxList, T value) {
        int counter = 0;
        for (int i = 0; i < boxList.size(); i++) {
          int result = boxList.get(i).value.compareTo(value);
          if (result > 0) {
              counter++;
          }
        }
        return counter;
    }
}
