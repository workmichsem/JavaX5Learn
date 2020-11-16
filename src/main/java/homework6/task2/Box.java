package homework6.task2;

public class Box<T> {
    private Object[] data = new Object[0];

    public int getDataLength(){
        return data.length;
    }

    public static boolean compare(Box<Apple> box1, Box<Orange> box2) {
        if (box1.data.length > box2.data.length) {
            return true;
        } else {
            return false;
        }
    }

    public double getWeight(Box<T> box){
        //box.data[0]

        return 0;
    }

    public double getWeight() {
        double appleCost = 1.0;
        double orangeCost = 1.5;
//        if (data[0]. instanceof Apple) {
//            System.out.println(data.length * appleCost);
//            return data.length * appleCost;
//        } else if (data[0] instanceof Orange) {
//            System.out.println(data.length * orangeCost);
//            return data.length * orangeCost;
//        }
        return 0;
    }

    public void add(T element) {
        Object[] result = (T[]) new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i];
        }
        for (int i = data.length + 1; i < result.length; i++) {
            result[i] = data[i];
        }
        result[data.length] = element;
        data = result;
    }
}
