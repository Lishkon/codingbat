package Array02Test;

import Array02.TripleUp;
import org.junit.Assert;
import org.junit.Test;

public class TripleUpTest {
    @Test
    public void sampleTest() {
        TripleUp tu = new TripleUp();
        Assert.assertTrue(tu.tripleUp(new int[]{1, 4, 5, 6, 2}));
        Assert.assertTrue(tu.tripleUp(new int[]{1, 2, 3}));
        Assert.assertFalse(tu.tripleUp(new int[]{1, 3, 4}));

    }
}
