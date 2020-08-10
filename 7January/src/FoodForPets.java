import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double allFood = Double.parseDouble(scan.nextLine());

        double DogEat = 0;
        double CatEat = 0;
        double BiscuitsEaten = 0;
        double AllFoodEaten = 0;
        int counter = 0;
        for (int i = 1; i <= days; i++) {
            counter++;
            int dog = Integer.parseInt(scan.nextLine());
            int cat = Integer.parseInt(scan.nextLine());

            DogEat += dog;
            CatEat += cat;
            AllFoodEaten += dog + cat;

            if (counter == 3 || counter == 6 || counter == 9 || counter == 12 || counter == 15) {
                BiscuitsEaten += (dog + cat) * 0.10;
            }

        }
        double allFoodPercent = (AllFoodEaten / allFood) * 100;
        double allDogPercent = (DogEat / AllFoodEaten) * 100;
        double allCatPercent = (CatEat / AllFoodEaten) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", BiscuitsEaten);
        System.out.printf("%.0f%% of the food has been eaten.\n", allFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", allDogPercent);
        System.out.printf("%.2f%% eaten from the cat.", allCatPercent);

    }







    }