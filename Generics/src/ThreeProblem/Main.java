package ThreeProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split("\\s+");
        Threeuple<String,String,String> tuple = new Threeuple<>(firstLine[0] + " " +  firstLine[1],
                firstLine[2],firstLine[3]);
        tuple.print();

        String[] secondLine = scan.nextLine().split("\\s+");
        Threeuple<String,Integer,String> tuple1 = new Threeuple<>(secondLine[0],
                Integer.parseInt(secondLine[1]), secondLine[2]);
        tuple1.print();

        String[] thirdLIne = scan.nextLine().split("\\s+");
        Threeuple<String,Double,String> tuple2 = new Threeuple<>(thirdLIne[0],
                Double.parseDouble(thirdLIne[1]),thirdLIne[2]);
        tuple2.print();
    }
}
