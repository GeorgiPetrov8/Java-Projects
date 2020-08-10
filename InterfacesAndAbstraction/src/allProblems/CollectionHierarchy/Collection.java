package allProblems.CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private final int maxSize = 100;
    private final List<String> items = new ArrayList<>(maxSize);

    protected Collection(){}

    protected List<String> getItems() {
        return items;
    }

    protected int getMaxSize() {
        return maxSize;
    }
}
