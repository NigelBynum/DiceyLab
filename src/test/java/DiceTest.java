import java.util.HashMap;
import org.junit.Test;
import org.junit.Assert;
public class DiceTest {
    @Test
    public void tossAndSum() {
        Dice dice = new Dice(4);
       //Given
        boolean actual = false;
        boolean expected = true;

        //When
        int testVal = dice.tossAndSum();

        if(testVal>3 && testVal<100) {
            actual = true;
        }

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getRoll() {
        Dice dice = new Dice(1);
        //Given
        boolean actual = false;
        boolean expected = true;

        //When
        int testVal = dice.getRoll();

        if(testVal>0 && testVal<10) {
            actual = true;
        }

        //Then
        Assert.assertEquals(expected,actual);
    }
}