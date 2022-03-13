import java.util.Scanner;

public class Homework2 {

    public static void tiv(int a) {
        for (int i = 1; i <= a; i += 2) {
            System.out.println(i);
        }


    }


    public static void number(int a) {
        for (int i = 3; i <= a; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 5; i <= a; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 3; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }

    }


    public static boolean tver(int a, int b, int c) {
        return a + b == c;
    }


    public static String jam(int a) {
        int min = a / 60;
        int jam = min / 60;
        int sec = a % 60;
        int rop = min % 60;
        return jam + ":" + rop + ":" + sec;


    }


    public static int auto(int speed, boolean  isBirthday) {
        if (isBirthday) {
            if (speed < 65)
                return 0;
            if (speed > 65 && speed < 85)
                return 1;
            if (speed > 85)
                return 2;
        } else {
            if (speed < 60)
                return 0;
            if (speed > 60 && speed < 80)
                return 1;
            if (speed > 80)
                return 2;
        }
        return 0;
    }


    public static String clock(int day, boolean azat) {
        if (azat ) {
            if (day >= 1 && (day <= 5) ){
                return "10:00";
            }

            if (day == 0 || day == 6)
                return "off";
        } else {
            if (day >=1 && day <= 5)
            return "7:00";
            if (day == 0 || day == 6)
                return "10:00";
        }
return "sxal";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       System.out.println(clock(scanner.nextInt(), scanner.nextBoolean()));
//        System.out.println(auto(scanner.nextInt(), scanner.nextBoolean()));
//        System.out.println(jam(scanner.nextInt()));
//        System.out.println(tver(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
//        number(scanner.nextInt());
//        tiv(scanner.nextInt());
    }
}


