package Array02Test;

import Array02.ZeroFront;
import org.junit.Assert;
import org.junit.Test;

public class ZeroFrontTest {
  @Test
  public void sampleTest_one() {
    Assert.assertArrayEquals(new int[]{0, 0, 1, 1}, ZeroFront.zeroFront(new int[]{1, 0, 0, 1}));
  }

  @Test
  public void sampleTest_two() {
    Assert.assertArrayEquals(new int[]{0, 0, 1, 1, 1}, ZeroFront.zeroFront(new int[]{0, 1, 1, 0, 1}));
  }

  @Test
  public void sampleTest_three() {
    Assert.assertArrayEquals(new int[]{0, 1}, ZeroFront.zeroFront(new int[]{1, 0}));
  }
}
