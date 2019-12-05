package Warmup02Test;

import Warmup02.AllPairs;
import Warmup02.StringYak;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class StringYakTest {
    /*
        stringYak("yakpak") → "pak"
        stringYak("pakyak") → "pak"
        stringYak("yak123ya") → "123ya"
     */
    @Test
    public void yakPakTest() {
        StringYak sy = new StringYak();
        Assert.assertEquals("pak", sy.stringYak("yakpak"));
    }

    @Test
    public void pakYakTest() {
        StringYak sy = new StringYak();
        Assert.assertEquals("pak", sy.stringYak("pakyak"));
    }

    @Test
    public void yak123yaTest() {
        StringYak sy = new StringYak();
        Assert.assertEquals("123ya", sy.stringYak("yak123ya"));
    }

    @Test
    @Ignore
    public void yakYakYakPakTest() {
        StringYak sy = new StringYak();
        Assert.assertEquals("Pak", sy.stringYak("yakYakYakPak"));
    }
}
