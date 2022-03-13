import java.util.Arrays;

public class Porcarkumner3 {
    public static void main(String[] args) {

        int [][]chap = new int[7][8];
        for (int i = 0; i <chap.length ; i++) {
            chap[i < chap.length / 2 ? i : chap.length - 1-i][i] = 1;

        }
        for (int[]gic:chap){
            System.out.println(Arrays.toString(gic));
        }

    }
}