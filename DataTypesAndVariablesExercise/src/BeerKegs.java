import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double bestVolume = - 1.0;
        String bestModel= "";


        for (int i = 0; i < n ; i++) {
            String model = scan.nextLine();
            double r = Double.parseDouble(scan.nextLine());
            int h = Integer.parseInt(scan.nextLine());


            double volume = Math.PI * Math.pow(r,2) * h;
            if (volume > bestVolume){
                bestVolume = volume;
                bestModel = model;

            }



        }
        System.out.println(bestModel);
    }
}
