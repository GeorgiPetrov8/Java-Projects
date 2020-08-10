package allProblems.CollectionHierarchy.Classes;

import allProblems.CollectionHierarchy.Collection;
import allProblems.CollectionHierarchy.Interfaces.MyList;

public class MyListImpl extends Collection implements MyList {
    private int used;

    @Override
    public int getUsed() {
        return this.used;
    }

    @Override
    public String remove() {
            this.used--;
            return this.getItems().remove(0);
    }

    @Override
    public int add(String item) {
            int index = 0;
            this.getItems().add(0, item);
            this.used++;
            return index;
    }
}
