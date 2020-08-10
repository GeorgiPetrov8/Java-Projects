package CarSalesman;

public class Engine {
    private String model;
    private String power;
    private String displacement; //optional
    private String efficiency; //optional

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engine(String model, String power,
                  String displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;

    }

    public Engine(String model, String power,
                  String word) {
        this(model, power);
        if (Character.isLetter(word.charAt(0))) {
            this.displacement = "n/a";
            this.efficiency = word;
        } else {
            this.displacement = word;
            this.efficiency = "n/a";
        }
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
