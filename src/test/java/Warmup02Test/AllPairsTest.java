package Warmup02Test;

import Warmup02.AllPairs;
import org.junit.Assert;
import org.junit.Test;

/*
 *   Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *   altPairs("kitten") → "kien"
 *   altPairs("Chocolate") → "Chole"
 *   altPairs("CodingHorror") → "Congrr"
 * */

public class AllPairsTest {
    @Test
    public void kittenTest() {
        AllPairs allPairs = new AllPairs();
        Assert.assertEquals("kien", allPairs.altPairs("Kitten"));
    }

    @Test
    public void ChocolateTest() {
        AllPairs allPairs = new AllPairs();
        Assert.assertEquals("Chole", allPairs.altPairs("Chocolate"));
    }

    @Test
    public void CodingHorrorTest() {
        AllPairs allPairs = new AllPairs();
        Assert.assertEquals("Congrr", allPairs.altPairs("CodingHorror"));
    }

}
