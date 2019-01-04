package Array02;

public class Post4 {

    /*
    * Given a non-empty array of ints, return a new array containing the elements from the original array that comes
    * after the last 4 in the original array. The original array will contain at least one 4.
    * Note that it is valid in java to create an array of length 0.
    * */
    public static int[] post4(int[] nums) {
        int pos = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i]==4) pos = i;
        }
        int[] res = new int[nums.length - (pos+1)];
        for (int i = 0, j = pos+1; i < res.length; i++, j++) {
            res[i] = nums[j];
        }
        return res;
    }

}
