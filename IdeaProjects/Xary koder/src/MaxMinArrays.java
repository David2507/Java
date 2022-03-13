import java.util.Arrays;

public class MaxMinArrays {
    public static void main(String[] args) {
        int[][] arrays = {
                {42, 12, 4, 54, 12, 78, 45},
                {78, 94, 8, 55, 47, 2, 31},
                {36, 61, 51, 545, 54, 45, 7},
                {3, 511, 21, 313, 66, 77, 8}};
        int min = arrays[0][0];
        int max = arrays[0][0];

        for (int[] masiv : arrays) {
            for (int tiv : masiv) {
                if (tiv > max) {
                    max = tiv;
                }
                else if (tiv < min) {
                    min = tiv;
                }
            }
        }
        System.out.println(min + max);
        for (int[] masiv : arrays) {
            System.out.println(Arrays.toString(masiv));
        }
    }
}
