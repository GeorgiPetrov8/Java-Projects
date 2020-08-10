package allProblems.CarShop;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower,
                String country, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.setMinRentDay(minRentDay);
        this.setPricePerDay(pricePerDay);
    }

    public void setMinRentDay(Integer minRentDay) {
        this.minRentDay = minRentDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nMinimum rental period of %d days. Price per day %.6f",
                this.getMinRentDay(), this.getPricePerDay());

    }
}
