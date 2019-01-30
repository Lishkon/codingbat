package String02Test;

import String02.RepeatEnd;
import org.junit.Assert;
import org.junit.Test;

public class RepeatEndTest {
  /* repeatEnd("Hello", 3) → "llollollo"
   * repeatEnd("Hello", 2) → "lolo"
   * repeatEnd("Hello", 1) → "o"
   **/
  @Test
  public void sampleTest_one() {
    RepeatEnd re = new RepeatEnd();
    Assert.assertEquals("llollollo", re.repeatEnd("Hello",3));
  }

  @Test
  public void sampleTest_two() {
    RepeatEnd re = new RepeatEnd();
    Assert.assertEquals("lolo", re.repeatEnd("Hello",2));
  }

  @Test
  public void sampleTest_three() {
    RepeatEnd re = new RepeatEnd();
    Assert.assertEquals("o", re.repeatEnd("Hello",1));
  }
}
