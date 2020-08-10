package CustomLinkedArray;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class LInkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public void addFirst(int element) {
        ListNode node = new ListNode(element);

        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = head;
            this.head.previous = node;
            this.head = node;
        }
        this.size++;
    }

    public void addLast(int element) {
        ListNode node = new ListNode(element);
        if (this.size == 0) {
            this.head = node;
        } else {
            node.previous = this.tail;
            this.tail.next = node;
        }
        this.tail = node;
        this.size++;
    }

    public int get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bounds for length %d", index, this.size));
        }

        ListNode node = null;
        if (index < size / 2) {
            node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = this.tail;
            for (int i = size - 1; i > index; i--) {
                node = node.previous;
            }
        }
        return node.value;
    }

    public int removeFirst() {
        checkSize();

        ListNode node = this.head;
        if (size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
        }

        size--;
        return node.value;
    }
    public int removeLast() {
        checkSize();

        ListNode node = tail;
        if (size == 1) {
            tail = null;
            head = null;
        } else {
            this.tail = tail.previous;
            tail.next = null;
        }

        size--;
        return node.value;
    }

    public void forEach(Consumer<Integer> consumer) {
        ListNode node = this.head;
        while (node != null) {
            consumer.accept(node.value);
            node = node.next;
        }

    }

    public int[] toArray() {
        checkSize();

        ListNode node = this.head;
        int[] array = new int[this.size];

        int index = 0;
        while (node != null) {
            array[index++] = node.value;
            node = node.next;
        }
        return array;
    }

    private void checkSize() {
        if (this.size == 0) {
            throw new NoSuchElementException("The list is empty");
        }
    }

    private class ListNode {
        private int value;
        private ListNode next;
        private ListNode previous;

        public ListNode(int value) {
            this.value = value;
        }
    }

}
