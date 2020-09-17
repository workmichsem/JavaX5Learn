package homeWork2.task9;

public class Task9 {
    private static int[] arr = new int[] {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};

    public static void revertArr(){
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--)
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void output(){
        System.out.println("Перевернутый массив: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}