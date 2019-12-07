package Warmup02Test;

import Warmup02.CountXX;
import org.junit.Assert;
import org.junit.Test;

public class CountXXTest {
    /*
            countXX("abcxx") → 1
            countXX("xxx") → 2
            countXX("xxxx") → 3
     */
    @Test
    public void abcxxTest() {
        CountXX cx = new CountXX();
        Assert.assertEquals(1, cx.countXX("abcxx"));
    }

    @Test
    public void xxxTest() {
        CountXX cx = new CountXX();
        Assert.assertEquals(2, cx.countXX("xxx"));
    }

    @Test
    public void xxxxTest() {
        CountXX cx = new CountXX();
        Assert.assertEquals(3, cx.countXX("xxxx"));
    }

}
