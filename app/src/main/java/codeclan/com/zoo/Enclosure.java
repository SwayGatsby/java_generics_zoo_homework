package codeclan.com.zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import codeclan.com.zoo.Animals.Animal;
import codeclan.com.zoo.Animals.Rhino;
import codeclan.com.zoo.Animals.Seal;

/**
 * Created by user on 12/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> animals;

    public Enclosure(ArrayList<T> animals) {
        this.animals = animals;
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    public int numOfAnimals() {
        return this.animals.size();
    }

    public void removeAnimal(T animal) {
        this.animals.remove(animal);
    }

    public int totalCashValue() {
        int value = 0;
        for(Animal animal: animals){
            value += animal.getCashValue();
        }
        return value;
    }
}


