package codeclan.com.zoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.zoo.Animals.Animal;
import codeclan.com.zoo.Animals.Rhino;
import codeclan.com.zoo.Animals.Seal;
import codeclan.com.zoo.Animals.Zoo;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/11/2017.
 */

public class ZooTest {
    Zoo zoo;
    Enclosure<Rhino> rhinoEnclosure;
    Enclosure<Seal> sealEnclosure;
    Seal seal;
    Rhino rhino;
    ArrayList<Seal> seals;
    ArrayList<Rhino> rhinos;
    ArrayList<Enclosure> enclosures;

    @Before
    public void before(){
        seals = new ArrayList<Seal>();
        rhinos = new ArrayList<Rhino>();
        seal = new Seal(1200);
        rhino = new Rhino(20000);
        rhinoEnclosure = new Enclosure(rhinos);
        rhinoEnclosure.addAnimal(rhino);
        sealEnclosure = new Enclosure(seals);
        sealEnclosure.addAnimal(seal);
        enclosures = new ArrayList<Enclosure>();
        zoo = new Zoo(enclosures, 900000);
    }

    @Test
    public void canAddEnclosure(){
        zoo.addEnclosure(sealEnclosure);
        int expected = zoo.getNumOfEnclosures();
        assertEquals(expected, 1);
    }

}
