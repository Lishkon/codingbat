package Array02Test;

import Array02.NotAlone;
import org.junit.Assert;
import org.junit.Test;

public class NotAloneTest {
  /*
   * We'll say that an element in an array is "alone" if there are values before and after it, and those values are
   * different from it. Return a version of the given array where every instance of the given value which is alone is
   * replaced by whichever value to its left or right is larger.
   *
   * notAlone([1, 2, 3], 2) → [1, 3, 3]
   * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
   * notAlone([3, 4], 3) → [3, 4]
   * */

  @Test
  public void sampleTest() {
    NotAlone na = new NotAlone();
    Assert.assertArrayEquals(na.notAlone(new int[]{1,2,3}, 2), new int[]{1,3,3});
    Assert.assertArrayEquals(na.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2), new int[]{1, 3, 3, 5, 5, 2});
    Assert.assertArrayEquals(na.notAlone(new int[]{3, 4}, 3), new int[]{3, 4});
    Assert.assertArrayEquals(na.notAlone(new int[]{1,1,1,2}, 1), new int[]{1,1,1,2});
  }
}
