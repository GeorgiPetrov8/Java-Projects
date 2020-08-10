package WildFarm.Animals;

import WildFarm.Foods.Food;
import WildFarm.Mammal;

public class Zebra extends Mammal {
    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            this.setFoodEaten(food.getQuantity());
        } else {
            System.out.printf("%ss are not eating that type of food!%n",this.getAnimalType());
        }

    }
}
