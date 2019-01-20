package Array02Test;

import Array02.Has22;
import org.junit.Assert;
import org.junit.Test;

public class Has22Test {
  @Test
  public void sampleTest() {
    Has22 h22 = new Has22();
    Assert.assertTrue(h22.has22(new int[]{1, 2, 2}));
    Assert.assertFalse(h22.has22(new int[]{1, 2, 4, 2}));
    Assert.assertFalse(h22.has22(new int[]{2, 1, 2}));
  }
}
