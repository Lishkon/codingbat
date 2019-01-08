package Array02;

public class TripleUp {
    public boolean tripleUp(int[] nums) {
        if (nums.length>=3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                    return true;
                }
            }

        }
        return false;
    }
}
