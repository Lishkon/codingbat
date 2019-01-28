package Array02Test;

import Array02.EvenOdd;
import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {
  /*
   * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
   * evenOdd([3, 3, 2]) → [2, 3, 3]
   * evenOdd([2, 2, 2]) → [2, 2, 2]
   **/
  @Test
  public void sampleTest_one() {
    EvenOdd eo = new EvenOdd();
    Assert.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, eo.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
  }

  @Test
  public void sampleTest_two() {
    EvenOdd eo = new EvenOdd();
    Assert.assertArrayEquals(new int[]{2, 3, 3}, eo.evenOdd(new int[]{3, 3, 2}));
  }

  @Test
  public void sampleTest_three() {
    EvenOdd eo = new EvenOdd();
    Assert.assertArrayEquals(new int[]{2, 2, 2}, eo.evenOdd(new int[]{2, 2, 2}));
  }
}
