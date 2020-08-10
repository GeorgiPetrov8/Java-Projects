package greedyTimes;

public class Gem {
    private int amount;
    private String gemType;

    public Gem(int amount, String gemType) {
        this.setAmount(amount);
        this.setGemType(gemType);
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    public String getGemType() {
        return gemType;
    }

    private void setGemType(String gemType) {
        this.gemType = gemType;
    }
}
