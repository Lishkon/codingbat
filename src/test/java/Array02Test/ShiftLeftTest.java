package Array02Test;

import Array02.ShiftLeft;
import org.junit.Assert;
import org.junit.Test;

public class ShiftLeftTest {
    @Test
    public void sampleTest() {
        ShiftLeft sl = new ShiftLeft();
        Assert.assertArrayEquals(new int[]{2, 5, 3, 6}, sl.shiftLeft(new int[]{6, 2, 5, 3}));
        Assert.assertArrayEquals(new int[]{2, 1}, sl.shiftLeft(new int[]{1, 2}));
        Assert.assertArrayEquals(new int[]{1}, sl.shiftLeft(new int[]{1}));
    }
}
