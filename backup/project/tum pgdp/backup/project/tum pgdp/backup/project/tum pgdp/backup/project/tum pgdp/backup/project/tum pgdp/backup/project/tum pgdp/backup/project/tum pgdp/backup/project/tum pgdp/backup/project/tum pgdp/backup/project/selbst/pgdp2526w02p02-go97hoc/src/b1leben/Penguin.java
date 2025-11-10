package b1leben;

public class
Penguin {
    private int id;
    private String favouriteFish;

    public String getFavouriteFish() {
        return favouriteFish;
    }

    public void setFavouriteFish(String favouriteFish) {
        this.favouriteFish = favouriteFish;
    }


    public Penguin() {
    // Do not remove this constructor!
    // It might lead to your code not compiling in tests!
    // You CAN add code here if you want to.
    // Do not add any parameters to this constructor!
    // You CAN add another constructor with parameters if you like
    }

    public Egg mate(Penguin other) {
        // TODO
        return null;
    }

    public int getId() {
        return id;
    }

    public boolean isParentOf(Penguin child) {
        // TODO
        return false;
    }

    public boolean isChildOf(Penguin parent) {
        // TODO
        return false;
    }

    public boolean isSiblingOf(Penguin other) {
        // TODO
        return false;
    }

    public boolean isGrandParentOf(Penguin grandChild) {
        // TODO
        return false;
    }

    public Huddle getHuddle() {
        // TODO
        return null;
    }

    public void joinHuddle() {
        // TODO
    }

    public void leaveHuddle() {
        // TODO
    }
}
