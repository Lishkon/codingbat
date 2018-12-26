package String01Test;

import String01.MiddleThree;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MiddleThreeTest {
    @Test
    public void candyTest() {
        MiddleThree mt = new MiddleThree();
        Assert.assertEquals("and", mt.middleThree("Candy"));
    }

    @Test
    public void andTest() {
        MiddleThree mt = new MiddleThree();
        Assert.assertEquals("and", mt.middleThree("and"));
    }

    @Test
    public void solvingTest() {
        MiddleThree mt = new MiddleThree();
        Assert.assertEquals("lvi", mt.middleThree("solving"));
    }

}
