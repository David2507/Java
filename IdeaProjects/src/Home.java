import java.util.Arrays;
import java.util.Scanner;

public class Home {
    int window;
    int money;
    int money1;
    boolean isEuroWindow;
    int floor;
    int roomNumbers;

    public int windowPrice(int window, int roomNumbers, int floor, boolean isEuroWindow) {
        if (isEuroWindow) {
            if (window > 5 && roomNumbers == 3) {
                money = 5000;
            }
            if (window < 10 && roomNumbers == 2 && floor == 2) {
                money = 3000;

            }

        } else {
            if (window > 5 && roomNumbers == 3) {
                money = 2000;

            }
            if (window < 10 && roomNumbers == 2 && floor == 2) {
                money = 1000;
            }
        }

        return money;
    }

    public int homePrice(int floor, int roomNumbers) {
        if (floor == 1 || floor == 9) {
            money1 = roomNumbers * 10000;
        }
        if (floor > 1 && floor < 9){
            money1 = roomNumbers * 15000;
        }
            return money1;
    }


}
