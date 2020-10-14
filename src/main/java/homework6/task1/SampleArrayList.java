package homework6.task1;

public class SampleArrayList<T> {
    private Object[] data = new Object[0];

    public void add(T element) {
        add(data.length, element);
    }

    private void add(int index, T element) {
        Object[] result = (T[]) new Object[data.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = data[i];
        }
        for (int i = index + 1; i < result.length; i++) {
            result[i] = data[i];
        }
        result[index] = element;
        data = result;
    }

    public void size() {
        System.out.println(data.length);
    }

    public void get(int index) {
        System.out.println(data[index].toString());
    }

    public void remove() {
        remove(data.length - 1);
    }

    public void remove(int index) {
        Object[] result = (T[]) new Object[data.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = data[i];
        }
        data = result;
    }

    public void clear() {
        data = null;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}