package Array02Test;

import Array02.CenteredAverage;
import org.junit.Assert;
import org.junit.Test;

public class CenteredAverageTest {
  /* centeredAverage([1, 2, 3, 4, 100]) → 3
   * centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
   * centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
   * **/
  @Test
  public void sampleTest_one() {
    CenteredAverage ca = new CenteredAverage();
    Assert.assertEquals(3, ca.centeredAverage(new int[]{1, 2, 3, 4, 100}));
  }

  @Test
  public void sampleTest_two() {
    CenteredAverage ca = new CenteredAverage();
    Assert.assertEquals(5, ca.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
  }

  @Test
  public void sampleTest_three() {
    CenteredAverage ca = new CenteredAverage();
    Assert.assertEquals(-3, ca.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
  }
}
