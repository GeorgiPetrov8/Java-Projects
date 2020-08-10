package CustomArrayAndStack;

import java.util.function.Consumer;

public class SmartArray {
    private int[] elements;
    private int index;

    public SmartArray() {
        this.elements = new int[10];
        this.index = 0;
    }

    public void add(int element) {
        if (index == elements.length) {
            this.elements = grow();
        }
        this.elements[index] = element;
        index++;
    }


    private int[] grow() {
        int[] newArray = new int[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        return newArray;
    }

    public void add(int index, int element) {
        int last = this.get(this.getSize() - 1);

        for (int i = getSize() - 1; i > index ; i--) {
            elements[i] = this.elements[i - 1];
        }
        elements[index] = element;

        this.add(last);


    }


    public int get(int index) {
        if (index >= this.getSize() || index < 0) {
            throw new IndexOutOfBoundsException("Exception");
        }
        return this.elements[index];

    }

    public int remove(int index) {
        int returnIndex = get(index);
        for (int i = index; i < getSize(); i++) {
            elements[index] = elements[index + 1];
        }
        elements[getSize() - 1] = 0;
        this.index--;

        if (this.getSize() <= this.elements.length / 4) {
            this.elements = shrink();

        }
        return returnIndex;

    }

    private int[] shrink() {
        int[] newElements = new int[this.elements.length / 2];
        if (this.getSize() > 0) {
            System.arraycopy(this.elements, 0, newElements, 0, this.getSize());
        } else {
            this.elements = new int[8];
        }
        return newElements;

    }

    public boolean contains(int element) {
        for (int i = 0; i < getSize(); i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < getSize() ; i++) {
            consumer.accept(elements[i]);
        }

    }

    public int indexOf(int element) {
        for (int i = 0; i < getSize(); i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return this.index;

    }

}
