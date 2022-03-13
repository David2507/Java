public class MyHome {
    public static void main(String[] args) {
        Home tigran = new Home();
        Home monte = new Home();
        Moto my = new Moto();
        System.out.println("Tigran");
        System.out.print("Price window = ");
        System.out.print(tigran.windowPrice(6,3,2, true));
        System.out.println("$");
        System.out.print("Price home = ");
        System.out.print(tigran.homePrice(1,5));
        System.out.println("$");
        System.out.println();
        System.out.println("Monte");
        System.out.print("Price window = ");
        System.out.print(monte.windowPrice(6,3,2,true));
        System.out.println("$");
        System.out.print("Price home = ");
        System.out.print(monte.homePrice(2,4));
        System.out.println("$");
        System.out.println();
        System.out.print("My moto = ");
        System.out.print(my.yearMoto(2,"black","BMW",15000));
        System.out.println("y.");
        System.out.println();
        System.out.print("Money wheel = ");
        System.out.print(my.wheelPrice(2,2020,"BMW"));
        System.out.println("$");
    }
}
