import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int biscuitsPerDay = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int competingFactory = Integer.parseInt(scan.nextLine());

        double biscuitsCount = 0.00;
        for (int i = 1 ; i <= 30 ; i++) {
            if (i % 3 == 0) {
                double third = biscuitsPerDay * 0.75;
                biscuitsCount += workers * third;
            } else {
                biscuitsCount += workers * biscuitsPerDay;
            }
        }
        System.out.println(String.format("You have produced %.0f biscuits for the past month.", biscuitsCount));
        if (biscuitsCount > competingFactory) {
            double percent = (biscuitsCount - competingFactory) / competingFactory;
            double diff = competingFactory - biscuitsCount;
            if (diff * 100 > percent) {
                percent *= 200;
            } else {
                percent *= 100;
            }
            System.out.println(String.format("You produce %.2f percent more biscuits.", percent));
        } else {
            double percent = (competingFactory - biscuitsCount) / competingFactory;
            double diff = competingFactory - biscuitsCount;
            if (diff * 100 > percent) {
                percent *= 200;
            } else {
                percent *= 100;
            }
            System.out.println(String.format("You produce %.2f percent less biscuits.",Math.abs(percent)));
        }
    }
}
