package Array02;

public class TwoTwo {

  /*
   * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
   *
   * twoTwo([4, 2, 2, 3]) → true
   * twoTwo([2, 2, 4]) → true
   * twoTwo([2, 2, 4, 2]) → false
   * */
  public boolean twoTwo(int[] nums) {
    boolean result = true;
    boolean found = false;

    for(int i = 0; i < nums.length; i++) {
      // Checking if there are some twos
      if(nums[i] != 2) {
        found = false;
      }
      // Checking cases consisting of two's only
      if(nums[i] == 2 && found) {
        result = true;
      }
      // Checking edge cases
      if(nums[i] == 2 && !found) {
        found = true;
        result = false;
      }

    }
    return result;
  }

//  public static void main(String[] args) {
//    System.out.println(twoTwo(new int[]{1,2,2,3,2}));
//  }



}
