package WildFarm.Animals;

import WildFarm.Felime;
import WildFarm.Foods.Food;

public class Tiger extends Felime {
    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            this.setFoodEaten(food.getQuantity());
        } else {
            System.out.printf("%ss are not eating that type of food!%n",this.getAnimalType());
        }
    }

}
