package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoo.Animals.Seal;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2017.
 */

public class SealTest {
    Seal seal;


    @Before
    public void before(){
    seal = new Seal(1500);}

    @Test
    public void canGetCashValue(){
        int expected = seal.getCashValue();
        assertEquals(expected, 1500);
    }
}
