package StackIterator;

import java.util.*;
public class CustomStack implements Iterable<String> {

    private List<String> list;


    public CustomStack(String... elements) {
        if (elements.length == 1) {
            list = new ArrayList<>();
            list.add(elements[0]);
        } else {
            list = new ArrayList<>(List.of(elements));
        }
    }

    public void push(String... elements) {
        if (elements.length == 1) {
            list.add(elements[0]);
        } else {
            list.addAll(List.of(elements));
        }
    }

    public String pop() {
        if (list.isEmpty()) {
            System.out.println("No elements");
            return "";
        } else {
          return list.remove(list.size() - 1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<String> {

        int index = list.size() - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public String next() {
            return list.get(index--);
        }
    }
}
