import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSorting {

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1]-( array[j + 1]= array[j] );
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] a = {4, 5, 2, 8, 4, 10, 25, 14, 9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));


    }


}
