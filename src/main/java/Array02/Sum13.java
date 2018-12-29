package Array02;

public class Sum13 {
    /*
     * Return the sum of the numbers in the array, returning 0 for an empty array.
     * Except the number 13 is very unlucky, so it does not count and numbers that come
     * immediately after a 13 also do not count.
     * */
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i]==13 && i < nums.length-1) {
                nums[i] = 0;
                nums[i+1] = 0;

            }

            if (nums[i] == 13 && i == nums.length-1){
                nums[i] = 0;
                break;
            }
            sum += nums[i];


        }
        return sum;
    }

}
