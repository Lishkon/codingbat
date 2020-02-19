package String02Test;

import String02.StarOut;
import org.junit.Assert;
import org.junit.Test;

/**
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */
public class StarOutTest {
    @Test
    public void sampleTest_one() {
        StarOut so = new StarOut();
        Assert.assertEquals("ad", so.starOut("ab*cd"));
    }

    @Test
    public void sampleTest_two() {
        StarOut so = new StarOut();
        Assert.assertEquals("ad", so.starOut("ab**cd"));
    }

    @Test
    public void sampleTest_three() {
        StarOut so = new StarOut();
        Assert.assertEquals("silly", so.starOut("sm*eilly"));
    }
}
