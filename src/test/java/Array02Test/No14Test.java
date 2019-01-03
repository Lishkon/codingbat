package Array02Test;

import Array02.No14;
import org.junit.Assert;
import org.junit.Test;

public class No14Test {
    /*
     *   Given an array of ints, return true if it contains no 1's or it contains no 4's.
     *
     *      no14([1, 2, 3]) → true
     *      no14([1, 2, 3, 4]) → false
     *      no14([2, 3, 4]) → true
     *
     * */
    @Test
    public void sampleTest() {
        No14 n14 = new No14();
        Assert.assertTrue(n14.no14(new int[]{1,2,3}));
        Assert.assertTrue(n14.no14(new int[]{2,3,4}));
        Assert.assertFalse(n14.no14(new int[]{1,2,3,4}));

    }
}
