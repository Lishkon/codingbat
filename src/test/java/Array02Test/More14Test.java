package Array02Test;

import Array02.More14;
import org.junit.Assert;
import org.junit.Test;

public class More14Test {
  @Test
  public void sampleTest() {
    More14 m14 = new More14();
    Assert.assertTrue(m14.more14(new int[]{1, 4, 1}));
    Assert.assertFalse(m14.more14(new int[]{1, 4, 1, 4}));
    Assert.assertTrue(m14.more14(new int[]{1, 1}));
  }
}
