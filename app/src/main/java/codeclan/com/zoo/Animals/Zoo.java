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
}



