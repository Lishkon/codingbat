package String02Test;

import String02.RepeatFront;
import org.junit.Assert;
import org.junit.Test;

public class RepeatFrontTest {
  @Test
  public void sampleTest_one() {
    RepeatFront rf = new RepeatFront();
    Assert.assertEquals("ChocChoChC",rf.repeatFront("Chocolate", 4));
  }

  @Test
  public void sampleTest_two() {
    RepeatFront rf = new RepeatFront();
    Assert.assertEquals("ChoChC",rf.repeatFront("Chocolate", 3));
  }

  @Test
  public void sampleTest_three() {
    RepeatFront rf = new RepeatFront();
    Assert.assertEquals("IcI",rf.repeatFront("Ice Cream", 2));
  }

}
