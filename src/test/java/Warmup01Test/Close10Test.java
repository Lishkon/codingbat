package Warmup01Test;

import Warmup01.Close10;
import org.junit.Assert;
import org.junit.Test;

public class Close10Test {
    @Test
    public void test() {
        Close10 c10 = new Close10();
        Assert.assertTrue(c10.close10(8, 13) == 8);
        Assert.assertTrue(c10.close10(5, 10) == 10);
        Assert.assertTrue(c10.close10(10, 10) == 0);

    }
}
