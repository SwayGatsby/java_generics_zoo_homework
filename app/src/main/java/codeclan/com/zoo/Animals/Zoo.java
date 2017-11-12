package codeclan.com.zoo.Animals;

import java.util.ArrayList;

import codeclan.com.zoo.Enclosure;

/**
 * Created by user on 12/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;
    private int cash;

    public Zoo(ArrayList enclosures, int cash){
        this.enclosures = enclosures;
        this.cash = cash;
    }


    public void addEnclosure(Enclosure enclosure){
        this.enclosures.add(enclosure);
    }

    public int getNumOfEnclosures() {
        return this.enclosures.size();
    }

    public int getNumOfAnimalsInEnclosures(){
        int animals = 0;
        for(Enclosure enclosure: enclosures){
            animals += enclosure.numOfAnimals();
        }
        return animals;
    }

    public void removeEnclosure(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }

    public void sellAnimal(Animal animal) {
        for (Enclosure enclosure : enclosures) {
            ArrayList<Animal> animalsList = enclosure.getAnimals();
            if (animalsList.contains(animal)){
                this.cash += animal.getCashValue();
                enclosure.removeAnimal(animal);
            } else {
                System.out.println("Animal cannot be found in zoo.");
            }
        }
    }

    public int getCash() {
        return cash;
    }
}


