package Array01;


public class Double23 {

    public boolean double23(int[] nums) {
        if (nums.length==2) {
            if (nums[0]==2 && nums[1]==2) return true;
            return nums[0] == 3 && nums[1] == 3;


        }
        return false;
    }


}
