import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int PredvidenaSuma = Integer.parseInt(scan.nextLine());
        int chovek =Integer.parseInt(scan.nextLine())
        if (chovek < 5) {
            chovek = chovek * 100;
        }else if (chovek >= 5 ){
            chovek = chovek * 70;
        }
    }
}
