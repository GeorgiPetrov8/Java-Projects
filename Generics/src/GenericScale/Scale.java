package GenericScale;

public class Scale<T extends Comparable<T>> {
    private T lefT;
    private T rightT;

    public Scale(T lefT, T rightT) {
        this.lefT = lefT;
        this.rightT = rightT;
    }

    public T getHeavier() {
        int result = lefT.compareTo(rightT);

        if (result > 0) {
            return lefT;
        } else if (result == 0) {
            return null;
        }
        return rightT;
    }

}

