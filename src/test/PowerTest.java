import org.junit.Test;
import powerpackage.PowerFinder;

public class PowerTest {
    @Test
    public void testOneRaiseToPowerOne() {
        assert PowerFinder.find(1, 1) == 1;
    }

    @Test
    public void testTwoRaiseToPowerOne() {
        assert PowerFinder.find(2, 1) == 2;
     }

    @Test
    public void testTwoRaiseToPowerTwo() {
        assert PowerFinder.find(2, 2) == 4;
    }

    @Test
    public void testThreeRaiseToPowerTwo() {
        assert PowerFinder.find(3, 2) == 9;
    }
}
