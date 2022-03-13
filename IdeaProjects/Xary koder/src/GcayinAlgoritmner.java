import java.util.Scanner;

public class GcayinAlgoritmner {
    public static void main(String[] args) {
        /**
         * Test 1:
         * Hashvel artahaytutyan arjeqy:
         */
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double result = (y + 1) * (x + Math.pow((x * x + 1),6) * Math.sin(x * x - 3) - Math.tan(y));
        System.out.println(result);
    }
}

