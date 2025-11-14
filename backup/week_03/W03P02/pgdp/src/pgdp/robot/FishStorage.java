package pgdp.robot;

import static pgdp.PinguLib.write;

//TODO: Implement the class according to the UML on Artemis.
public class FishStorage {

    //TODO 2.0: Implement the constructor and set the attributes.

    //TODO 2.1: Implement the methods 'storeFish' and 'emptyFish'.
private int numberOfFish;

    public int getNumberOfFish() {
        return numberOfFish;
    }

    public void setNumberOfFish(int numberOfFish) {
        this.numberOfFish = numberOfFish;
    }

    public FishStorage(int numberOfFish) {
        this.numberOfFish = numberOfFish;
    }

}
