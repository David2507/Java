import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
////a
//        int size = 201;
//        int j = -100;
//        int arr[] = new int[size];
//        for (int i = 0; i < arr.length; i++, j++) {
//            arr[i] = j;
//            if (j % 3 != 0) {
//                System.out.println(arr[i]);
//            }
//
//        }
////b
//        int size = 201;
//        int j = -100;
//        int arr[] = new int[size];
//        for (int i = 0; i < arr.length; i++, j++) {
//            arr[i] = j;
//                System.out.println(arr[i]);
//        }
////c
//        int size = 201;
//        int j = -100;
//        int arr[] = new int[size];
//        int bt = 0;
//        for (int i = 0; i < arr.length; i++, j++) {
//            arr[i] = j;
//            if (j<0) {
//                bt +=1;
//            }
//        }
//        System.out.println(bt);
////d
//        int size = 201;
//        int dt = 0;
//        int sum = 0;
//        int arr[] = new int[size];
//        for (int i = 0, j = -100; i < arr.length; i++, j++) {
//            if (j > 0)
//                sum += j;
//            dt += 1;
//        }
//        System.out.println(sum / dt);
////e
//        int size = 201;
//        int sum =0;
//        int arr[] = new int[size];
//        for (int i = 0, j=-100; i<arr.length; i++, j++) {
//            if (i % 2 == 1)
//                arr[i] = j;
//            sum +=j;
//        }
//        System.out.println(sum);
////f
//        int size = 201;
//        int sum = 1;
//        int arr[] = new int[size];
//        for (int i = 0, j = -100; i < arr.length; i++, j++) {
//            if (j % 7 == 0)
//                sum *= i;
//        }
//        System.out.println(sum);
//    }
//}


        /**
         * Exercise 1.
         * Artacel mecaguyn arjeqy ev nra indexy:
         */
        System.out.println("Amboxj tveri zangvac : {25, 88, -31, 11, 0, -5, 2, 0, -10}");
        System.out.println();
        System.out.println("Exercise 1.");

        int number[] = {25, 88, -31, 11, 0, -5, 2, 0, -10};
        int max = number[0];
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                index = i;
            }
        }
        System.out.println("Mecaguyn arejeqy : " + max);
        System.out.println("Mecaguyni indexy : " + index);
        System.out.println();

        /**
         * Exercise 2.
         * Artacel elementneri gumarayin arjeqy:
         */
        System.out.println("Exercise 2.");
        int gumar = 0;
        for (int i = 0; i < number.length; i++) {
            gumar += number[i];
        }
            System.out.println("Elementneri gumary : " + gumar);

        System.out.println();
        /**
         * Exercise 3.
         * Artacel elementneri artadryaly:
         * Qani vor zangvaci mej 0 ka ays varjutyan mej poxum em zangvacy:
         */
        System.out.println("Exercise 3.");
        System.out.println("Poxmac amboxj tveri zangvacy : {4, 25, -4, 5, 17, -5, 10, 88, 1}");
        int number2[] = {4, 25, -4, 5, 17, -5, 10, 88, 1};
        int multiply = 1;
        for (int i = 0; i < number2.length; i++) {
            multiply *= number2[i];
        }
        System.out.println("Elementneri artadryaly : " + multiply);

        System.out.println();

        /**
         * Exercise 4.
         * Artacel drakan, bacasakan e zro tveri qanaky:
         */
        System.out.println("Exercise 4.");
        int drakan = 0;
        int bacasakan = 0;
        int zro = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                ++drakan;
            } else if (number[i] < 0) {
                ++bacasakan;
            } else {
                ++zro;
            }
        }
        System.out.println("Drakan tveri qanaky : " + drakan);
        System.out.println("Bacasakan tveri qanaky : " + bacasakan);
        System.out.println("Zro tveri qanaky : " + zro);
    }
}