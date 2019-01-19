package Array02Test;

import Array02.ZeroMax;
import org.junit.Assert;
import org.junit.Test;

public class ZeroMaxTest {
  //  zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
//  zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
//  zeroMax([0, 1, 0]) → [1, 1, 0]
  @Test
  public void sampleTest() {
    ZeroMax zm = new ZeroMax();
    Assert.assertArrayEquals(new int[]{5,5,3,3}, zm.zeroMax(new int[]{0,5,0,3}));
    Assert.assertArrayEquals(new int[]{3, 4, 3, 3}, zm.zeroMax(new int[]{0, 4, 0, 3}));
    Assert.assertArrayEquals(new int[]{1, 1, 0}, zm.zeroMax(new int[]{0, 1, 0}));
  }
}
