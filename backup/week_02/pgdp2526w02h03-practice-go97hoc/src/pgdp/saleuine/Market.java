package pgdp.saleuine;

public class Market {
    private double priceCrustaceans;
    private double priceAnchovies;
    private double priceSardines;

    private int soldCrustaceansDay;
    private int soldAnchoviesDay;
    private int soldSardinesDay;

    private int daysInBusiness;
    private double moneyMadeDay;
    private double moneyMadeTotal;

    public Market(double priceCrustaceans, double priceAnchovies, double priceSardines, int soldCrustaceansDay, int soldAnchoviesDay, int soldSardinesDay, int daysInBusiness, double moneyMadeDay, double moneyMadeTotal) {
        this.priceCrustaceans = priceCrustaceans;
        this.priceAnchovies = priceAnchovies;
        this.priceSardines = priceSardines;
        this.soldCrustaceansDay = soldCrustaceansDay;
        this.soldAnchoviesDay = soldAnchoviesDay;
        this.soldSardinesDay = soldSardinesDay;
        this.daysInBusiness = daysInBusiness;
        this.moneyMadeDay = moneyMadeDay;
        this.moneyMadeTotal = moneyMadeTotal;
    }

    public void serveCustomer(Kaufuin customer) {
        // TODO - Task "Market serveCustomer"
    }

    public void endDay() {
        // TODO - Task "Market endDay"
    }

    public static void main(String[] args) {
        // Example from task description. You may change the content of this method to test your code

        // remove '//' from line start to comment the line in -> it will be compiled and executed.
        // in eclipse on windows you can mark all lines and press STRG+Shift+c to toggle comments on/off

        //		Market market = new Market(1.99, 9.99, 100);
        //
        //		Order jessiesOrder = new Order(5, 6, 7);
        //		Kaufuin jessie = new Kaufuin("Jessie", 19, 1337, jessiesOrder);
        //
        //		market.serveCustomer(jessie);
        //		market.endDay();
    }

}
