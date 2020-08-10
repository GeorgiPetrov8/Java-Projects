package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight; //optional
    private String color; //optional

    public Car(String model, Engine engine, String weight, String color ) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }
    public Car(String model, Engine engine, String weightOreColor) {
        this.model = model;
        this.engine = engine;
        if (Character.isLetter(weightOreColor.charAt(0))) {
            this.color = weightOreColor;
            this.weight = "n/a";
        } else {
            this.weight = weightOreColor;
            this.color = "n/a";
        }
    }
    @Override
    public String toString() {
       return String.format("%s:%n%s:%nPower: %s%nDisplacement: %s%n" +
                "Efficiency: %s%nWeight: %s%nColor: %s",this.model,this.engine.getModel(),
               this.engine.getPower(),this.engine.getDisplacement(),this.engine.getEfficiency(),
               this.weight,this.color);
    }
}
