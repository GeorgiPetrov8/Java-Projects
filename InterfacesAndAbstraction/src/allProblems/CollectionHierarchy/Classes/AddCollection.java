package allProblems.CollectionHierarchy.Classes;

import allProblems.CollectionHierarchy.Collection;
import allProblems.CollectionHierarchy.Interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
            int index = this.getItems().size();
            this.getItems().add(index, item);
            return index;
    }
}
