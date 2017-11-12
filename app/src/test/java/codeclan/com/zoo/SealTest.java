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
    seal = new Seal(1500, 98);}

    @Test
    public void canGetCashValue(){
        int actual = seal.getCashValue();
        assertEquals(1500, actual);
    }

    @Test
    public void canGetId(){
        int actual = seal.getId();
        assertEquals(98, actual);
    }
}
