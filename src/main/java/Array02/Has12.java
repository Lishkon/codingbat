package Array02;

public class Has12 {
  public boolean has12(int[] nums) {
    /*
     * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
     *
     * has12([1, 3, 2]) → true
     * has12([3, 1, 2]) → true
     * has12([3, 1, 4, 5, 2]) → true
     * */
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 1) {
        for (int j = i; j <= nums.length-1; j++) {
          if (nums[j] == 2) {
            return true;
          }
        }
      }
    }
    return false;
  }

}
