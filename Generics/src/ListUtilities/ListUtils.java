package ListUtilities;

import java.util.List;

public class ListUtils {

    public static <T extends Comparable <T>> T getMax(List<T> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
         return collection.stream().max(T::compareTo).orElse(null);

    }

    public static <T extends Comparable <T>> T getMin(List<T> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return collection.stream().min(T::compareTo).orElse(null);
    }


}
