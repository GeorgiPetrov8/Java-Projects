package AnimalsLab;

public abstract class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    protected String explainSelf() {
       return  "I am " + this.name + " and my favourite food is " + this.favoriteFood + System.lineSeparator();

    }
}
