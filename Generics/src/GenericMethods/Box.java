package GenericMethods;

public class Box <T extends Comparable<T>> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.getClass()
                .getName()
                + ": " +
                value;
    }
}
