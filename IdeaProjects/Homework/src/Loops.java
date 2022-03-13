import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mutqagrel N tivy : ");
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            boolean bag = false;
            for (int i = 2; i <= N / 2; ++i) {
                if (N % i == 0) {
                    bag = true;
                    break;
                }
            }
            if (bag) {
                System.out.println("Բաղադրյալ է : " + N );
            } else
                System.out.println("Պարզ է : " + N);
        }
    }

}

