package Warmup02Test;

import Warmup02.FrontTimes;
import org.junit.Assert;
import org.junit.Test;

public class FrontTImesTest {
    /*
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"
     */

    @Test
    public void chochochoTest() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("ChoChoCho", ft.frontTimes("Chocolate", 3));
    }

    @Test
    public void chochoTest() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("ChoCho", ft.frontTimes("Chocolate", 2));
    }

    @Test
    public void abcabcabcTest() {
        FrontTimes ft = new FrontTimes();
        Assert.assertEquals("AbcAbcAbc", ft.frontTimes("Abc", 3));
    }
}
