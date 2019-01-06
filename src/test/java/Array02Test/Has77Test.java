package Array02Test;

import Array02.Has77;
import org.junit.Assert;
import org.junit.Test;

public class Has77Test {
    @Test
    public void sampleTest() {
        Has77 h77 = new Has77();
        Assert.assertTrue(h77.has77(new int[]{1, 7, 7}));
        Assert.assertTrue(h77.has77(new int[]{7, 7}));
        Assert.assertTrue(h77.has77(new int[]{7, 1, 7}));
        Assert.assertFalse(h77.has77(new int[]{1, 7, 1, 1, 7}));
        Assert.assertFalse(h77.has77(new int[]{2, 7, 2, 2, 7, 2}));
    }
}
