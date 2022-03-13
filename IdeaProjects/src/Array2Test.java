public class Array2Test {

//    public int countEvens(int[] nums) {
//        int result =0;
//        for (int i = 0;i < nums.length;i++){
//            if (nums[i] % 2 == 0){
//                result ++;
//            }
//        }
//        return result ;
//    }

//        public int bigDiff(int[] nums) {
//            int min = nums[0];
//            int max = nums[0];
//
//            for (int i = 0; i < nums.length; i++){
//                min = Math.min(min,nums[i]);
//                max = Math.max(max,nums[i]);
//            }
//            return max-min;
//        }


//public int centeredAverage(int[] nums) {
//    int sum = 0;
//    int min = nums[0];
//    int max = nums[0];
//
//    for(int i = 0; i < nums.length; i++) {
//        sum += nums[i];
//        min = Math.min(min, nums[i]);
//        max = Math.max(max, nums[i]);
//    }
//
//    return (sum - min - max) / (nums.length - 2);
//}

//    public int sum13(int[] nums) {
//        int gumar = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 13) {
//                gumar += nums[i];
//                if (i > 0 && nums[i - 1] == 13) {
//                    gumar -= nums[i];
//                }
//            }
//        }
//        return gumar;
//
//    }

//    public int sum67(int[] nums) {
//        int gumar = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 6) {
//                while (nums[i] != 7) {
//                    i++;
//                }
//            } else gumar = gumar + nums[i];
//        }
//        return gumar;
//    }


//    public boolean has22(int[] nums) {
//        for(int i = 0; i < nums.length-1; i++) {
//            if(nums[i] == 2 && nums[i+1] == 2) {
//                return true;
//            }
//        }
//        return false;
//    }


//    public boolean lucky13(int[] nums) {
//
//        for (int i =0; i <nums.length;i++){
//            if (nums[i]==1 || nums[i]==3){
//                return false;
//            }
//        }
//        return true;
//
//    }


//    public boolean sum28(int[] nums) {
//        int gumar = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 2) {
//                gumar += 2;
//            }
//        }
//        return ( gumar==8 );
//    }


    //    public boolean more14(int[] nums) {
//        int balance = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1)
//                balance++;
//            else if (nums[i] == 4)
//                balance--;
//        }
//        return (balance > 0);
//    }


//    public int[] fizzArray(int n) {
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++)
//            arr[i] = i;
//
//        return arr;
//    }


//    public boolean only14(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 1 && nums[i] != 4) {
//                return false;
//            }
//        }
//        return true;
//    }


//    public String[] fizzArray2(int n) {
//            String[] result = new String[n];
//            for (int i = 0; i < n; i++)
//            result[i] = String.valueOf(i);
//            return result;
//        }


//    public boolean no14(int[] nums) {
//        boolean tiv1 = false;
//        boolean tiv2 = false;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] == 1)
//                tiv1 = true;
//
//            if(nums[i] == 4)
//                tiv2 = true;
//        }
//
//        return !tiv1 || !tiv2;
//    }


//    public boolean either24(int[] nums) {
//        boolean has22 = false;
//        boolean has44 = false;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == 2 && nums[i + 1] == 2) {
//                has22 = true;
//            }
//            if (nums[i] == 4 && nums[i + 1] == 4) {
//                has44 = true;
//            }
//
//        }
//        return has22 != has44;
//    }


