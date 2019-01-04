package Array02Test;

import Array02.Post4;
import org.junit.Assert;
import org.junit.Test;

public class Post4Test {
    @Test
    public void sampleTest() {
        Post4 p4 = new Post4();
        Assert.assertArrayEquals(new int[]{1,2}, p4.post4(new int[]{2, 4, 1, 2}));
        Assert.assertArrayEquals(new int[]{2}, p4.post4(new int[]{4, 1, 4, 2}));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, p4.post4(new int[]{4, 4, 1, 2, 3}));
        Assert.assertArrayEquals(new int[]{}, p4.post4(new int[]{4}));
    }
}
