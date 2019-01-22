package Array02Test;

import Array02.Has12;
import org.junit.Assert;
import org.junit.Test;

public class Has12Test {
  @Test
  public void sampleTest() {
    Has12 h12 = new Has12();
    Assert.assertTrue(h12.has12(new int[]{1,3,2,1,2,3}));
    Assert.assertTrue(h12.has12(new int[]{3, 1, 2}));
    Assert.assertTrue(h12.has12(new int[]{3, 1, 4, 5, 2}));
  }
}
