import java.util.Arrays;
import java.util.Scanner;

public class TviTary {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 1, 15, 64, 30};
        int[] arr2 = {1, 4, 20, 12, 8, 26, 30};

        System.out.println(Arrays.binarySearch(arr,9));
        int [] arrays = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arrays));
        Arrays.fill(arrays,9);
        System.out.println(Arrays.toString(arrays));
        Arrays.fill(arrays,2,4,12);
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr,arr2));



    }
}


