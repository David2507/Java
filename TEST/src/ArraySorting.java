import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

     int[] number = {2, 0, 4, 51, 14, 20, 3, 5, 9, 7, 1, 24, 8};
       Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 8));

//        int[][] name1 = new int[3][5];
//        for (int i = 0; i < name1.length; i++){
//            for (int j = 0; j < name1[i].length; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
    }
}
