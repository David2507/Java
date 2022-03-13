import java.util.Scanner;

public class TviQarakusi {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int tiv;
        double x;
        double shexum = 0.000001;
        System.out.println("Grel tivy ");
        if (scanner.hasNextInt()) {
            tiv = scanner.nextInt();
            for (x = 0; (x * x) <= tiv; x++) ;
            {
                for (x = x - 1; (x * x) < tiv; x = x + shexum) ;
                {
                    System.out.println(x);
                }
            }
        }
    }
}