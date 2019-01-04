package Array02Test;

import Array02.WithoutTen;
import org.junit.Assert;
import org.junit.Test;

public class WithoutTenTest {
    @Test
    public void sampleTest() {
        WithoutTen wt = new WithoutTen();
        Assert.assertArrayEquals(new int[]{1, 2, 0, 0}, wt.withoutTen(new int[]{1, 10, 10, 2}));
        Assert.assertArrayEquals(new int[]{2, 0, 0}, wt.withoutTen(new int[]{10, 2, 10}));
        Assert.assertArrayEquals(new int[]{1, 99, 0}, wt.withoutTen(new int[]{1, 99, 10}));
    }
}
