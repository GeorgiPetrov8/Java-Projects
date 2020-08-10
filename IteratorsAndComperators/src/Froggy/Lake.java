package Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> list;


    public Lake(Integer... numbers) {
        this.list = new ArrayList<>(List.of(numbers));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {

        int index = 0;
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Integer next() {
            int output = list.get(index);
            index += 2;
            if (index >= list.size() && index % 2 == 0) {
                index = 1;
            }
            return output;
        }
    }
}
