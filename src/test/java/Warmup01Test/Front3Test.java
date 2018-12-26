package Warmup01Test;

import Warmup01.Front3;
import org.junit.Assert;
import org.junit.Test;

//front3("Java") → "JavJavJav"
//front3("Chocolate") → "ChoChoCho"
//front3("abc") → "abcabcabc"

public class Front3Test {
    private Front3 f3 = new Front3();

    @Test
    public void abcTest() {
        Assert.assertEquals("abcabcabc", f3.front3("abc"));
    }

    @Test
    public void choTest() {
        Assert.assertEquals("ChoChoCho", f3.front3("Chocolate"));
    }

    @Test
    public void javTest() {
        Assert.assertEquals("JavJavJav", f3.front3("Java"));
    }
}
