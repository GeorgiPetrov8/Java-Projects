package christmas;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.setColor(color);
        this.setCapacity(capacity);
        this.setData(new ArrayList<>());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setData(List<Present> data) {
        this.data = data;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Present> getData() {
        return data;
    }

    public int count() {
        return data.size();
    }

    public void add(Present present) {
        if (capacity > 0) {
            data.add(present);
            capacity--;
        }
    }

    public boolean remove(String name) {
        boolean result = data.removeIf(e -> e.getName().equals(name));
        if (result) {
            capacity++;
        }
        return result;
    }

    public Present heaviestPresent() {
        int index = 0;
        double currentWeight = Double.MIN_VALUE;
        for (Present present : data) {
            if (present.getWeight() > currentWeight) {
                currentWeight = present.getWeight();
                index = data.indexOf(present);
            }
        }
        return data.get(index);
    }

    public Present getPresent(String name) {
        Present result = null;
        for (Present present : data) {
            if (present.getName().equals(name)) {
                result = present;
            }
        }
        return result;
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s bag contains:",getColor()));
        for (Present present : data) {
            builder.append(System.lineSeparator());
            builder.append(present.toString());
        }

        return builder.toString();
    }
}
