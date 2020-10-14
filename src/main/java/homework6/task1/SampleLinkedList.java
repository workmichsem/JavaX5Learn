package homework6.task1;

import java.util.LinkedList;

public class SampleLinkedList<T> {
    private LinkedList data = new LinkedList();

    public void add(T element) {
        data.addLast(element);
    }

    private void add(int index, T element) {
        data.set(index, element);
    }

    public void get(int index) {
        data.get(index);
    }

    public void remove() {
        data.removeLast();
    }

    public void remove(int index) {
        data.remove(index);
    }

    public void clear() {
        data.clear();
    }
}
