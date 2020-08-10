package WildFarm;

import WildFarm.Animals.Cat;
import WildFarm.Animals.Mouse;
import WildFarm.Animals.Tiger;
import WildFarm.Animals.Zebra;
import WildFarm.Foods.Food;
import WildFarm.Foods.Meat;
import WildFarm.Foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Mammal> animals = new ArrayList<>();

        String input;
        while (!(input = scan.nextLine()).equals("End")) {
            String[] tokens = input.split("\\s+");
            Mammal animal = createAnimal(tokens);

            String[] foodInput = scan.nextLine().split("\\s+");
            Food food = createFood(foodInput);

            animal.makeSound();
            animal.eat(food);
            animals.add(animal);
        }

        for (Mammal animal : animals) {
            System.out.println(animal);
        }
    }

    public static Food createFood(String[] foodInput) {
        switch (foodInput[0]) {
            case "Meat":
                return new Meat(Integer.parseInt(foodInput[1]));
            case "Vegetable":
                return new Vegetable(Integer.parseInt(foodInput[1]));
        }
        return null;
    }

    public static Mammal createAnimal(String[] tokens) {
        switch (tokens[0]) {
            case "Mouse":
                return new Mouse(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
            case "Zebra":
                return new Zebra(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
            case "Cat":
                return new Cat(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
            case "Tiger":
                return new Tiger(tokens[0], tokens[1], Double.parseDouble(tokens[2]), tokens[3]);
        }
        return null;
    }
}
