import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {12, 7, 4, 5, 18, 3, 11, 16, 22, 31};
        Arrays.sort(a);
        int b =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b = a[i];
                System.out.println(b);

            }

        }

        System.out.println(Arrays.toString(a));

//        // Exercise 2.
//        int a2 = scanner.nextInt();
//        if (a2 % 3 == 0 && a2 % 5 == 0) {
//            System.out.println("Բաժանվում է");
//        } else System.out.println("Չի բաժանվում");
//
//        //Exercise 3.
//        System.out.print("Enter number a : ");
//        int a3 = scanner.nextInt();
//        System.out.print("Enter number b : ");
//        int b3 = scanner.nextInt();
//        System.out.print("Enter number c : ");
//        int c3 = scanner.nextInt();
//        if (a3 < b3 && a3 < c3) {
//            System.out.println("Minimum number : " + a3);
//        }
//        if (b3 < c3) {
//            System.out.println("Minimum number : " + b3);
//        }
//        if (c3 < a3 && c3 < b3) {
//            System.out.println("Minimum number : " + c3);
//        } else if (a3 == b3 && a3 == c3) {
//            System.out.println("Minimum doesnt exist");
//        }
//
//
//        // Exercise 4.
//        int result = scanner.nextInt();
//        int a1 = scanner.nextInt();
//        int b1 = scanner.nextInt();
////        if (a1 > b1){
////            result = result*(a1-b1);
////            System.out.println(result);
////        }else result = result*(a1+b1);
////        System.out.println(result);
//        result = a1 > b1 ? result * (a1 - b1) : result * (a1 + b1);
//        System.out.println(result);
//
//        // Exercise 5.
//        int or = scanner.nextInt();
//        switch (or) {
//            case 1 -> System.out.println("Երկուշաբթի");
//            case 2 -> System.out.println("Երեքշաբթի");
//            case 3 -> System.out.println("Չորեքշաբթի");
//            case 4 -> System.out.println("Հինգշաբթի");
//            case 5 -> System.out.println("Ուրբաթ");
//            case 6 -> System.out.println("Շաբաթ");
//            case 7 -> System.out.println("Կիրակի");
//            default -> System.out.println("Գոյություն չունի");
//        }
//
//        //Exercise 6.
//        int n = scanner.nextInt();
//        for (int i = 1; i < n; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                System.out.println(i);
//            } else if (n <= 3) {
//                System.out.println("Թիվը չի բաժանվում");
//            }
//        }
//
//
//        // Exercise 7.
//        int n1 = scanner.nextInt();
//        int a;
//        int b;
//        int c;
//        int d;
//        if ((n1 >= 1000 && n1 <= 9999)||(n1 <= -1000 && n1 >= -9999) ) {
//            a = n1 % 10;
//            b = (n1 / 10) % 10;
//            c = (n1 / 100) % 10;
//            d = n1 / 1000;
//            if ((a + b + c + d) % 2 == 0) {
//                System.out.println("Evenish");
//            } else System.out.println("Oddish");
//        } else System.out.println("Մուտքագրված թիվը քառանիշ չէ");
//
//        //Exercise 8.
//        int n2 = scanner.nextInt();
//        for (int i = n2; i >= 0; i--) {
//            System.out.println(i);
//
//        }
//
//        //Exercise 9.
//        System.out.print("Enter number: ");
//        int n3 = scanner.nextByte();
//        for (int i = 1; i <= 10; i++) {
//            int result1 = n3 * i;
//            System.out.println(n + "*" + i + "=" + result1);
//        }
    }
}
