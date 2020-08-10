package ListyIterator;

import java.util.*;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String> {
    private List<String> strings;
    private int index;

    public ListyIterator(String... strings) {
       this.strings = List.of(strings);
        this.index = 0;
    }

    public boolean hasNext() {
        return index < strings.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (strings.size() == 0) {
            System.out.println("Invalid Operation!");
            return;
        }
        System.out.println(strings.get(index));
    }

    public void printAll() {
        forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        for (String string : strings) {
            action.accept(string);
        }
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
