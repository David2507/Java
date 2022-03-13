public class TarberPatkerner {

    public static void main(String[] args) {
        System.out.println("Teqvac havasarasrun erankyun tarberak 1:");
        System.out.println("------------------------");
        int sharq = 8;

        for (long i = 1, x = (long) Math.pow(100, sharq - 1), y = 1; i <= sharq; ++i, x /= 100, y *= 10) {
            System.out.print((" " + y).replaceAll("[10]", "  "));
            System.out.println((" " + x).replaceAll("[10]", "* "));
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Teqvac havasarasrun erankyun tarberak 2:");
        System.out.println("------------------------");
        for (int i = sharq; i >= 1; --i) {
            for (int a = 1; a <= sharq - i; ++a) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Havasarasrun erankyun Tarberak 1:");
        System.out.println("------------------------");
        for (long i = 1, x = 1, y = (long) Math.pow(10, sharq - 1); i <= sharq; ++i, x *= 100, y /= 10) {
            System.out.print(("" + y).replaceAll("[10]", " "));
            System.out.println(("" + x).replaceAll("[10]", "*"));
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Havasarasrun erankyun tarberak 2:");
        System.out.println("------------------------");
        int k = 0;
        for (int i = 1; i <= sharq; ++i, k = 0) {
            for (int j = 1; j <= sharq - i; ++j) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Uxankyun erankyun 1 for-ov");
        System.out.println("------------------------");
        String x = "";
        for (int i = 0; i < sharq; i++) {
            x += "* ";

            System.out.println(x);
        }
        System.out.println("------------------------");

        System.out.println();
        System.out.println("Uxankyun erankyun 2 for-ov");
        System.out.println("------------------------");

        for (int i = 1; i <= sharq; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Teqac uxankyun erankyun");
        System.out.println("------------------------");
        for (int i = sharq; i >= 1; --i) {
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Teqvac erankyun");
        System.out.println("------------------------");
        for (int i = 1; i <= sharq-1; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = sharq; i >= 1; --i) {
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Vecankyun");
        System.out.println("------------------------");
        for (int i = 4; i <= sharq; i++, k = 0) {
            for (int j = 1; j <= sharq - i; j++) {
                System.out.print("   ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*  ");
                ++k;
            }
            System.out.println();
        }
        for (int i = sharq; i >= 5; --i) {
            for (int j = 0; j <= sharq - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= 2 * i - 3; j++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Zugaheragic");
        System.out.println("------------------------");
        for (int i = 1; i <= sharq; i++, k = 0) {
            for (int j = 1; j <= sharq - i; j++) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
        for (int i = sharq; i >= 1; --i) {
            for (int j = 0; j <= sharq - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i - 3; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("------------------------");
    }
}
