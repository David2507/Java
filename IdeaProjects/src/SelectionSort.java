import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            array[minIndex]+=array[i]-(array[i]=array[minIndex]);
        }
        return array;

    }

    public static void main(String[] args) {
        int [] c = {5,6,2,1,10,44,9};
        System.out.println(Arrays.toString(selectionSort(c)));

    }
}
