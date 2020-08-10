package StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine().replaceAll(",","");
        String[] toAdd = Arrays.stream(line.split("\\s+")).skip(1).toArray(String[]::new);
        CustomStack customStack = new CustomStack(toAdd);

        String input = scan.nextLine();
        while (!input.equals("END")) {

            if (input.contains("Pop")) {
                customStack.pop();
            } else if (input.contains("Push")) {
                String currentLine = input.replaceAll(",","");
                String[] tokensToPush = currentLine.split("\\s+");
                customStack.push(Arrays.stream(tokensToPush).skip(1).toArray(String[]::new));
            }

            input = scan.nextLine();
        }
        for (String element : customStack) {
            System.out.println(element);
        }
        for (String element : customStack) {
            System.out.println(element);
        }
    }
}
