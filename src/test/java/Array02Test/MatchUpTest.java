package Array02Test;

import Array02.MatchUp;
import org.junit.Assert;
import org.junit.Test;

public class MatchUpTest {
    /*
        matchUp([1, 2, 3], [2, 3, 10]) → 2
        matchUp([1, 2, 3], [2, 3, 5]) → 3
        matchUp([1, 2, 3], [2, 3, 3]) → 2
    */
    @Test
    public void sampleTest() {
        MatchUp mu = new MatchUp();
        Assert.assertEquals(2, mu.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        Assert.assertEquals(3, mu.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        Assert.assertEquals(2, mu.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}
