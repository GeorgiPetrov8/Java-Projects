import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double value = Integer.parseInt(scan.nextLine());
        String inputMetric = scan.nextLine();
        String outputMetric = scan.nextLine();

        if ("mm".equals(inputMetric)) {
            value = value / 1000;

        } else if ("cm".equals(inputMetric)) {
            value = value / 100;
        } if ("mm".equals(outputMetric)) {
            value = value * 1000;
        } else if ("cm".equals(outputMetric)) {
            value = value * 100;
        }
        System.out.printf("%.3f", value);


    }
}
