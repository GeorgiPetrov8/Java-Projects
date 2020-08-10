package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.setType(type);
        this.setCapacity(capacity);
        this.setData(new ArrayList<>());
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setData(List<Car> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Car> getData() {
        return data;
    }

    public void add(Car car) {
        if (capacity > 0) {
            data.add(car);
            this.capacity--;
        }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) &&
                    car.getModel().equals(model)) {
                data.remove(car);
                this.capacity++;
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        Car result = null;
        if (data.size() > 0) {
            int currentYear = Integer.MIN_VALUE;
            for (Car car : data) {
                if (car.getYear() > currentYear) {
                    currentYear = car.getYear();
                    result = car;
                }
            }
        }
        return result;
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) &&
                    car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("The cars are parked in %s:", getType()));
        for (Car car : data) {
            builder.append(System.lineSeparator());
            builder.append(car.toString());
        }
        return builder.toString();
    }
}
