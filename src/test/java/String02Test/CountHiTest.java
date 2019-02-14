package String02Test;

import String02.CountHi;
import org.junit.Assert;
import org.junit.Test;

public class CountHiTest {
  @Test
  public void sampleTest_one() {
    CountHi ch = new CountHi();
    Assert.assertEquals(1,ch.countHi("abc hi ho"));
  }

  @Test
  public void sampleTest_two() {
    CountHi ch = new CountHi();
    Assert.assertEquals(2,ch.countHi("ABChi hi"));
  }

  @Test
  public void sampleTest_three() {
    CountHi ch = new CountHi();
    Assert.assertEquals(2,ch.countHi("hihi"));
  }

  @Test
  public void sampleTest_four() {
    CountHi ch = new CountHi();
    Assert.assertEquals(1,ch.countHi("hi"));
  }
}
