package String02Test;

import String02.XyzMiddle;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class XyzMiddleTest {
  @Rule
  public TestName testName = new TestName();

  @Test
  public void sampleTest_one() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("AAxyzBB"));
  }

  @Test
  public void sampleTest_two() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("AxyzBB"));
  }

  @Test
  public void sampleTest_three() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertFalse(xm.xyzMiddle("AxyzBBB"));
  }

  @Test
  public void sampleTest_four() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("xyzAxyzBBB"));
  }

  @Test
  public void sampleTest_five() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("xyzAxyzBxyz"));
  }

  @Test
  public void sampleTest_six() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("xyzxyzAxyzBxyzxyz"));
  }

  @Test
  public void sampleTest_seven() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("xyzxyzxyzBxyzxyz"));
  }

  @Test
  public void sampleTest_eight() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertTrue(xm.xyzMiddle("xyzxyzAxyzxyzxyz"));
  }

  @Test
  public void sampleTest_nine() {
    XyzMiddle xm = new XyzMiddle();
    System.out.println(testName.getMethodName());
    Assert.assertFalse(xm.xyzMiddle("AxyzBBBB"));
  }
}
