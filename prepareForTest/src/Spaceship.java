import java.util.Scanner;

public class Spaceship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Shirok =Double.parseDouble(scan.nextLine());
        double Dulug = Double.parseDouble(scan.nextLine());
        double Visok = Double.parseDouble(scan.nextLine());
        double RustNaAstronafti = Double.parseDouble(scan.nextLine());

        double ObemNaRuketa = Shirok * Dulug * Visok ;
        double ObemNaStaq = (RustNaAstronafti + 0.40) * 2 * 2;
        int astronauts =(int)(Math.floor(ObemNaRuketa / ObemNaStaq));
        if (astronauts <=10 && astronauts >= 3) {
            System.out.printf("The spacecraft holds %d astronauts.", astronauts);
        }else if (astronauts < 3) {
            System.out.println("The spacecraft is too small.");
        }else {
            System.out.println("The spacecraft is too big.");
        }



    }
}
