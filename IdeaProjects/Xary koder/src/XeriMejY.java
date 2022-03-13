public class XeriMejY {
    public static void main(String[] args) {

        int sharq = 8;
        int k = 0;
        for (int i = 1; i <= sharq; ++i, k = 0) {
            for (int j = 1; j <= sharq - i; ++j) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}