public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy")
                || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        switch (flourType) {
            case "White":
                switch (bakingTechnique) {
                    case "Crispy":
                        return (2 * weight) * 1.5 * 0.9;
                    case "Chewy":
                        return (2 * weight) * 1.5 * 1.1;
                    case "Homemade":
                        return (2 * weight) * 1.5 * 1.0;
                }
                break;
            case "Wholegrain":
                switch (bakingTechnique) {
                    case "Crispy":
                        return (2 * weight) * 1.0 * 0.9;
                    case "Chewy":
                        return (2 * weight) * 1.0 * 1.1;
                    case "Homemade":
                        return (2 * weight) * 1.0 * 1.0;
                }
                break;
        }
        return 0.0;
    }
}
