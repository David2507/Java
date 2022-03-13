import java.util.Scanner;

public class TviXoranard {
    /**
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * if(scanner.hasNextInt())
     * <p>
     * {
     * int b = scanner.nextInt();
     * System.out.println(Math.cbrt(b));
     * }
     * }
     */


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int tiv;
        double x;
        double shexum = 0.0000001;
        System.out.println("Grel tivy ");
        if (scanner.hasNextInt()) {
            tiv = scanner.nextInt();
            for (x = 0; (x * x * x) <= tiv; x++) ;
            {
                for (x = x - 1; (x * x * x) < tiv; x += shexum) ;
                {
                    System.out.println( x );
                }
            }
        }
    }
}





