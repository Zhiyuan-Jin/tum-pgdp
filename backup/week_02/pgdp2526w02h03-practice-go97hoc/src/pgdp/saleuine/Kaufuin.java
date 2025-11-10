package pgdp.saleuine;

public class Kaufuin {
    private String name;
    private int age;
    private double money;
    private Order order;

    public Kaufuin(String name, int age, double money, Order order) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.order = order;
    }

    public Order getOrder() {
        // TODO - Task "Kaufuin Order-Methoden"
        return order;
    }

    public void giveNewOrder(Order newOrder) {
        // TODO - Task "Kaufuin Order-Methoden"
        this.order=newOrder;
    }

    public void addToOrder(Order additionalOrder) {
        // TODO - Task "Kaufuin Order-Methoden"
        order.addOrder(additionalOrder);
    }

    public String giveInformation() {
        // TODO - Task "Kaufuin giveInformation"
        return name + "(" + age + ") hätte gerne " +
                order.getAmountCrustaceans() + " Krustentiere, " +
                order.getAmountAnchovies() + " Sardellen und " +
                order.getAmountSardines() + " Sardinen.";
    }

    public void pay(double amount) {
        money-=amount;
        System.out.println(name + " zahlt " + amount + " und hat noch " + money + "PD übrig.");
        // TODO - Task "Kaufuin pay"
    }
}
