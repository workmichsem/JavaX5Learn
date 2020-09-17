package homeWork2.task10;

public class Task10 {
    private static int[] arr = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

    public static void findZeroArr() {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
    }

    public static void output() {
        System.out.println("Массив с нулями в конце: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