//    public boolean has77(int[] nums) {
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            if ((nums[i] == 7) && (nums[i + 2] == 7)) {
//                return true;
//            }
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            if ((nums[i] == 7) && (nums[i + 1] == 7)) {
//                return true;
//            }
//
//        }
//        return false;
//    }


//    public boolean has12(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1)  {
//                for (int j =0; j<nums.length;j++){
//                    if(nums[j]==2){
//                        return true;
//                    }
//                }
//
//            }
//        }
//        return false;
//    }


//    public boolean modThree(int[] nums) {
//        for (int i = 0; i < nums.length - 2; i++) {
//            if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0)) {
//                return true;
//            }
//            if ((nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1) && (nums[i + 2] % 2 == 1)) {
//                return true;
//            }
//        }
//        return false;
//    }


//    public boolean haveThree(int[] nums) {
//        int a = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if (nums[i] == 3)  {
//                a++;
//            }
//            if(i + 1 < nums.length) {
//                if (nums[i] == 3 && nums[i + 1] == 3)
//                    return false;
//            }
//        }
//        if (a == 3){
//            return true;
//        }
//        return false;
//    }


//    public boolean twoTwo(int[] nums) {
//        if(nums.length == 1 && nums[0] == 2)
//            return false;
//
//        if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
//                (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
//            return false;
//
//        for(int i = 1; i <= nums.length - 2; i++) {
//            if(nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2)
//                return false;
//        }
//
//        return true;
//    }


//    public boolean sameEnds(int[] nums, int len) {
//        for(int i = 0; i < len; i++) {
//            if(nums[i] != nums[nums.length - len + i])
//                return false;
//        }
//
//        return true;
//    }


//    public int[] fizzArray3(int start, int end) {
//        int[] arr = new int[end - start];
//
//        for (int i = start; i < end; i++)
//            arr[i - start] = i;
//
//        return arr;
//    }


//    public int[] shiftLeft(int[] nums) {
//        if (nums.length < 1) {
//            return nums;
//        }
//        int temp = nums[0];
//        for (int i = 1; i < nums.length; i++)
//            nums[i - 1] = nums[i];
//            nums[nums.length - 1] = temp;
//
//        return nums;
//    }


//    public int[] tenRun(int[] nums) {
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] % 10 == 0) {
//                if (nums[i + 1] % 10 != 0) {
//                    nums[i + 1] = nums[i];
//                }
//            }
//        }
//        return nums;
//    }


//    public int[] pre4(int[] nums) {
////        int temp = 0;
////        while (nums[temp] != 4) {
////            temp++;
////        }
////        int[] array = new int[temp];
////        for (int i = 0; i < temp; i++) {
////            array[i] = nums[i];
////        }
////        return array;
////    }


//    public int[] post4(int[] nums) {
//        int temp = nums.length - 1;
//
//        while(nums[temp] != 4)
//            temp--;
//
//        int[] array = new int[nums.length - temp - 1];
//
//        for(int i = 0; i < array.length; i++)
//            array[i] = nums[temp + i + 1];
//
//        return array;
//    }


//    public int[] zeroFront(int[] nums) {
//        if(nums.length == 0)
//            return nums;
//
//        int a = 0;
//
//        while(nums[a] == 0)
//            a++;
//
//        for(int i = a + 1; i < nums.length; i++) {
//            if(nums[i] == 0) {
//                int temp = nums[a];
//                nums[a] = nums[i];
//                nums[i] = temp;
//                a++;
//            }
//        }
//
//        return nums;
//    }


//    public int[] withoutTen(int[] nums) {
//        int a = 0;
//        while (a < nums.length && nums[a] != 10)
//            a++;
//
//        for (int i = a + 1; i < nums.length; i++) {
//            if (nums[i] != 10) {
//                nums[a] = nums[i];
//                nums[i] = 10;
//                a++;
//            }
//        }
//        for (; a < nums.length; a++)
//            nums[a] = 0;
//        return nums;
//    }


//    public int[] zeroMax(int[] nums) {
//        int max = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == 0) {
//
//                for (int j = i + 1; j <= nums.length - 1; j++) {
//                    if (nums[j] > max && nums[j] % 2 == 1)
//                        max = nums[j];
//                }
//                nums[i] = max;
//                max = 0;
//            }
//        }
//        return nums;
//    }


//    public int[] evenOdd(int[] nums) {
//        int a = 0;
//
//        while(a < nums.length && nums[a] % 2 == 0)
//            a++;
//
//        for(int i = a + 1; i < nums.length; i++) {
//            if(nums[i] % 2 == 0) {
//                int temp = nums[a];
//                nums[a] = nums[i];
//                nums[i] = temp;
//                a++;
//            }
//        }
//
//        return nums;
//    }


//    public String[] fizzBuzz(int start, int end) {
//        String[] array = new String[end - start];
//        for (int i = start; i < end; i++) {
//            if (i % 15 == 0) {
//                array[i - start] = "FizzBuzz";
//            }
//            else if (i % 5 == 0) {
//                array[i - start] = "Buzz";
//            }
//            else if (i % 3 == 0) {
//                array[i - start] = "Fizz";
//            }
//            else {
//                array[i - start] = String.valueOf(i);
//            }
//        }
//
//        return array;
//    }


//    public int[] notAlone(int[] nums, int val) {
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (nums[i] == val)
//                if (nums[i + 1] != nums[i] && nums[i - 1] != nums[i])
//                    if (nums[i + 1] > nums[i - 1]) nums[i] = nums[i + 1];
//                    else if (nums[i +1] < nums[i - 1]) nums[i] = nums[i - 1];
//        }
//        return nums;
//    }


//    public boolean tripleUp(int[] nums) {
//        if (nums.length < 3) {
//            return false;
//        }
//        for (int i = 0; i <= nums.length - 3; i++) {
//            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
//                return true;
//            }
//        }
//        return false;
//    }


//    public static boolean isEverywhere(int[] nums, int val) {
//        if (nums.length <= 1) {
//            return true;
//        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] != val && nums[i + 1] != val) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {5, 4, 6, 4;, 8, 5};
//        System.out.println(isEverywhere(array, 4));
//    }


//    public int matchUp(int[] nums1, int[] nums2) {
//
//
//    }


}





