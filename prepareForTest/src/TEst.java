
import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sushiType = scanner.nextLine();
        String restorant = scanner.nextLine();
        int portions = Integer.parseInt(scanner.nextLine());
        String online = scanner.nextLine();
        double total = 0;
        double price = 0;

        switch (restorant)
        {
            case "Sushi Zone":
                switch (sushiType)
                {
                    case "sashimi":
                        price = 4.99;
                        break;
                    case "maki":
                        price = 5.29;
                        break;
                    case "uramaki":
                        price = 5.99;
                        break;
                    case "temaki":
                        price = 4.29;
                        break;
                    default:
                        break;
                }
                break;
            case "Sushi Time":
                switch (sushiType)
                {
                    case "sashimi":
                        price = 5.49;
                        break;
                    case "maki":
                        price = 4.69;
                        break;
                    case "uramaki":
                        price = 4.49;
                        break;
                    case "temaki":
                        price = 5.19;
                        break;
                    default:
                        break;
                }
                break;
            case "Sushi Bar":
                switch (sushiType)
                {
                    case "sashimi":
                        price = 5.25;
                        break;
                    case "maki":
                        price = 5.55;
                        break;
                    case "uramaki":
                        price = 6.25;
                        break;
                    case "temaki":
                        price = 4.75;
                        break;
                    default:
                        break;
                }
                break;
            case "Asian Pub":
                switch (sushiType)
                {
                    case "sashimi":
                        price = 4.50;
                        break;
                    case "maki":
                        price = 4.80;
                        break;
                    case "uramaki":
                        price = 5.50;
                        break;
                    case "temaki":
                        price = 5.50;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        if (restorant.equals("Sushi Zone") || restorant.equals("Sushi Time") || restorant.equals("Sushi Bar") || restorant.equals("Asian Pub"))
        {
            if (sushiType.equals("sashimi"))
            {
                total =portions * price;
            }
            else if (sushiType.equals("maki"))
            {
                total =portions * price;
            }
            else if (sushiType.equals("uramaki"))
            {
                total =portions * price;
            }
            else if (sushiType.equals("temaki"))
            {
                total =portions * price;
            }
            if (online.equals("Y"))
            {
                total =total * 0.20 + total;
            }
            System.out.printf("Total price: %d lv.",(int)Math.ceil(total));
        }
        else
        {
            System.out.printf("%s is invalid restaurant!", restorant);
        }
    }
}
