package Array01Test;

import Array01.MakeMiddle;
import org.junit.Assert;
import org.junit.Test;

public class MakeMiddleTest {
    @Test
    public void sampleTest() {
        MakeMiddle md = new MakeMiddle();
        Assert.assertArrayEquals(new int[]{2, 3}, md.makeMiddle(new int[]{1, 2, 3, 4}));
    }
}
