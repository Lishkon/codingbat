package Array02Test;

import Array02.BigDiff;
import org.junit.Assert;
import org.junit.Test;

public class BigDiffTest {
    /* bigDiff([10, 3, 5, 6]) → 7
     * bigDiff([7, 2, 10, 9]) → 8
     * bigDiff([2, 10, 7, 2]) → 8
     * */
    @Test
    public void sampleTest() {
        BigDiff bd = new BigDiff();
        Assert.assertEquals(7, bd.bigDiff(new int[]{10, 3, 5, 6}));
        Assert.assertEquals(8, bd.bigDiff(new int[]{7, 2, 10, 9}));
        Assert.assertEquals(8, bd.bigDiff(new int[]{2, 10, 7, 2}));
    }
}
