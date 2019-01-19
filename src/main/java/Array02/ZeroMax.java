package Array02;

public class ZeroMax {
  /*
   * Return a version of the given array where each zero value in the array is replaced by the largest odd value
   * to the right of the zero in the array.
   * If there is no odd value to the right of the zero, leave the zero as a zero.
   *
   * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
   * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
   * zeroMax([0, 1, 0]) → [1, 1, 0]
   *
   *
   * UPD: needed some help, so googled this solution and went through it step by step to gain better understanding of
   * the problem and it's solution:
   *
   * http://www.javaproblems.com/2012/12/coding-bat-java-array-2-zeromax.html
   **/
  public static int[] zeroMax(int[] nums) {
    int largestOddNumber = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      if(nums[i]!=0 && nums[i]%2==1 && largestOddNumber<nums[i]){
        largestOddNumber=nums[i];
      }
      if(nums[i]==0){
        nums[i]=largestOddNumber;
      }
    }
    return nums;
  }


}
