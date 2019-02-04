package String02Test;

import String02.PrefixAgain;
import org.junit.Assert;
import org.junit.Test;

public class PrefixAgainTest {
  @Test
  public void sampleTest_one(){
    PrefixAgain pa = new PrefixAgain();
    Assert.assertTrue(pa.prefixAgain("abXYabc", 1));
    Assert.assertTrue(pa.prefixAgain("abXYabc", 2));
    Assert.assertTrue(pa.prefixAgain("aa", 1));
    Assert.assertFalse(pa.prefixAgain("abXYabc", 3));
  }

}
