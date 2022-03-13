import java.util.Arrays;

public class Ankyunagcer {
    public static void main(String[] args) {
        int[][] arrays = new int[7][7];
        for (int i = 0; i < arrays.length; i++) {

            arrays[i][i] = 1;
        }
        for (int[] masiv : arrays) {
            System.out.println(Arrays.toString(masiv));
        }

    }
}