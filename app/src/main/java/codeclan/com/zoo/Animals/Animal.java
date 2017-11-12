package codeclan.com.zoo.Animals;

/**
 * Created by user on 12/11/2017.
 */

public abstract class Animal {
    private int cashValue;
    private int id;

    public Animal(int cashValue, int id){
    this.cashValue = cashValue;
    this.id = id;
    }

    public int getCashValue(){
        return this.cashValue;
    }

    public int getId(){
        return this.id;
    }
}


