package Array02Test;

import Array02.HaveThree;
import org.junit.Assert;
import org.junit.Test;

public class HaveThreeTest {
    @Test
    public void sampleTest() {
        HaveThree ht = new HaveThree();
        Assert.assertTrue(ht.haveThree(new int[]{3, 1, 3, 1, 3}));
        Assert.assertFalse(ht.haveThree(new int[]{3, 1, 3, 3}));
        Assert.assertFalse(ht.haveThree(new int[]{3, 4, 3, 3, 4}));
    }
}
