package String02Test;

import String02.SameStarChar;
import org.junit.Assert;
import org.junit.Test;

public class SameStarCharTest {
   /* sameStarChar("xy*yzz") → true
    * sameStarChar("xy*zzz") → false
    * sameStarChar("*xa*az") → true
    **/

  @Test
  public void sampleTest_one() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertTrue(ssc.sameStarChar("xy*yzz"));
  }

  @Test
  public void sampleTest_two() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertTrue(ssc.sameStarChar("*xa*az"));
  }

  @Test
  public void sampleTest_four() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertFalse(ssc.sameStarChar("xy*zzz"));
  }

  @Test
  public void sampleTest_five() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertFalse(ssc.sameStarChar("XY*YYYY*Z*"));
  }

  @Test
  public void sampleTest_six() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertTrue(ssc.sameStarChar(""));
  }

  @Test
  public void sampleTest_seven() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertTrue(ssc.sameStarChar("*"));
  }

  @Test
  public void sampleTest_eight() {
    SameStarChar ssc = new SameStarChar();
    Assert.assertTrue(ssc.sameStarChar("**"));
  }
}
