package codeclan.com.zoo;

import android.support.v4.widget.TextViewCompat;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.zoo.Animals.Rhino;
import codeclan.com.zoo.Animals.Seal;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 12/11/2017.
 */


public class EnclosureTest {
    Enclosure<Rhino> rhinoEnclosure;
    Enclosure<Seal> sealEnclosure;
    Seal seal;
    Rhino rhino;
    ArrayList<Seal> seals;
    ArrayList<Rhino> rhinos;


    @Before
    public void before() {
        seals = new ArrayList<Seal>();
        rhinos = new ArrayList<Rhino>();
        seal = new Seal(700, 23);
        rhino = new Rhino(16000, 12);
        rhinoEnclosure = new Enclosure(rhinos);
        sealEnclosure = new Enclosure(seals);

    }

    @Test
    public void canAddAnimal() {
        sealEnclosure.addAnimal(seal);
        int expected = sealEnclosure.numOfAnimals();
        assertEquals(expected, 1);
    }

    @Test
    public void canDeleteAnimal(){
        rhinoEnclosure.addAnimal(rhino);
        rhinoEnclosure.addAnimal(rhino);
        int expected = rhinoEnclosure.numOfAnimals();
        assertEquals(expected, 2);
        rhinoEnclosure.removeAnimal(rhino);
        int expected2 = rhinoEnclosure.numOfAnimals();
        assertEquals(expected2, 1);

    }

    @Test
    public void canGetCashValueOfAnimals(){
        sealEnclosure.addAnimal(seal);
        sealEnclosure.addAnimal(seal);
        int expected = sealEnclosure.totalCashValue();
        assertEquals(expected, 1400);
    }


}