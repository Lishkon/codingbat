package Array01;


public class Unlucky1 {
    public boolean unlucky1(int[] nums) {

        for (int i = 0; i<nums.length-1; i++) {
            if (i<2 || i>nums.length-3){
                if (nums[i]==1 && nums[i+1]==3) {
                    return true;

                }
            }
        }
        return false;
    }

}
