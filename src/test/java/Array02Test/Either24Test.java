package Array02Test;

import Array02.Either24;
import org.junit.Assert;
import org.junit.Test;

public class Either24Test {
  @Test
  public void sampleTest() {
    Either24 e24 = new Either24();
    Assert.assertTrue(e24.either24(new int[]{1, 2, 2}));
    Assert.assertTrue(e24.either24(new int[]{4, 4, 1}));
    Assert.assertFalse(e24.either24(new int[]{4, 4, 2, 2}));
  }
}
