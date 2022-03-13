public class Moto {
    int wheel;
    int speed;
    int money;
    int year;
    String color;
    String model;

    public int yearMoto(int wheel, String color, String model,int money) {
        if (wheel == 2 && color.equals("black") && model.equals("BMW") && money > 10000) {
            year = 2018;

        }
        if (wheel == 3 && speed < 100 && money < 5000)

            year = 2000;
        return year;
    }


    public int wheelPrice (int wheel, int year, String model){
        if (wheel == 2 && year > 2015 && model.equals("BMW")){
            money = 200;
        }
        if (wheel == 3 && year < 2010 && model.equals("BMW")){
            money = 250;
        }
           return money;
    }


}
