import java.util.Scanner;

public class gfg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b;
        switch (b = scanner.nextInt() ) {
            case 1 -> System.out.println("Երկուշաբթի");
            case 2 -> System.out.println("Երեքշաբթի");
            case 3 -> System.out.println("Չորեքշաբթի");
            case 4 -> System.out.println("Հինգշաբթի");
            case 5 -> System.out.println("Ուրբաթ");
            case 6 -> System.out.println("Շաբաթ");
            case 7 -> System.out.println("Կիրակի");
            default -> System.out.println("լավ չէս վագրիկ");
        }
    }
}
