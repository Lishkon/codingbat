package Array02Test;

import Array02.Only14;
import org.junit.Assert;
import org.junit.Test;

public class Only14Test {

    @Test
    public void sampleTest() {
        Only14 o14 = new Only14();
        Assert.assertTrue(o14.only14(new int[]{1, 4, 1, 4}));
        Assert.assertTrue(o14.only14(new int[]{1, 1}));
        Assert.assertFalse(o14.only14(new int[]{1, 4, 2, 4}));
        Assert.assertFalse(o14.only14(new int[]{2}));
    }
}
