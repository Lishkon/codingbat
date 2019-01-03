package Array02Test;

import Array02.SameEnds;
import org.junit.Assert;
import org.junit.Test;

public class SameEndsTest {
    @Test
    public void sampleTest() {
        SameEnds se = new SameEnds();
        Assert.assertTrue(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        Assert.assertFalse(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        Assert.assertFalse(se.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
    }

    @Test
    public void zeroInvolvedTest() {
        SameEnds se = new SameEnds();
        Assert.assertTrue(se.sameEnds(new int[]{1, 2, 5, 2, 1}, 0));
        Assert.assertTrue(se.sameEnds(new int[]{1, 1, 1}, 0));
    }

    @Test
    public void emptyArrayTest() {
        SameEnds se = new SameEnds();
        Assert.assertTrue(se.sameEnds(new int[]{}, 0));
    }
}
