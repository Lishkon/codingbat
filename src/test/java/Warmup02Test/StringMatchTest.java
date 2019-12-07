package Warmup02Test;

import Warmup02.StringMatch;
import org.junit.Assert;
import org.junit.Test;

public class StringMatchTest {
    /*
        stringMatch("xxcaazz", "xxbaaz") → 3
        stringMatch("abc", "abc") → 2
        stringMatch("abc", "axc") → 0
     */
    @Test
    public void xxccaazzTest() {
        StringMatch sm = new StringMatch();
        Assert.assertEquals(3, sm.stringMatch("xxcaazz", "xxbaaz"));
    }

    @Test
    public void abcTest() {
        StringMatch sm = new StringMatch();
        Assert.assertEquals(2, sm.stringMatch("abc", "abc"));
    }

    @Test
    public void axcTest() {
        StringMatch sm = new StringMatch();
        Assert.assertEquals(0, sm.stringMatch("abc", "axc"));
    }
}
