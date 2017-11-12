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
        rhino = new Rhino(13000, 76);
    }

    @Test
    public void canGetRhinoValue(){
       int actual = rhino.getCashValue();
        assertEquals(13000, actual);
    }

    @Test
    public void canGetRhinoId(){
        int actual = rhino.getId();
        assertEquals(76, actual);
    }
}
