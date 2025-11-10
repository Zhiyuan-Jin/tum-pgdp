package pgdp.trains;

public class Carriage {
    private boolean isRestaurantCarriage;

    public Carriage(boolean isRestaurantCarriage) {
        this.isRestaurantCarriage = isRestaurantCarriage;
    }

    private int emptyWeight;

    public Carriage(boolean isRestaurantCarriage, int emptyWeight) {
        this.isRestaurantCarriage = isRestaurantCarriage;
        this.emptyWeight = emptyWeight;
        if (isRestaurantCarriage) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public Person[] passengers;

    public Person[] getPassengers() {
        return passengers;
    }

    public Carriage(int emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public void boardPeople(Person[] people) {
        int l = 0;
        Person[] newPeople = new Person[passengers.length + people.length];
        for (int i = 0; i < getPassengers().length; i++) {
            newPeople[i] = getPassengers()[i];
        }
        for (int j = getPassengers().length; j < newPeople.length; j++) {

            newPeople[j] = people[l];
            l++;
        }
        passengers = newPeople;
    }
}
