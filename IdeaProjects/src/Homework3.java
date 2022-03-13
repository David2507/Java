import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework3 {
//// test 1:
//    public static void main(String[] args) {
//
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.of(date,time);
//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//
//        System.out.println(date.format(shortFormat));
////        System.out.println(time.format(shortFormat1));
////        System.out.println(date);
//        System.out.println(time);
//    }


//// test 2:
//    public static boolean isEqual(int[] array){
//        if (array[0] == array[array.length - 1]){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int [] num = {5,4,7,2,1,25,3,11};
//        System.out.println(isEqual(num));
//    }


    //// test 3:
//    public static void main(String[] args) {
//        int a;
//        int[] array = {5, 6, 2, 1, 10, 44};
//        int j = array.length - 1;
//        for (int i = 0; i < array.length/2; i++, j--) {
//            a = array[i];
//            array[i] = array[j];
//            array[j] = a;
//
//        }
//        System.out.println("[5, 6, 2, 1, 10, 44]");
//        System.out.println(Arrays.toString(array));
//    }


    //// test 4:
//    public static int maxElement(int [] array) {
//        int max;
//        max = array[0];
//        for (int i = 0; i < array.length; i++){
//
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int [] array = {25,10,88,10,34};
//
//        System.out.println( maxElement(array));
//    }


    //// test 5:
//    public static int[] sort(int[] array, int[] array1) {
//        int[] array2 = new int[array.length + array1.length];
//        for (int i = 0; i < array2.length; i++){
//
//        }
//
//        return array2;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4};
//        int[] array1 = {2, 5, 7, 8};
//
//        System.out.println();
//
//    }


//// test 6:

//    /**
//     * Calculate odd numbers sum and even numbers sum in array.
//     *
//     * @param arr
//     * @return odd numbers sum minus even numbers sum.
//     */
//    public static int oddMinusEven(int[] arr) {
//        int kent = 0;
//        int zuyg = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                zuyg += arr[i];
//            } else
//                kent += arr[i];
//        }
//        return kent - zuyg;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {8, 45, 11, 104, 34, 445, 666};
//
//        System.out.println("(zuyg - kent) = " + oddMinusEven(arr));


//// test 7
//
//    /**
//     * Get common elements of 2 arrays.
//     *
//     * @param first
//     * @param second
//     */
//    public static void getCommonElements(int[] first, int[] second) {
//        System.out.println("first = {1, 0, 20, 5, 8, 9, 7}");
//        System.out.println("second = {10, 0, 6, 5, 15, 6, 4, 20, 7}");
//        ArrayList common = new ArrayList();
//
//        for (int i : first) {
//            for (int j : second) {
//                if (i == j) {
//                    common.add(j);
//
//                }
//            }
//        }
//        Object[] objects = common.toArray();
//        System.out.println("Common - " + Arrays.toString(objects));
//    }
//
//    public static void main(String[] args) {
//        int[] first = {1, 0, 20, 5, 8, 9, 7};
//        int[] second = {10, 0, 6, 5, 15, 6, 4, 20, 7};
//        getCommonElements(first, second);
//
//    }

}



