package ProblemTuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split("\\s+");
        Tuple<String,String> tuple = new Tuple<>(firstLine[0] + " " +  firstLine[1],firstLine[2]);
        tuple.print();

        String[] secondLine = scan.nextLine().split("\\s+");
        Tuple<String,Integer> tuple1 = new Tuple<>(secondLine[0], Integer.parseInt(secondLine[1]));
        tuple1.print();

        Tuple<Integer,Double> tuple2 = new Tuple<>(scan.nextInt(),scan.nextDouble());
        tuple2.print();
    }
}
