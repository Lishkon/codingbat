package String02Test;

import String02.EndOther;
import org.junit.Assert;
import org.junit.Test;

public class EndOtherTest {

  @Test
  public void sampleTest_one() {
    EndOther eo = new EndOther();
    Assert.assertTrue(eo.endOther("Hiabc", "abc"));
  }

  @Test
  public void sampleTest_two() {
    EndOther eo = new EndOther();
    Assert.assertTrue(eo.endOther("AbC", "HiaBc"));
  }

  @Test
  public void sampleTest_three() {
    EndOther eo = new EndOther();
    Assert.assertTrue(eo.endOther("abc", "abXabc"));
  }

  @Test
  public void sampleTest_four() {
    EndOther eo = new EndOther();
    Assert.assertTrue(eo.endOther("aasabc", "bc"));
  }
}
