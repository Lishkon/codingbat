package Array02Test;

import Array02.TwoTwo;
import org.junit.Assert;
import org.junit.Test;

public class TwoTwoTest {
  @Test
  public void sampleTest_zero() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{4, 2, 2, 3}));
  }

  @Test
  public void sampleTest_one() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{2, 2, 4}));
  }

  @Test
  public void sampleTest_two() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{1}));
  }

  @Test
  public void sampleTest_three() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{1, 3, 4}));
  }

  @Test
  public void sampleTest_four() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{4, 2, 2, 2}));
  }

  @Test
  public void sampleTest_five() {
    TwoTwo tt = new TwoTwo();
    Assert.assertFalse(tt.twoTwo(new int[]{2, 2, 4, 2}));
  }

  @Test
  public void sampleTest_six() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{2, 2, 2}));
  }

  @Test
  public void sampleTest_seven() {
    TwoTwo tt = new TwoTwo();
    Assert.assertTrue(tt.twoTwo(new int[]{}));
  }
}
