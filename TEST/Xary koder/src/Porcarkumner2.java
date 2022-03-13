import java.util.Arrays;
import java.util.Objects;

public class Porcarkumner2 {
    public static void main(String[] args) {
        //String[] masiv1 = {"Barev", "Hajoxutyun", "Ctesutyun", "Barigalust", "Aroxjutyun"};
        //Arrays.sort(masiv1);
        //System.out.println(Arrays.toString(masiv1));
        //System.out.println(Gcayin1(masiv1,"Ctesutyun"));
        //System.out.println(binarySearch(masiv1, "Hajoxutyun"));

        //String[] masiv2 = {"B","F","Y", "E","Q", "K","O"};
        //Arrays.sort(masiv2);
        //System.out.println(Arrays.toString(masiv2));
        //System.out.println(Gcayin2(masiv2,"Y"));


    }

    //1
    public static int Gcayin1(String arr1[], String text) {

        for (int i = 0; i < arr1.length; ++i) {
            if (Objects.equals(arr1[i], text))
                return i;
        }
        return -1;
    }

    //2
    public static int Gcayin2(String arr2[], String letter) {

        for (int i = 0; ; ++i) {
            if (Objects.equals(arr2[i], letter))
                return i == arr2.length ? -1 : i;
        }

    }

    //3
    public static int binarySearch(String arr1[], String text) {

        int verj = 0;
        int skizb = arr1.length - 1;

        for (int i = (verj + skizb) / 2; verj <= skizb; i = (verj + skizb) / 2) {

            if (Objects.equals(arr1[i], text)) {
                return i;
            }
            int a = text.compareTo(arr1[i]);
            if (a > 0) {
                verj = i + 1;
            } else {
                skizb = i - 1;
            }
        }
        return -1;
    }
}