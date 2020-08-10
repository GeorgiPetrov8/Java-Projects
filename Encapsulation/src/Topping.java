public class Topping {
    private String typeName;
    private double weight;

    public Topping(String typeName, double weight) {
        setTypeName(typeName);
        setWeight(weight);
    }

    private void setTypeName(String typeName) {
        if (typeName.equals("Meat") || typeName.equals("Veggies")
                || typeName.equals("Cheese")
                || typeName.equals("Sauce")) {
            this.typeName = typeName;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", typeName));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50]."
                    , this.typeName));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        switch (typeName) {
            case "Meat":
               return  (2 * weight) * 1.2;
            case "Veggies":
                return (2 * weight) * 0.8;
            case "Cheese":
                return (2 * weight) * 1.1;
            case "Sauce":
                return (2 * weight) * 0.9;
        }
        return 0.0;
    }
}
