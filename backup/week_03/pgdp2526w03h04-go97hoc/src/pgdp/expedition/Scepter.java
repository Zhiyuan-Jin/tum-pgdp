package pgdp.expedition;

public class Scepter {
private static Scepter instance;
private Entdeckuin owner;

    public static Scepter getInstance() {
        return instance;
    }

    public static void setInstance(Scepter instance) {
        Scepter.instance = instance;
    }

    public Entdeckuin getOwner() {
        return owner;
    }

    public void setOwner(Entdeckuin owner) {
        this.owner = owner;
    }

    private Scepter(Entdeckuin owner) {
        this.owner = null;
    }
    @Override
    public String toString() {
        return "The scepter of submission belongs to " + owner + " now.";
    }
}
