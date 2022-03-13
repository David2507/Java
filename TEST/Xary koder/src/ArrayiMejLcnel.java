import java.util.Arrays;

public class ArrayiMejLcnel {
    public static void main(String[] args) {
        int[][] matrix = new  int[6][9];
        for(int i=1; i<matrix.length-1;i++){
            for(int j=1; j<matrix[i].length-1; j++){
                matrix[i][j] = 1;
            }
        }
        for (int[] masiv: matrix ){
            System.out.println(Arrays.toString(masiv));
        }
    }
}