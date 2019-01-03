package Array02Test;

import Array02.ModThree;
import org.junit.Assert;
import org.junit.Test;

public class ModThreeTest {
    @Test
    public void sampleTest() {
        ModThree mt = new ModThree();
        Assert.assertTrue(mt.modThree(new int[]{2, 1, 3, 5}));
        Assert.assertFalse(mt.modThree(new int[]{2, 1, 2, 5}));
        Assert.assertTrue(mt.modThree(new int[]{2, 4, 2, 5}));
    }
}
