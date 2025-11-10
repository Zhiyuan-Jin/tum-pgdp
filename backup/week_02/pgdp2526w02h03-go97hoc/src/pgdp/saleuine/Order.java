package pgdp.saleuine;

public class Order {

        private int amountCrustaceans;
        private int amountAnchovies;
        private int amountSardines;

        public Order(int amountCrustaceans, int amountAnchovies, int amountSardines) {
            this.amountCrustaceans = amountCrustaceans;
            this.amountAnchovies = amountAnchovies;
            this.amountSardines = amountSardines;
        }

    public int getAmountCrustaceans() {
        return amountCrustaceans;
    }

    public void setAmountCrustaceans(int amountCrustaceans) {
        this.amountCrustaceans = amountCrustaceans;
    }

    public int getAmountAnchovies() {
        return amountAnchovies;
    }

    public void setAmountAnchovies(int amountAnchovies) {
        this.amountAnchovies = amountAnchovies;
    }

    public int getAmountSardines() {
        return amountSardines;
    }

    public void setAmountSardines(int amountSardines) {
        this.amountSardines = amountSardines;
    }

    public void addOrder(Order order) {
        // TODO - Task "Order addToOrder"
        this.amountCrustaceans += order.amountCrustaceans;
        this.amountAnchovies += order.amountAnchovies;
        this.amountSardines += order.amountSardines;
    }

    @Override
    public String toString() {
        // TODO - Task "Order toString"
        return amountCrustaceans + " Krustentiere, " + amountAnchovies + " Sardellen und " + amountSardines + " Sardinen";
    }
}
