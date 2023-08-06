
import java.util.HashMap;
import org.junit.Test;
import org.junit.Assert;

public class BinsTest {
    @Test
    public void incrementBinTest1() {
        Bins results = new Bins(3,15);
        int expected = 2;
        results.incrementBin(15);
        results.incrementBin(15);
        int actual = results.getBin(15);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void incrementBinTest2() {
        Bins results = new Bins(3,115);
        int expected = 1;
        results.incrementBin(10);
        int actual = results.getBin(10);

        Assert.assertEquals(expected, actual);
}
    @Test
    public void getBinTest1() {
        Bins results = new Bins(3,15);
        int expected = 0;
        int actual = results.getBin(15);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getBinTest2() {
        Bins results = new Bins(3,15);
        int expected = 0;
        int actual = results.getBin(10);

        Assert.assertEquals(expected, actual);
    }

}