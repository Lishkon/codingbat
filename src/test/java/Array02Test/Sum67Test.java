package Array02Test;

import Array02.Sum67;
import org.junit.Assert;
import org.junit.Test;

public class Sum67Test {
    @Test
    public void sampleTest() {
        Sum67 s67 = new Sum67();
        Assert.assertEquals(5, s67.sum67(new int[]{1, 2, 2}));
        Assert.assertEquals(5, s67.sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        Assert.assertEquals(4, s67.sum67(new int[]{1, 1, 6, 7, 2}));
    }
}
