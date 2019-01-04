package Array02;

import java.util.Arrays;

public class WithoutTen {
    /*
     * Return a version of the given array where all the 10's have been removed.
     * The remaining elements should shift left towards the start of the array as needed,
     * and the empty spaces a the end of the array should be 0.
     * So {1, 10, 10, 2} yields {1, 2, 0, 0}.
     * You may modify and return the given array or make a new array.
     *
     * My personal solution was not so successfull, so I started to look up for other solutions online
     * and found one here: http://gregorulm.com/codingbat-java-array-2-part-iii/
     * Yes, I copied itm but i thoroughly studied it to benefit in future.
     * */
    public static int[] withoutTen(int[] nums) {
        int[] copy = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 10) {
                copy[index] = nums[i];
                index++;
            }
        return copy;
    }

}
