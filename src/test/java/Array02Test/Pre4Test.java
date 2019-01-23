package Array02Test;

import Array02.Pre4;
import org.junit.Assert;
import org.junit.Test;

public class Pre4Test {


  @Test
  public void sampleTest_one() {
    Pre4 p4 = new Pre4();
    Assert.assertArrayEquals(new int[]{1, 2}, p4.pre4(new int[]{1, 2, 4, 1}));
  }

  @Test
  public void sampleTest_two() {
    Pre4 p4 = new Pre4();
    Assert.assertArrayEquals(new int[]{3, 1}, p4.pre4(new int[]{3, 1, 4}));
  }

  @Test
  public void sampleTest_three() {
    Pre4 p4 = new Pre4();
    Assert.assertArrayEquals(new int[]{1}, p4.pre4(new int[]{1, 4, 4}));
  }

  @Test
  public void sampleTest_four() {
    Pre4 p4 = new Pre4();
    Assert.assertArrayEquals(new int[]{1, 3}, p4.pre4(new int[]{1, 3, 4, 2, 4}));
  }

}
