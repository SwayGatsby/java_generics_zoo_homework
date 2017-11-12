package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.zoo.Animals.Rhino;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2017.
 */

public class RhinoTest {

    Rhino rhino;

    @Before
    public void before(){
        rhino = new Rhino(13000);
    }

    @Test
    public void canGetRhinoValue(){
       int expected = rhino.getCashValue();
        assertEquals(expected, 13000);
    }
}
