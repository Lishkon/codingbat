package Array02;

import java.util.Arrays;

public class ShiftLeft {
    /*
     *   Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
     *   You may modify and return the given array, or return a new array.
     * */
    public int[] shiftLeft(int[] nums) {
        int[] newArr = new int[nums.length];
        if (nums.length>0){
            newArr[newArr.length-1] = nums[0];
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = nums[i+1];
            }
        }

        return newArr;
    }

}
