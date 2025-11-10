package pgdp.trains;

public class Locomotive {
    private  int emptyWeight;
    private Person driver;

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Locomotive(int emptyWeight, Person driver) {
        this.emptyWeight = emptyWeight;
        this.driver= driver;
    }
}
