package Array02Test;

import Array02.Sum13;
import org.junit.Assert;
import org.junit.Test;

public class Sum13Test {
    @Test
    public void sampleTest() {
        Sum13 s13 = new Sum13();
        Assert.assertEquals(6, s13.sum13(new int[]{1, 2, 2, 1}));
        Assert.assertEquals(2, s13.sum13(new int[]{1, 1}));
        Assert.assertEquals(2, s13.sum13(new int[]{1, 1}));
        Assert.assertEquals(6, s13.sum13(new int[]{1, 2, 2, 1, 13}));
        Assert.assertEquals(4, s13.sum13(new int[]{1, 2, 13, 2, 1, 13}));
    }
}
