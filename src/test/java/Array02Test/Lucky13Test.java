package Array02Test;

import Array02.Lucky13;
import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
    /*
     *   lucky13([0, 2, 4]) → true
     *   lucky13([1, 2, 3]) → false
     *   lucky13([1, 2, 4]) → false
     */
    @Test
    public void sampleTest() {
        Lucky13 l13 = new Lucky13();
        Assert.assertTrue(l13.lucky13(new int[]{0,2,4}));
        Assert.assertFalse(l13.lucky13(new int[]{1,2,4}));
        Assert.assertFalse(l13.lucky13(new int[]{1,2,3}));
        Assert.assertFalse(l13.lucky13(new int[]{5,2,3}));

    }
}
