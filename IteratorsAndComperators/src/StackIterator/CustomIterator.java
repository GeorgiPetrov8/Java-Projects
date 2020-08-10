package StackIterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomIterator implements Iterator<String> {
    private List<String> list;

    public CustomIterator(List<String> list) {
        this.list = list;
    }

    int index = this.list.size();
    @Override
    public boolean hasNext() {
       return index >= 0;
    }

    @Override
    public String next() {
        return list.get(index--);
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {

    }
}
