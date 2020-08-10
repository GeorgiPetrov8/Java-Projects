package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> allPersons = new HashMap<>();

        String input = bf.readLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String personName = tokens[0];
            String type = tokens[1];
            switch (type) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName,department,salary);
                    Person person = new Person(personName,company);
                    allPersons.putIfAbsent(personName,person);
                    allPersons.get(personName).setCompany(company);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Car car = new Car(carModel,carSpeed);
                    Person person1 = new Person(personName,car);
                    allPersons.putIfAbsent(personName,person1);
                    allPersons.get(personName).setCar(car);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parent parent = new Parent(parentName,parentBirthday);
                    Person person2 = new Person(personName);
                    allPersons.putIfAbsent(personName,person2);
                    allPersons.get(personName).getParentList().add(parent);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Children children = new Children(childName,childBirthday);
                    Person person3 = new Person(personName);
                    allPersons.putIfAbsent(personName,person3);
                    allPersons.get(personName).getChildrenList().add(children);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    Person person4 = new Person(personName);
                    allPersons.putIfAbsent(personName,person4);
                    allPersons.get(personName).getPokemonList().add(pokemon);
                    break;
            }

            input = bf.readLine();
        }
        String name = bf.readLine();
        if (allPersons.containsKey(name)) {
            System.out.println(name);
            System.out.println("Company:");
            if (allPersons.get(name).getCompany() == null) {
            } else {
                System.out.print(allPersons.get(name).getCompany().getName() + " ");
                System.out.print(allPersons.get(name).getCompany().getDepartment() + " ");
                System.out.printf("%.2f%n",allPersons.get(name).getCompany().getSalary());
            }
            System.out.println("Car:");
            if (allPersons.get(name).getCar() == null) {
            } else {
                System.out.print(allPersons.get(name).getCar().getModel());
                System.out.println(" " + allPersons.get(name).getCar().getSpeed());
            }
            System.out.println("Pokemon:");
            if (allPersons.get(name).getPokemonList() == null) {
            } else {
                for (Pokemon pokemon : allPersons.get(name).getPokemonList()) {
                    System.out.print(pokemon.getPokemonName());
                    System.out.println(" " + pokemon.getPokemonType());
                }
            }
            System.out.println("Parents:");
            if (allPersons.get(name).getParentList() == null) {
            } else {
                for (Parent parent : allPersons.get(name).getParentList()) {
                    System.out.print(parent.getParentName() + " ");
                    System.out.println(parent.getParentBirthday());
                }
            }
            System.out.println("Children:");
            if (allPersons.get(name).getChildrenList() == null) {
            } else {
                for (Children children : allPersons.get(name).getChildrenList()) {
                    System.out.print(children.getChildName() + " ");
                    System.out.println(children.getChildBirthday());
                }
            }

        }
    }
}
