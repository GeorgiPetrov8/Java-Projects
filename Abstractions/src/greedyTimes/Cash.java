package greedyTimes;

public class Cash {
    private int amount;
    private String currency;

    public Cash(int amount, String currency) {
        this.setAmount(amount);
        this.setCurrency(currency);
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }
}
