public class Number {


    static void number(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + nums[i + 1] == 10) {
                System.out.print(nums[i]);
                System.out.println(nums[i + 1]);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {5,4,6,8,2,8,1,7,3};
       number(num);
    }
}