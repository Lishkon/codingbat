package Array02Test;

import Array02.IsEverywhere;
import org.junit.Assert;
import org.junit.Test;

public class IsEverywhereTest {
  @Test
  public void sampleTest() {
    IsEverywhere ie = new IsEverywhere();
    Assert.assertTrue(ie.isEverywhere(new int[]{1, 2, 1, 3},1));
    Assert.assertFalse(ie.isEverywhere(new int[]{1, 2, 1, 3},2));
    Assert.assertFalse(ie.isEverywhere(new int[]{1, 2, 1, 3, 4},1));
  }
}
