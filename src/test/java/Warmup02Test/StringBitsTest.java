package Warmup02Test;

import Warmup02.StringBits;
import org.junit.Assert;
import org.junit.Test;
/*
    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
 */
public class StringBitsTest {
    @Test
    public void helloTest() {
        StringBits sb = new StringBits();
        Assert.assertEquals("Hlo", sb.stringBits("Hello"));
    }

    @Test
    public void hiTest() {
        StringBits sb = new StringBits();
        Assert.assertEquals("H", sb.stringBits("Hi"));
    }

    @Test
    public void heeololeoTest() {
        StringBits sb = new StringBits();
        Assert.assertEquals("Hello", sb.stringBits("Heeololeo"));
    }

}
