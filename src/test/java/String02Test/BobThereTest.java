package String02Test;

import String02.BobThere;
import org.junit.Assert;
import org.junit.Test;

public class BobThereTest {
  /* bobThere("abcbob") → true
   * bobThere("b9b") → true
   * bobThere("bac") → false
   * */
  @Test
  public void sampleTest_one() {
    BobThere bt = new BobThere();
    Assert.assertTrue(bt.bobThere("abcbob"));
  }

  @Test
  public void sampleTest_two() {
    BobThere bt = new BobThere();
    Assert.assertTrue(bt.bobThere("b9b"));
  }

  @Test
  public void sampleTest_three() {
    BobThere bt = new BobThere();
    Assert.assertFalse(bt.bobThere("bac"));
  }
}
