import java.util.Arrays;

public class Tarer {
    public static void main(String[] args) {
        System.out.println("V");
        int[][] chap = new int[7][8];
        for (int i = 0; i < chap.length; i++) {
            chap[i < chap.length / 2 ? i : chap.length - 1 - i][i] = 1;

        }
        for (int[] gic : chap) {
            System.out.println(Arrays.toString(gic));
        }

        System.out.println();
        System.out.println("S");
        chap = new int[8][8];
        for (int i = 0; i < chap.length; i++) {
            chap[0][i] = 1;
            chap[i][i < chap.length / 2 ? 0 : chap.length - 1] = 1;
            chap[chap.length / 2][i] = 1;
            chap[chap.length - 1][i] = 1;
        }

        for (int[] gic : chap) {
            System.out.println(Arrays.toString(gic));
        }

        System.out.println();
        System.out.println("C");
        chap = new int[6][7];
        for (int i = 0; i < chap.length; i++) {
            chap[0][i] = 1;
            chap[i][0] = 1;
            chap[chap.length - 1][i] = 1;
        }
        for (int[] gic : chap) {
            System.out.println(Arrays.toString(gic));
        }

        System.out.println();
        System.out.println("T");
        chap = new int[6][7];
        for (int i = 0; i < chap.length; i++) {
            chap[0][i] = 1;
            chap[i][chap.length/2] = 1;

        }
        for (int[] gic : chap) {
            System.out.println(Arrays.toString(gic));
        }
        System.out.println();
        System.out.println("X");
        chap = new int[7][8];
        for (int i = 0; i < chap.length; i++) {
            chap[i][chap.length - 1 - i] = 1;
            chap[i][i] = 1;

        }

        for (int[] gic : chap) {
            System.out.println(Arrays.toString(gic));
        }

    }
}
