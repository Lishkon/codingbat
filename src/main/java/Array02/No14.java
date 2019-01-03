package Array02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class No14 {
    /*
     *   Given an array of ints, return true if it contains no 1's or it contains no 4's.
     *
     *      no14([1, 2, 3]) → true
     *      no14([1, 2, 3, 4]) → false
     *      no14([2, 3, 4]) → true
     *
     * */
    public static boolean no14(int[] nums) {
        boolean two = false,four = false;
        for(int count = 0;count <nums.length; count++) {
            if (nums[count] == 1)
                two = true;
            if(nums[count] == 4)
                four = true;
        }
        if(nums.length == 0 || nums.length == 1)
            return true;
        else if (two ==true && four ==true)
            return false;
        else if (two || four)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(no14(new int[]{1,2,3,4}));// should be false
        System.out.println(no14(new int[]{1,2,3}));// should be true
        System.out.println(no14(new int[]{2,3,4}));// should be true
        System.out.println(no14(new int[]{2,3,4,1}));// should be false
    }

}
