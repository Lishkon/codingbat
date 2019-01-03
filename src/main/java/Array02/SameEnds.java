package Array02;

public class SameEnds {
    /*
     * Return true if the group of N numbers at the start and end of the array are the same.
     * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
     * You may assume that n is in the range 0..nums.length inclusive.
     * */
    public boolean sameEnds(int[] nums, int len) {
        /*
         * This is how I thought for the problem, you should also:
         * for len = 1 //Conditions
         * nums[0] == nums[nums.length -1]
         * for len = 2 //Conditions
         * nums[1] == nums[nums.length -1]
         * nums[0] == nums[nums.length -2]
         *
         * for len == 3 //Conditions
         * nums[2] == nums[nums.length -1]
         * nums[1] == nums[nums.length -2]
         * nums[0] == nums[nums.length -3]
         *
         * */

        for (int i = 0; i < len; i++) {
            if (!(nums[i] == nums[nums.length - len + i]))
            return false;
        }
        return true;
    }
}
