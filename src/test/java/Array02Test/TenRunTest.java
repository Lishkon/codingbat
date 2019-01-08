package Array02Test;

import Array02.TenRun;
import org.junit.Assert;
import org.junit.Test;

public class TenRunTest {
    @Test
    public void sampleTest() {
        TenRun tr = new TenRun();
        Assert.assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, tr.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        Assert.assertArrayEquals(new int[]{10, 10, 20, 20}, tr.tenRun(new int[]{10, 1, 20, 2}));
        Assert.assertArrayEquals(new int[]{10, 10, 10, 20}, tr.tenRun(new int[]{10, 1, 9, 20}));
    }
}
