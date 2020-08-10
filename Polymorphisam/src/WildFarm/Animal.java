package WildFarm;

import WildFarm.Foods.Food;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalType, String animalName,
                  Double animalWeight) {
      this.setAnimalType(animalType);
      this.setAnimalName(animalName);
      this.setAnimalWeight(animalWeight);
      this.foodEaten = 0;
    }

    private void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    protected abstract void makeSound();
    protected abstract void eat(Food food);

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
}
