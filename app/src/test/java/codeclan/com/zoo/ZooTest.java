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
    Rhino rhino1;
    Rhino rhino2;
    ArrayList<Seal> seals;
    ArrayList<Rhino> rhinos;
    ArrayList<Enclosure> enclosures;

    @Before
    public void before(){
        seals = new ArrayList<Seal>();
        rhinos = new ArrayList<Rhino>();
        seal = new Seal(1200, 12);
        rhino1 = new Rhino(20000, 17);
        rhino2 = new Rhino(21000, 19);
        rhinoEnclosure = new Enclosure(rhinos);
        rhinoEnclosure.addAnimal(rhino1);
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

    @Test
    public void canRemoveEnclosure(){
        zoo.addEnclosure(sealEnclosure);
        zoo.addEnclosure(rhinoEnclosure);
        int expected = zoo.getNumOfEnclosures();
        assertEquals(expected, 2);
        zoo.removeEnclosure(rhinoEnclosure);
        int expected1 = zoo.getNumOfEnclosures();
        assertEquals(expected1, 1);

    }

    @Test
    public void canGetTotalNumOfAnimalsInEnclosures(){
        rhinoEnclosure.addAnimal(rhino1);
        rhinoEnclosure.addAnimal(rhino2);
        sealEnclosure.addAnimal(seal);
        zoo.addEnclosure(rhinoEnclosure);
        zoo.addEnclosure(sealEnclosure);
        int expected = zoo.getNumOfAnimalsInEnclosures();
        assertEquals(expected, 5);
    }

    @Test
    public void canSellAnimal(){
        zoo.addEnclosure(rhinoEnclosure);
        rhinoEnclosure.addAnimal(rhino2);
        System.out.println(zoo.getNumOfAnimalsInEnclosures());

        System.out.println("Cash before: " + zoo.getCash());
        zoo.sellAnimal(rhino1);
        System.out.println("Cash after: " + zoo.getCash());
        int actualCash = zoo.getCash();
        assertEquals(920000, actualCash);
        System.out.println(zoo.getNumOfAnimalsInEnclosures());
    }

}





