import java.util.Arrays;

public class Array1Test {

//    public static boolean firstLast6(int[] nums) {
//        if ((nums[0] == 6) || (nums[nums.length-1] == 6)){
//            return true;
//        }
//        return false;
//    }


//    public boolean sameFirstLast(int[] nums) {
//        return ((nums.length >= 1) && (nums[0] == nums[nums.length - 1]));
//
//    }


    //public boolean commonEnd(int[] a, int[] b) {
//    if (( a[0] == b[0]) || a[a.length-1] == b[b.length-1]) {
//        return true;
//    }
//return false;
//}


//    public int sum3(int[] nums) {
//        int number = 0;
//        for (int i = 0; i < nums.length; i++) {
//            number = number + nums[i];
//        }
//        return number;
//
//    }


//    public int[] rotateLeft3(int[] nums) {
//        int [] array = new int[3];
//        array[0] = nums[2];
//        array[1]= nums[1];
//        array[2]= nums[0];
//        return array;
//    }


//    public int[] reverse3(int[] nums) {
//        int[] array = new int[3];
//        array[0] = nums[2];
//        array[1] = nums[1];
//        array[2] = nums[0];
//        return array;
//    }


//    public int[] maxEnd3(int[] nums) {
//        int max = nums[0];
//        int[] array = new int[3];
//        if (nums[0] < nums[nums.length - 1]) {
//            max = nums[nums.length - 1];
//        }
//        array[0] = max;
//        array[1] = max;
//        array[2] = max;
//        return array;
//    }


//    public int sum2(int[] nums) {
//        if (nums.length >= 2){
//            return nums[0] + nums[1];
//        }
//        if (nums.length == 1){
//            return nums[0];
//        }
//        return 0;
//
//    }


//    public int[] middleWay(int[] a, int[] b) {
//        int[] array = new int[2];
//        array[0]= a[1];
//        array[1]= b[1];
//        return array;
//
//    }


//    public int[] makeEnds(int[] nums) {
//        int [] array = new int[2];
//        array[0] = nums[0];
//        array[1] = nums[nums.length-1];
//        return array;
//
//    }


//    public boolean has23(int[] nums) {
//        return  ((nums[0] == 2) || (nums[1]== 2)) || ((nums[0] == 3) || (nums[1]== 3));
//    }


//    public boolean no23(int[] nums) {
//        return (!(((nums[0] == 2) || (nums[1] == 2)) || ((nums[0] == 3) || (nums[1] == 3)))) ;
//    }


//    public int[] makeLast(int[] nums) {
//        int[] array = new int[nums.length * 2];
//        for (int i = 0; i < array.length-2;i++){
//            array[i] = 0;
//        }
//        array[array.length-1] = nums[nums.length-1];
//        return array;
//    }


//    public boolean double23(int[] nums) {
//
//        if (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) ){
//            return true;
//        }
//        if(nums.length <=2){
//            return false;
//        }
//
//        return false;
//    }


//    public int[] fix23(int[] nums) {
//        if ((nums[0]==2)&& (nums[1]==3)){
//            nums[1]= 0;
//        }if ((nums[1]==2)&& (nums[2]==3)) {
//            nums[2] = 0;
//        }
//        return nums;
//    }


//    public int[] biggerTwo(int[] a, int[] b) {
//        if ((a[0]+ a[1]) > (b[0] + b[1])){
//            return a;
//
//        }
//        if((a[0]+ a[1]) < (b[0] + b[1])){
//            return b;
//        }
//        return a;
//
//    }


//    public int[] makeMiddle(int[] nums) {
//        if (nums.length == 2) {
//            return nums;
//        }
//        int [] array = new int[2];
//        array[0]=nums[nums.length/2 -1];
//        array[1]=nums[nums.length/2];
//        return array;
//    }


//    public int[] plusTwo(int[] a, int[] b) {
//        int[] array = new int[4];
//        array[0]=a[0];
//        array[1]=a[1];
//        array[2]=b[0];
//        array[3]=b[1];
//        return array;
//
//    }


//    public int[] swapEnds(int[] nums) {
//        int temp = nums[0];
//        nums[0] = nums[nums.length-1];
//        nums[nums.length-1] = temp;
//        return nums;
//
//    }

//    public int[] midThree(int[] nums) {
//        if (nums.length == 3) {
//            return nums;
//        }
//        int [] array = new int[3];
//        array[0]=nums[nums.length/2 -1];
//        array[1]=nums[nums.length/2];
//        array[2]=nums[nums.length/2 + 1];
//        return array;
//
//    }


//    public int maxTriple(int[] nums) {
//        int max = 0;
//        int a = nums[0];
//        int b = nums[((nums.length + 1) / 2) - 1];
//        int c = nums[nums.length - 1];
//
//        if (a > b && a > c)
//        max = a;
//        if (b > a && b > c)
//        max = b;
//        if (c > a && c > b)
//        max = c;
//        return max;
//    }


//    public int[] frontPiece(int[] nums) {
//        int [] array = new int[2];
//        if (nums.length<=2){
//            return nums;
//        }
//        array[0] = nums[0];
//        array[1] = nums[1];
//        return array;
//
//    }


//    public int[] front11(int[] a, int[] b) {
//        int[] array1 = new int[2];
//        int[] array2 = new int[1];
//        int [] array3 = new int[0];
//        if (a.length == 0 && b.length == 0){
//            return array3;
//        }
//
//        if (b.length < 1) {
//            array2[0] = a[0];
//            return array2;
//        }
//        if (a.length < 1) {
//            array2[0] = b[0];
//            return array2;
//        } else {
//            array1[0] = a[0];
//            array1[1] = b[0];
//            return array1;
//        }
//
//    }


//    public int[] make2(int[] a, int[] b) {
//        int[] array = new int[2];
//        if (a.length == 1) {
//            array[0] = a[0];
//            array[1] = b[0];
//        }
//        if (a.length >= 2) {
//            array[0] = a[0];
//            array[1] = a[1];
//        }
//        if (a.length == 0 && b.length >= 2) {
//            array[0] = b[0];
//            array[1] = b[1];
//        }
//        return array;
//    }


//    public boolean unlucky1(int[] nums) {
//        if (nums.length <= 1) {
//            return false;
//        }
//        if (nums[0] == 1 && nums[1] == 3) {
//            return true;
//        }
//        if (nums[1] == 1 && nums[2] == 3) {
//            return true;
//        }
//        if (nums[nums.length - 1] == 3 && nums[nums.length - 2] == 1) {
//            return true;
//        }
//        if (nums[nums.length - 2] == 3 && nums[nums.length - 3] == 1) {
//            return true;
//        }
//        return false;
//    }


    //    public int start1(int[] a, int[] b) {
//        int c = 2;
//        int d = 1;
//        int e = 0;
//
//        if (a.length == 0 && b.length == 0) {
//            return e;
//        }
//        if (a.length > 1 && a[0] == 1 && b.length == 0) {
//            return d;
//        }
//        if (a.length == 0  && b.length > 1 && b[0] == 1) {
//            return d;
//        }
//        if ((a[0] == 1) && (b[0] == 1)) {
//            return c;
//        }
//        if (b.length== 0){
//            return e;
//        }
//
//        if (b[0] == 1) {
//            return d;
//        }
//        return e;
//    }

}
