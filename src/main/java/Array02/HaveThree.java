package Array02;

import java.util.Arrays;

public class HaveThree {
    /*
    * Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
    * and no 3's are next to each other.
    *
    * haveThree([3, 1, 3, 1, 3]) → true
    * haveThree([3, 1, 3, 3]) → false
    * haveThree([3, 4, 3, 3, 4]) → false
    *
    * Solved thanks to : http://www.javaproblems.com/2013/11/java-array-2-havethree-codingbat.html
    * */
    public static boolean haveThree(int[] nums) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=3) {
                flag = false;
            }
            if (nums[i] == 3 && flag == true) {
                return false;
            }
            if (nums[i] == 3 && flag == false) {
                flag = true;
                count++;
            }
        }

        if (count == 3) {
            return true;
        } else {
            return  false;
        }
    }

}
