package Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Lake lake = new Lake(Arrays.stream(bf.readLine().split(", "))
                .mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));

        String output = "";
        for (Integer num : lake) {
            output += num + ", ";
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
    }
}
