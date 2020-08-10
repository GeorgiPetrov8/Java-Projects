import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOFSushi =scan.nextLine();
        String restaurant =scan.nextLine();
        int portion = Integer.parseInt(scan.nextLine());
        String online = scan.nextLine();
        double price = 0;
        double total = 0;

        switch (restaurant) {
            case "Sushi Zone" :
                switch (typeOFSushi) {
                    case "Sashimi" :
                        price = 4.99;
                        break;
                    case "Maki" :
                        price = 5.29;
                        break;
                    case "Uramaki" :
                        price = 5.99;
                        break;
                    case "Temaki" :
                        price = 4.29;
                        break;
                    default:
                        break;

                }break;
            case "Sushi Time" :
                switch (typeOFSushi) {
                    case "Sashimi" :
                        price = 5.49;
                        break;
                    case "Maki" :
                        price = 4.69;
                        break;
                    case "Uramaki" :
                        price = 4.49;
                        break;
                    case "Temaki" :
                        price = 5.19;
                        break;
                    default:
                        break;
                }break;
            case "Sushi bar" :
                switch (typeOFSushi) {
                    case "Sashimi" :
                        price = 5.25;
                        break;
                    case "Maki" :
                        price = 5.55;
                        break;
                    case "Uramaki" :
                        price = 6.25;
                        break;
                    case "Temaki" :
                        price = 4.75;
                        break;
                    default:
                        break;
                }break;
            case "Asian Pub" :
                switch (typeOFSushi) {
                    case "Sashimi" :
                        price = 4.50;
                        break;
                    case "Maki" :
                        price = 4.80;
                        break;
                    case "Uramaki" :
                        price = 5.50;
                        break;
                    case "Temaki" :
                        price = 4.50;
                        break;
                    default:
                        break;
                }break;

        }if (restaurant.equals("Sushi Zone") || restaurant.equals("Sushi Time") || restaurant.equals("Sushi Bar") || restaurant.equals("Asian Pub")) {
            if (typeOFSushi.equals("Shashimi")){
                total = price * portion;
            }else if (typeOFSushi.equals("Maki")){
                total = price * portion;
            }else if (typeOFSushi.equals("Uramaki")){
                total = price * portion;
            }else if (typeOFSushi.equals("Temaki")){
                total = price * portion;
            }if (online.equals("Y")){
                total = total * 0.20 + total;
            }
            System.out.printf("Total price: %d lv.",(int)Math.ceil(total));
        }else {
            System.out.printf("%s is invalid restaurant", restaurant);
        }

        }

    }