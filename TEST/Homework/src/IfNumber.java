import java.util.Scanner;

public class IfNumber {
    /**
     * Exercis 1.
     * Artacel ereq popoxakanneric poqraguyni arjeqy:
     * Ete popoxakannery havasar en uremn artacel "Minimum doesnt exist":
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercise 1.");
        System.out.print("Enter number a : ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.print("Enter number b : ");
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.print("Enter number c : ");
                if (scanner.hasNextInt()) {
                    int c = scanner.nextInt();
                    if (a < b && a < c) {
                        System.out.println("Minimum number : " + a);
                    }
                    else if (b < c) {
                        System.out.println("Minimum number : " + b);
                    }
                    else if (c < a && c < b) {
                        System.out.println("Minimum number : " + c);
                    } else if (a == b && a == c) {
                        System.out.println("Minimum doesnt exist");
                    }
                }
            }
        }
        System.out.println();
        /**
         * Exercise 2.
         * Nermucel amboxj tiv ev artacel modulov arjeqy:
         * Bacasakan tiv nermucelu depqum tpum e nuyn tvi drakan arjeqy
         * Drakan nermucelu depqum nuyn drakan tivy
         */
        System.out.println("Exercise 2.");
        System.out.print("Mutqagrel a2 tivy : ");
        if (scanner.hasNextInt()) {
            int a2 = scanner.nextInt();
            if (a2 < 0) {
                System.out.println("|a2| havasar e : " + -a2);
            } else System.out.println("|a2| havasar e : " + a2);
            System.out.print("Mutqagrel b2 tivy : ");
            if (scanner.hasNextInt()) {
                int b2 = scanner.nextInt();
                if (b2 < 0) {
                    System.out.println("|b2| havasar e : " + -b2);
                } else System.out.println("|b2| havasar e : " + b2);
                System.out.print("Mutqagrel c2 tivy : ");
                if (scanner.hasNextInt()) {
                    int c2 = scanner.nextInt();
                    if (c2 < 0) {
                        System.out.println("|c2| havasar e : " + -c2);
                    } else System.out.println("|c2| havasar e : " + c2);

                }
            }
        }
    }
}