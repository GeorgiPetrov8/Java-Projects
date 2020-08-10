package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parentList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;

    public Person(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name) {
        this.name = name;
    }


    public List<Parent> getParentList() {
        if (parentList == null) {
            parentList = new ArrayList<>();
        }
        return parentList;
    }

    public List<Children> getChildrenList() {
        if (childrenList == null) {
            childrenList = new ArrayList<>();
        }
        return childrenList;
    }

    public List<Pokemon> getPokemonList() {
        if (pokemonList == null) {
            pokemonList = new ArrayList<>();
        }
        return pokemonList;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
