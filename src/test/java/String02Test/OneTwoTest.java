package String02Test;

import String02.OneTwo;
import org.junit.Assert;
import org.junit.Test;

/* oneTwo("abc") → "bca"
 * oneTwo("tca") → "cat"
 * oneTwo("tcagdo") → "catdog"
 */
public class OneTwoTest {
  @Test
  public void sampleTest_one() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("bca", ot.oneTwo("abc"));
  }

  @Test
  public void sampleTest_two() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("", ot.oneTwo("bc"));
  }

  @Test
  public void sampleTest_three() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("cat", ot.oneTwo("tca"));
  }

  @Test
  public void sampleTest_four() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("catdog", ot.oneTwo("tcagdo"));
  }

  @Test
  public void sampleTest_five() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("leatex", ot.oneTwo("alextest"));
  }

  @Test
  public void sampleTest_six() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("", ot.oneTwo(""));
  }

  @Test
  public void sampleTest_seven() {
    OneTwo ot = new OneTwo();
    Assert.assertEquals("", ot.oneTwo("x"));
  }
}
