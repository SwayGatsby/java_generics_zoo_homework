package codeclan.com.zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import codeclan.com.zoo.Animals.Animal;

/**
 * Created by user on 12/11/2017.
 */

public class Enclosure<T extends Animal> {
     public ArrayList<T> animals;

    public Enclosure(ArrayList<T> animals){
        this.animals = animals;
    }
}

