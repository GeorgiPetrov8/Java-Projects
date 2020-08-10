package AnimalsLab;

public class Cat extends Animal {
    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + "MEEOW";
    }
}
