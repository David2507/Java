import java.util.Scanner;

public class Varaibles {
    /**
     * Exercise Ա
     * Poxel popoxakanneri arjeqnery ogtagorcelov errord popoxakany:
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 1");
        System.out.print("Mutqagrel a1 popoxakany : ");
        if (scanner.hasNextInt()) {
            int a1 = scanner.nextInt();
            System.out.print("Mutqagrel b1 popoxakany : ");
            if (scanner.hasNextInt()) {
                int b1 = scanner.nextInt();
                int c1;
                c1 = a1;
                a1 = b1;
                b1 = c1;
                System.out.println("a1 popoxakani poxvac arjeqy : " + a1);
                System.out.println("b1 popoxakani poxvac arjeqy : " + b1);
            }
        }
        System.out.println();
        System.out.println("Exercise Բ");

        /**
         * Exercise Բ
         * Poxel popoxakanneri arjeqnery aranc errord popoxakan ogtagorcelu:
         */
        System.out.print("Mutqagrel a2 popoxakany : ");
        if (scanner.hasNextInt()) {
            int a2 = scanner.nextInt();
            System.out.print("Mutqagrel b2 popoxakany : ");
            if (scanner.hasNextInt()) {
                int b2 = scanner.nextInt();
                a2 = a2 + b2;
                b2 = a2 - b2;
                a2 = a2 - b2;
                System.out.println("a popoxakani poxvac arjeqy : " + a2);
                System.out.println("b popoxakani poxvac arjeqy : " + b2);
            }
        }
    }
}