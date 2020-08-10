package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String animalType;
        while (!(animalType = scan.nextLine()).equals("Beast!")) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            try {
            Animal animal = Animal.createAnimal(animalType,name,age,gender);
            animals.add(animal);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
