package pgdp.expedition;

public class Backpack {
    private Tool pickaxe;
    private Tool fishingRod;
    private Fish provisions;
    private Scepter scepter;

    public Tool getPickaxe() {
        return pickaxe;
    }

    public void setPickaxe(Tool pickaxe) {
        this.pickaxe = pickaxe;
    }

    public Tool getFishingRod() {
        return fishingRod;
    }

    public void setFishingRod(Tool fishingRod) {
        this.fishingRod = fishingRod;
    }

    public Fish getProvisions() {
        return provisions;
    }

    public void setProvisions(Fish provisions) {
        this.provisions = provisions;
    }

    public Scepter getScepter() {
        return scepter;
    }

    public void setScepter(Scepter scepter) {
        this.scepter = scepter;
    }

    public Backpack(String fishType, String fishPreparation) {
        this.provisions = new Fish(fishType, fishPreparation);
        this.pickaxe = new Tool("pickaxe");
        this.fishingRod = new Tool("fishing rod");
        this.scepter = null;
    }
}
