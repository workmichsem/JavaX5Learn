package homeWork2.task9;

public class Task9 {
    public static void revertArrAndOutput(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println("Перевернутый массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}