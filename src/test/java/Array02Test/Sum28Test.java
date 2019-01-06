package Array02Test;

import Array02.Sum28;
import org.junit.Assert;
import org.junit.Test;

public class Sum28Test {
    @Test
    public void sampleTest() {
        Sum28 s28 = new Sum28();
        Assert.assertTrue(s28.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        Assert.assertFalse(s28.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        Assert.assertFalse(s28.sum28(new int[]{1, 2, 3, 4}));
    }
}
