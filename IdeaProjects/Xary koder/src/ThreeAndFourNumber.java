import java.util.Scanner;

public class ThreeAndFourNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mutqagrel a,b ev c tvery:");
        System.out.print("a : ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.print("b : ");
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.print("c : ");
                if (scanner.hasNextInt()) {
                    int c = scanner.nextInt();

                    /**
                     * Test 21
                     * Trvac tveric vorn e amenamecy
                     */
                    if (a > b && a > c) {
                        System.out.println("Amenamec tivy : " + a);
                    } else if (a == b || a == c) {
                        System.out.println("Amenamec tivy : " + a);
                    } else if (b == c) {
                        System.out.println("Amenamec tivy : " + b);
                    } else if (b > a && b > c) {
                        System.out.println("Amenamec tivy : " + b);
                    } else System.out.println("Amenamec tivy : " + c);

                    /**
                     * Test 22
                     * Trvac tveric vorn e amenapoqry
                     */
                    if (a < b && a < c) {
                        System.out.println("Amenapoqr tivy : " + a);
                    } else if (b < a && b < c) {
                        System.out.println("Amenapoqr tivy : " + b);
                    } else System.out.println("Amenapoqr tivy : " + c);

                    /**
                     * Test 23
                     *Ete trvac tveric gone meky havasar e 1-i, tpel true hakarak depqum false
                     */
                    if (a == 1) {
                        System.out.println("a tivy havasar e 1-i : " + true);

                    } else if (b == 1) {
                        System.out.println("b tivy havasar e 1-i : " + true);
                    } else if (c == 1) {
                        System.out.println("c tivy havasar e 1-i : " + true);
                    } else System.out.println("Tveric voch meky havasar che 1-i : " + false);

                    /**
                     * Test 24
                     *Ete trvac tveric erkusy havasar en 2-i tpel true hakarag depqum false
                     */
                    if (a == 2 && b == 2) {
                        System.out.println("a == 2 && b == 2 : " + true);
                    }
                    if (b == 2 && c == 2) {
                        System.out.println("b == 2 && c == 2 : " + true);
                    }
                    if (a == 2 && c == 2) {
                        System.out.println("a == 2 && c == 2 : " + true);
                    } else System.out.println("Tveric erkusy havasar chen 2-i : " + false);

                    /**
                     * Test 26
                     *Ete tveric gone meky zuyg e tpel 1 hakarak depqum 2
                     */
                    if (a % 2 == 0) {
                        System.out.println("a tivy zuyg e : " + 1);
                    } else if (b % 2 == 0) {
                        System.out.println("b tivy zuyg e : " + 1);
                    } else if (c % 2 == 0) {
                        System.out.println("c tivy zuyg e : " + 1);
                    } else System.out.println("Zuyg tiv chka : " + 2);


                    /**
                     * Test 27
                     * Ete trvac tvery tvabanakan progresia en kazmum tpel true hakarak depqum false
                     * Progresiayi hamar avelacvel e 4-rd d popoxakany
                     */
                    System.out.println();
                    System.out.println("Mutqagrel b avelacvac tivy : ");
                    System.out.print("b : ");
                    if (scanner.hasNextInt()) {
                        int d = scanner.nextInt();
                        if (b == a + d && c == b + d) {
                            System.out.println("Kazmum en tvabanakan progresia : " + true);
                        } else System.out.println("Chen kazmum tvabanakan progresia : " + false);

                        /**
                         * Test 28
                         * Ete trvac tvery erkrachapakan progresia en kazmum tpel true hakarak depqum false
                         */
                        if (b == a * d && c == b * d) {
                            System.out.println("Kazmum en erkrachapakan progresia : " + true);
                        } else System.out.println("Chen kazmum erkrachapakan progresia : " + false);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Mutqagrel a,b,c ev d tvery: ");
        System.out.print("a : ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.print("b : ");
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.print("c : ");
                if (scanner.hasNextInt()) {
                    int c = scanner.nextInt();
                    System.out.print("d : ");
                    if (scanner.hasNextInt()) {
                        int d = scanner.nextInt();

                        /**
                         * Test 31
                         * Trvac tveric vorn e mecaguyn arjeq unecoxy
                         */
                        if (a > b && a > c && a > d) {
                            System.out.println("Mecaguyn arjeq : " + a);
                        }
                        if (b > a && b > c && b > d) {
                            System.out.println("Mecaguyn arjeq : " + b);
                        }
                        if (c > a && c > b && c > d) {
                            System.out.println("Mecaguyn arjeq : " + c);
                        }
                        if (d > b && d > c && d > a) {
                            System.out.println("Mecaguyn arjeq : " + d);
                        }


                        /**
                         * Test 32
                         * Trvac tveric vorn e poqraguyn arjeq unecoxy
                         */

                        if (a < b && a < c && a < d) {
                            System.out.println("Poqraguyn arjeq : " + a);
                        }
                        if (b < a && b < c && b < d) {
                            System.out.println("Poqraguyn arjeq : " + b);
                        }
                        if (c < a && c < b && c < d) {
                            System.out.println("Poqraguyn arjeq : " + c);
                        }
                        if (d < b && d < c && d < a) {
                            System.out.println("Poqraguyn arjeq : " + d);
                        }


                        /**
                         * Test 33
                         *Ete trvac tveric gone meky havasar e 1-i, tpel true hakarak depqum false
                         */
                        if (a == 1) {
                            System.out.println("a tivy havasar e 1-i : " + true);

                        } else if (b == 1) {
                            System.out.println("b tivy havasar e 1-i : " + true);
                        } else if (c == 1) {
                            System.out.println("c tivy havasar e 1-i : " + true);
                        } else if (d == 1) {
                            System.out.println("d tivy havasar e 1-i : " + true);
                        } else System.out.println("Tveric voch meky havasar che 1-i : " + false);


                        /**
                         * Test 34
                         * Ete tveric erkusi gumary havasar e myus erkusi gumarin tpel true hakarak depqum false
                         */
                        if (a + b == c + d) {
                            System.out.println("a + b == c + d : " + true);
                        }
                        if (a + c == b + d) {
                            System.out.println("a + c == b + d : " + true);
                        }
                        if (a + d == b + c) {
                            System.out.println("a + d == b + c : " + true);
                        } else System.out.println("Tveri gumarnery havasar chen : " + false);


                        /**
                         * Test 35
                         *Ete trvac tveric meky havasar e myus ereq tveri gumarin tpel true hakarak depqum false
                         */
                        if (a == b + c + d) {
                            System.out.println("a == b + c + d : " + true);
                        } else if (b == a + c + d) {
                            System.out.println("b == a + c + d : " + true);
                        } else if (c == a + b + d) {
                            System.out.println("c == a + b + d : " + true);
                        } else if (d == a + b + c) {
                            System.out.println("d == a + b + c : " + true);
                        } else System.out.println("Tveric voch meky havasar che myus ereqi gumarin : " + false);


                        /**
                         * Test 36
                         * Ete trvac tveric gone erkusy kent en tpel 1 hakarak depqum tpel 2
                         */
                        if (a % 2 == 1 && b % 2 == 1) {
                            System.out.println("a-n u b-n kent en : " + 1);
                        } else if (a % 2 == 1 && c % 2 == 1) {
                            System.out.println("a-n u c-n kent en : " + 1);
                        } else if (a % 2 == 1 && d % 2 == 1) {
                            System.out.println("a-n u d-n kent en : " + 1);
                        } else if (b % 2 == 1 && c % 2 == 1) {
                            System.out.println("b-n u c-n kent en : " + 1);
                        } else if (b % 2 == 1 && d % 2 == 1) {
                            System.out.println("b-n u d-n kent en : " + 1);
                        } else if (c % 2 == 1 && d % 2 == 1) {
                            System.out.println("c-n u d-n kent en : " + 1);
                        } else System.out.println("Chorsic erkusy kent chen : " + 2);
                    }
                }
            }
        }
    }
}