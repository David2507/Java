import java.util.Scanner;

public class ScannerNumber {
    public static int number(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amenashat 5-ery : " + number(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())+" - um en");
    }


}