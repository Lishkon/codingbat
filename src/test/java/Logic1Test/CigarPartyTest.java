package Logic1Test;

import Logic1.CigarParty;
import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {
    /*
     * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the
     * number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper
     * bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
     *
     *             cigarParty(30, false) → false
     *             cigarParty(50, false) → true
     *             cigarParty(70, true) → true
     */
    @Test
    public void notWeekEnd30() {
        CigarParty cp = new CigarParty();
        Assert.assertFalse(cp.cigarParty(30, false));
    }

    @Test
    public void notWeekEnd30true() {
        CigarParty cp = new CigarParty();
        Assert.assertFalse(cp.cigarParty(30, true));
    }

    @Test
    public void notWeekEnd50() {
        CigarParty cp = new CigarParty();
        Assert.assertTrue(cp.cigarParty(50, false));
    }

    @Test
    public void WeekEnd70() {
        CigarParty cp = new CigarParty();
        Assert.assertTrue(cp.cigarParty(70, true));
    }

    @Test
    public void WeekEnd50() {
        CigarParty cp = new CigarParty();
        Assert.assertTrue(cp.cigarParty(50, true));
    }

    @Test
    public void WeekEnd40false() {
        CigarParty cp = new CigarParty();
        Assert.assertTrue(cp.cigarParty(40, false));
    }

    @Test
    public void WeekEnd40true() {
        CigarParty cp = new CigarParty();
        Assert.assertTrue(cp.cigarParty(40, true));
    }

}
