public class Tigrana {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                size++;
            }

        }
        int[] newArray = new int[size];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                newArray[j] = array[i];
                j++;
            }

        }
        for (int element : newArray) {
            System.out.print(element +"  ");
        }
    }
}
