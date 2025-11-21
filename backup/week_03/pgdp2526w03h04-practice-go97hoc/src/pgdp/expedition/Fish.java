package pgdp.expedition;

public class Fish {
    private String type;
    private String preparation;
    private int amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Fish(String type, String preparation, int amount) {
        this.type = type;
        this.preparation = "fresh";
        this.amount = 1;
    }

    public Fish(String type, String preparation) {
        this.type = type;
        this.preparation = preparation;
        this.amount = 1;
    }
    @Override
    public String toString() {
        return preparation + " " + type;
    }
    public int add(Fish other) {
        this.amount += other.amount;
        return this.amount;
    }
    public int eat() {
        amount--;
        return amount;}
    public void prepare(String preparation) {
        this.preparation = preparation;
    }
}


