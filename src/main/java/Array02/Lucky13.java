package Array02;

public class Lucky13 {
    /*
     *   Given an array of ints, return true if the array contains no 1's and no 3's
     *
     *   lucky13([0, 2, 4]) → true
     *   lucky13([1, 2, 3]) → false
     *   lucky13([1, 2, 4]) → false
     *
     * */
    public boolean lucky13(int[] nums) {
        for (int el : nums) {
            if (el == 1 || el == 3) {
                return false;
            }
        }
        return true;
    }

}
