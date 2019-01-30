package String02Test;

import String02.СountCode;
import org.junit.Assert;
import org.junit.Test;

public class СountCodeTest {
  /* countCode("aaacodebbb") → 1
   * countCode("codexxcode") → 2
   * countCode("cozexxcope") → 2
   **/
  @Test
  public void sampleTest_one() {
    СountCode cc = new СountCode();
    Assert.assertEquals(1, cc.countCode("aaacodebbb"));
  }

  @Test
  public void sampleTest_two() {
    СountCode cc = new СountCode();
    Assert.assertEquals(2, cc.countCode("codexxcode"));
  }

  @Test
  public void sampleTest_three() {
    СountCode cc = new СountCode();
    Assert.assertEquals(2, cc.countCode("cozexxcope"));
  }
}
