package allProblems.CollectionHierarchy.Classes;

import allProblems.CollectionHierarchy.Collection;
import allProblems.CollectionHierarchy.Interfaces.AddRemovable;

public class AddRemoveCollection extends Collection implements AddRemovable {
    @Override
    public String remove() {
        return this.getItems().remove(this.getItems().size() - 1);
    }

    @Override
    public int add(String item) {
            int index = 0;
            this.getItems().add(0, item);
            return index;
    }
}
