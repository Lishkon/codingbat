package Array02;

public class IsEverywhere {
  public static boolean isEverywhere(int[] nums, int val) {
    for (int i = 0; i <= nums.length-2; i++) {
      if (nums[i] != val && nums[i + 1] != val) {
        return false;
      }
    }
    return true;

  }

}
