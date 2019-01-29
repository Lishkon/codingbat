package String02Test;

import String02.DoubleChar;
import org.junit.Assert;
import org.junit.Test;

public class DoubleCharTest {
  /* doubleChar("The") → "TThhee"
   * doubleChar("AAbb") → "AAAAbbbb"
   * doubleChar("Hi-There") → "HHii--TThheerree"
   **/
  @Test
  public void sampleTest_one() {
    DoubleChar dc = new DoubleChar();
    Assert.assertEquals("TThhee", dc.doubleChar("The"));
  }

  @Test
  public void sampleTest_two() {
    DoubleChar dc = new DoubleChar();
    Assert.assertEquals("AAAAbbbb", dc.doubleChar("AAbb"));
  }

  @Test
  public void sampleTest_three() {
    DoubleChar dc = new DoubleChar();
    Assert.assertEquals("HHii--TThheerree", dc.doubleChar("Hi-There"));
  }
}
