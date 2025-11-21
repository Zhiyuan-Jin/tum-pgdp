package pgdp.expedition;

public class Tool {
    private String type;
    private double durability;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDurability() {
        return durability;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public Tool(String type, double durability) {
        this.type = type;
        this.durability = 100.0;
    }

    public Tool(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " with " + durability + " points of durability";
    }
    public double use() {
        durability--;
        return durability;
    }
}
